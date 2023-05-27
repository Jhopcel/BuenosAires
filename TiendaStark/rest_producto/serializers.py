from rest_framework import serializers
from core.models import Producto, StockProducto

class ProductoSerializer(serializers.ModelSerializer):
    class Meta:
        model = Producto, StockProducto
        fields = ['idprod', 'nomprod', 'descprod', 'precio', 'imagen']
        
class StockProductoSerializer(serializers.ModelSerializer):
    class Meta:
        model = StockProducto
        fields = [
            'idstock', 
            'idprod', 
            'nrofac', 
        ]