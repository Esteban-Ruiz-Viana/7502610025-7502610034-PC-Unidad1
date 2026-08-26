package Ejercicio_2;

public class Estudiante {

    private int edad;
    private String nombre;

    public Estudiante(int edad, String nombre){

        this.edad = edad;
        this.nombre = nombre;

    }

    public void detallesEstudiante() {

        System.out.println("Nombre: " + this.nombre + "\nEdad: " + this.edad);

    }

    public Estudiante() {

        this(0, "Sin Nombre");

    }
}
