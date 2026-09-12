package Ejercicio_1;

public class Producto {

        private String  nombre;
        private double precio;

        public Producto( String Nombre, Double Precio ){
            this.nombre = Nombre;
            this.precio = Precio;

        }

        public void mostrarProducto() {

            System.out.println("Producto: " + nombre + "\nPrecio: " + this.precio);

        }
    }