from django.db import models
from django.contrib.auth.models import User
from datetime import datetime
from django.utils import timezone

#
# MODELOS DE BUENOS AIRES
#
    
class PerfilUsuario(models.Model):
    user = models.OneToOneField(User, on_delete=models.CASCADE)
    rut = models.CharField(primary_key=True, max_length=20)
    tipousu = models.CharField(max_length=50, null=False, blank=False)
    nomusu = models.CharField(max_length=100, null=False, blank=False)
    apeusu = models.CharField(max_length=100, null=False, blank=False)
    correo = models.CharField(max_length=100, null=False, blank=False)
    dirusu = models.CharField(max_length=300, null=False, blank=False)
    pwd = models.CharField(max_length=50, null=False, blank=False)
    
    class Meta:
        db_table = 'PerfilUsuario'

    def __str__(self):
        return f'{self.rut} - {self.nomusu} {self.apeusu}'
    

class Producto(models.Model):
    idprod = models.IntegerField(primary_key=True)
    nomprod = models.CharField(max_length=100, null=False, blank=False)
    descprod = models.CharField(max_length=300, null=False, blank=False)
    precio = models.IntegerField(null=False, blank=False)
    imagen = models.ImageField(upload_to="images/", default="sinfoto.jpg", null=False, blank=False, verbose_name="Imagen")

    class Meta:
        db_table = 'Producto'
    
    def __str__(self):
        return f'{self.idprod} - {self.nomprod}'

class Factura(models.Model):
    nrofac = models.IntegerField(primary_key=True)
    rutcli = models.ForeignKey(PerfilUsuario, models.DO_NOTHING, db_column='rutcli', null=False, blank=False)
    idprod = models.ForeignKey(Producto, models.DO_NOTHING, db_column='idprod', null=False, blank=False)
    fechafac = models.DateField(null=False, blank=False)
    descfac = models.CharField(max_length=300, null=False, blank=False)
    monto = models.IntegerField(null=False, blank=False)

    class Meta:
        db_table = 'Factura'
    
    def __str__(self):
        return f'{self.nrofac} - {self.rutcli.nomusu} {self.rutcli.apeusu} - {self.idprod.nomprod}'

class SolicitudServicio(models.Model):
    class TipoSolicitud(models.TextChoices):
        INSTALACION = "1", "Instalación"
        MANTENCION = "2", "Mantención"
        REPARACION = "3", "Reparación"
    precio = models.IntegerField(default=25000)
    nrosol = models.IntegerField(primary_key=True)
    nrofac = models.ForeignKey(Factura, models.DO_NOTHING, db_column='nrofac', null=True, blank=False)
    tiposol = models.CharField(max_length=1, choices=TipoSolicitud.choices, default=TipoSolicitud.MANTENCION, verbose_name="Tipo de Solicitud")
    fechavisita = models.DateField(null=False, blank=False)
    ruttec = models.ForeignKey(PerfilUsuario, models.DO_NOTHING, db_column='ruttec', null=True, blank=False)
    descsol = models.TextField(max_length=200, null=False, blank=False)
    estadosol = models.CharField(max_length=50, null=False, blank=False)
    horavisita = models.DateTimeField(default=timezone.now, verbose_name="hora de visita")

    class Meta:
        db_table = 'SolicitudServicio'
    
    def __str__(self):
        clave = f'{self.nrosol} - {self.tiposol} - Técnico ({self.ruttec.nomusu} {self.ruttec.apeusu})'
        clave += f' - Cliente ({self.nrofac.rutcli.nomusu} {self.nrofac.rutcli.apeusu}) Factura({self.nrofac})'
        return clave


class GuiaDespacho(models.Model):
    nrogd = models.IntegerField(primary_key=True)
    nrofac = models.ForeignKey(Factura, models.DO_NOTHING, db_column='nrofac', null=False, blank=False)
    idprod = models.ForeignKey(Producto, models.DO_NOTHING, db_column='idprod', null=False, blank=False)
    estadogd = models.CharField(max_length=50, null=False, blank=False)

    class Meta:
        db_table = 'GuiaDespacho'

    def __str__(self):
        clave = f'{self.nrogd} - Cliente ({self.nrofac.rutcli.nomusu} {self.nrofac.rutcli.apeusu})'
        clave += f' -  Factura({self.nrofac}, {self.nrofac.idprod.nomprod})'
        return clave

class StockProducto(models.Model):
    idstock = models.IntegerField(primary_key=True)
    idprod = models.ForeignKey(Producto, models.DO_NOTHING, db_column='idprod', null=False, blank=False)
    nrofac = models.ForeignKey(Factura, models.DO_NOTHING, db_column='nrofac', blank=True, null=True)

    class Meta:
        db_table = 'StockProducto'
    
    def __str__(self):
        clave = f'{self.id} - Cliente ({self.nrofac.rutcli.nomusu} {self.nrofac.rutcli.apeusu})'
        clave += f' -  Factura({self.nrofac}, {self.nrofac.idprod.nomprod})'
        return clave
    
    class AnwoListaProducto(models.Model):
        nroserieanwo = models.CharField(primary_key=True, max_length=100)
        nomprodanwo = models.CharField(max_length=100, null=False, blank=False)
        precioanwo = models.IntegerField(null=False, blank=False)
        reservadoba = models.CharField(max_length=1, null=False, blank=False)

        class Meta:
            db_table = 'AnwoListaProducto'
            
        def __str__(self):
            return f'{self.nroserieanwo} - {self.nomprodanwo}'