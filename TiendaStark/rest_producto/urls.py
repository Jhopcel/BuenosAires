from django.urls import path
from django.contrib import admin
from .views import Producto_create, Producto_read, Producto_read_all
from .views import Producto_update, Producto_delete, login, productos_bodega_leer_todos

urlpatterns = [
    path('Producto_create/', Producto_create.as_view(), name="Producto_create"),
    path('Producto_update/', Producto_update.as_view(), name="Producto_update"),
    path('Producto_read/<id>/', Producto_read, name="Producto_read"),
    path('Producto_read_all/', Producto_read_all, name='Producto_read_all'),
    path('Producto_delete/<id>/', Producto_delete, name="Producto_delete"),
    path('login', login, name='login'),
    path('productos_bodega_leer_todos/', productos_bodega_leer_todos, name="productos_bodega_leer_todos"),
]
