from django.db import models
from django.contrib.auth.models import User

class PerfilUsuario(models.Model):
    TIPOUSU_CHOICES = [
        ('Cliente', 'Cliente'),
        ('Técnico', 'Técnico'),
        ('Bodeguero', 'Bodeguero'),
        ('Administrador', 'Administrador'),
        ('Superusuario', 'Superusuario'),
    ]
    user = models.OneToOneField(User, on_delete=models.CASCADE)
    rut = models.CharField(primary_key=True, max_length=20)
    tipousu = models.CharField(choices=TIPOUSU_CHOICES, max_length=50, null=False, blank=False)
    dirusu = models.CharField(max_length=300, null=False, blank=False)
    
    class Meta:
        db_table = 'PerfilUsuario'

    def __str__(self):
        return f'{self.rut} - {self.nomusu} {self.apeusu}'

class Producto(models.Model):
    idprod = models.IntegerField(primary_key=True, verbose_name='ID Prod')
    nomprod = models.CharField(max_length=100, null=False, blank=False, verbose_name='Nombre')
    descprod = models.CharField(max_length=300, null=False, blank=False, verbose_name='Descripción')
    precio = models.IntegerField(null=False, blank=False, verbose_name='Precio')
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
    TIPOSOL_CHOICES = [
        ('Instalación', 'Instalación'),
        ('Mantención', 'Mantención'),
        ('Reparación', 'Reparación'),
    ]
    ESTADOSOL_CHOICES = [
        ('Aceptada', 'Aceptada'),
        ('Modificada', 'Modificada'),
        ('Cerrada', 'Cerrada'),
        ('Anulada', 'Anulada'),
    ]
    nrosol = models.IntegerField(primary_key=True)
    nrofac = models.ForeignKey(Factura, models.DO_NOTHING, db_column='nrofac', null=False, blank=False)
    tiposol = models.CharField(choices=TIPOSOL_CHOICES, max_length=50, null=False, blank=False)
    fechavisita = models.DateField(null=False, blank=False)
    ruttec = models.ForeignKey(PerfilUsuario, models.DO_NOTHING, db_column='ruttec', null=False, blank=False)
    descsol = models.CharField(max_length=200, null=False, blank=False)
    estadosol = models.CharField(choices=ESTADOSOL_CHOICES, max_length=50, null=False, blank=False)

    class Meta:
        db_table = 'SolicitudServicio'
    
    def __str__(self):
        clave = f'{self.nrosol} - {self.tiposol} - Técnico ({self.ruttec.nomusu} {self.ruttec.apeusu})'
        clave += f' - Cliente ({self.nrofac.rutcli.nomusu} {self.nrofac.rutcli.apeusu}) Factura({self.nrofac})'
        return clave

class GuiaDespacho(models.Model):
    ESTADOGD_CHOICES = [
        ('En bodega', 'En bodega'),
        ('Despachado', 'Despachado'),
        ('Entregado', 'Entregado'),
    ]
    nrogd = models.IntegerField(primary_key=True)
    nrofac = models.ForeignKey(Factura, models.DO_NOTHING, db_column='nrofac', null=False, blank=False)
    idprod = models.ForeignKey(Producto, models.DO_NOTHING, db_column='idprod', null=False, blank=False)
    estadogd = models.CharField(choices=ESTADOGD_CHOICES, max_length=50, null=False, blank=False)

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
    RESERVADOBA_CHOICES = [
        ('S', 'Reservado'),
        ('N', 'No reservado'),
    ]
    nroserieanwo = models.CharField(primary_key=True, max_length=100)
    nomprodanwo = models.CharField(max_length=100, null=False, blank=False)
    precioanwo = models.IntegerField(null=False, blank=False)
    reservadoba = models.CharField(choices=RESERVADOBA_CHOICES, max_length=1, null=False, blank=False)

    class Meta:
        db_table = 'AnwoListaProducto'
        
    def __str__(self):
        return f'{self.nroserieanwo} - {self.nomprodanwo}'