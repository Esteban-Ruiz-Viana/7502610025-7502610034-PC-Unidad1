package Ejercicio1;

public class Carro {
    private String marca;
    private String modelo;
    static int contadorCarros = 0; // atributo estático, compartido por todos los carros

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCarros++; // se incrementa cada vez que se crea un objeto
    }

    public static void mostrarContadorCarros() {
        System.out.println("Carros creados: " + contadorCarros);
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
}