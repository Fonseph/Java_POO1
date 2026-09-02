/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula0901;

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
        lampadaSala.marca = "Philips"; // esses sao os atributos
        lampadaSala.potencia = 30; // potencia  
        lampadaSala.statusLampada();
        lampadaSala.ligar();
        lampadaSala.desligar();
        lampadaSala.statusLampada();
        lampadaSala.ligar();
        lampadaSala.desligar();
        //os objetos possuem um estado , ou seja naquele tempo 
        
        
        Lampada lampadaQuarto = new Lampada();
        lampadaQuarto.marca = "Elgin"; 
        lampadaQuarto.potencia = 15; // potencia
        lampadaQuarto.statusLampada();
        lampadaQuarto.ligar();
        lampadaQuarto.desligar();
        
       
    }
    
}
