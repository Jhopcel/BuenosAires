package BuenosAires.Model;

import java.util.ArrayList;

public class ProductoLista extends ArrayList<Producto> {
 
    @Override
    public String toString() {
        String s = "";
        for (Producto prod:this) {
            s += prod.toString() + "\n"; 
        }
        return s;
    }
}

