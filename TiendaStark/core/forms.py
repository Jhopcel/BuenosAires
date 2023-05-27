from django import forms
from django.forms import ModelForm, fields, Form
from django.contrib.auth.models import User
from django.contrib.auth.forms import UserCreationForm
from .models import Producto, PerfilUsuario, SolicitudServicio

class ProductoForm(ModelForm):
    class Meta:
        model = Producto
        fields = ['idprod', 'nomprod', 'descprod', 'precio', 'imagen']

class IniciarSesionForm(Form):
    username = forms.CharField(widget=forms.TextInput(), label="Correo")
    password = forms.CharField(widget=forms.PasswordInput(), label="Contraseña")
    class Meta:
        fields = ['username', 'password']
  
class RegistrarUsuarioForm(UserCreationForm):
    rut = forms.CharField(max_length=80, required=True, label="Rut")
    dirusu = forms.CharField(max_length=300, required=True, label="Dirección")
    class Meta:
        model = User
        fields = ['username', 'first_name', 'last_name', 'email', 'rut', 
                'dirusu']

class PerfilUsuarioForm(Form):
    first_name = forms.CharField(max_length=150, required=True, label="Nombres")
    last_name = forms.CharField(max_length=150, required=True, label="Apellidos")
    email = forms.CharField(max_length=254, required=True, label="Correo")
    rut = forms.CharField(max_length=80, required=False, label="Rut")
    dirusu = forms.CharField(max_length=300, required=True, label="Dirección")

    class Meta:
        fields = '__all__'
        

class SolicitudServicioForm(ModelForm):
    class Meta:
        model = SolicitudServicio
        fields = ['nrosol','precio','tiposol','descsol','fechavisita','horavisita']
        widgets = {'precio': forms.TextInput(attrs={'readonly': 'readonly'})}
