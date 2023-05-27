from django.contrib import admin
from .models import Producto, PerfilUsuario, SolicitudServicio

# Register your models here.

admin.site.register(Producto)
admin.site.register(PerfilUsuario)
admin.site.register(SolicitudServicio)