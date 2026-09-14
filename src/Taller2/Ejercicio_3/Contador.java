package Taller2.Ejercicio_3;

public class Contador {

    private int valor;

    public Contador(int valor){
        this.valor = valor;
    }

    // Metodo static que intenta usar "this", llevando a un error de compilacion

    public static void mostrarValorMal(){
        // System.out.println("Valor: " + this.valor);

    }

    //Version Corregida

    public void mostrarValorBien(){
        System.out.println("Valor: " + this.valor);

    }
}