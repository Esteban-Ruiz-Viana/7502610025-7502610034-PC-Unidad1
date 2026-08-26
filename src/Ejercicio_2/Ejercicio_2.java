package Ejercicio_2;

public class Ejercicio_2 {

    public static void main (String [] args){

        //Probando constructor con parametros
        Estudiante es1 =  new Estudiante(18, "Esteban");
        es1.detallesEstudiante();

        //Separador
        System.out.println("------------------------------------------------------");

        //Utilizando el constructor por defecto
        Estudiante es2 =  new Estudiante();
        es2.detallesEstudiante();

    }
}
