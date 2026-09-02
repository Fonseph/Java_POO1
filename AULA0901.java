/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula0901;
import java.util.Scanner;
/**
 *
 * @author ifsp
 */
public class AULA0901 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {// esse eh um objeto da classe lampada
        
        // TODO code application logic here
        
        Lampada lampadaSala = new Lampada();
        lampadaSala.marca = "Philips "; // esses sao os atributos
        lampadaSala.potencia = 30; // potencia  
        lampadaSala.statusLampada();
        lampadaSala.ligar();
        lampadaSala.desligar();
         lampadaSala.ligar();
       
        
        //os objetos possuem um estado , ou seja naquele tempo 
        
      
        Lampada lampadaQuarto = new Lampada();
        lampadaQuarto.marca = "Elgin "; 
        lampadaQuarto.potencia = 15; // potencia
      //  lampadaQuarto.statusLampada();
      //  lampadaQuarto.statusLampada();
        
        for (int i=1; i<=6; i++)
        {
         lampadaQuarto.ligar();
         lampadaQuarto.desligar();
        
        }
        
       Pessoa p = new Pessoa("James");
       p.imprimirNome();
       
       Carro meu = new Carro("Honda","Civic type R");
      while(meu.odometro<9999){
           System.out.println("Informe a distancia percorrida em KM: ");
            Scanner scan = new Scanner(System.in);
            double distancia = scan.nextDouble();
       meu.Andar(distancia);
       meu.visualizarOdometro();
      }
      }
}
