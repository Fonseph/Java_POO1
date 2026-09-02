/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula0901;
import java.util.Scanner;

/**
 *
 * @author ifsp
 */
public class Carro {
    
    public String marca;
    public String modelo;
    public double odometro;
    double leitor= 1;
    
public Carro(String marca, String modelo)
    {
         this.marca= marca;
        odometro =0;
        this.modelo= modelo;
    }

public void Andar(double distancia){

            odometro += distancia;
            leitor=0;
}

public void visualizarOdometro(){
    System.out.println(marca);
    System.out.println(modelo);
    System.out.println(odometro);
}
}