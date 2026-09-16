/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula1509;

/**
 *
 * @author ifsp
 */
public class Aula1509 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Conta c1 = new Conta("001-01","1234-5");
        Conta c2 = new Conta("002-02","1234-5");
        c1.depositar(100);
        c1.depositar(37);
        c1.transferir(10,c2);
        c1.sacar(50);
        c1.sacar(100);
        System.out.println(c1.exibirExtrato());
         System.out.println(c2.exibirExtrato());
        
    }
    
}
