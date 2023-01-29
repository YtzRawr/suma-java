/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author matia
 */
public class coche {

    public int puertas = 0;

    public static void main(String[] args) {
        //obj miCoche
        coche miCoche = new coche();
        //se suma una puerta
        miCoche.IncrementonumeroPuertas();
        //Se suma una 2da puerta
        miCoche.IncrementonumeroPuertas();
        //se imprime
        System.out.println(miCoche.puertas);

    }

    public void IncrementonumeroPuertas() {
        //funcion que permite el incremento de las puertas del coche
        this.puertas++;

    }
}
