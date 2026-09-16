/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula1509;

/**
 *
 * @author ifsp
 */
public class Conta {
    private String agencia;
    private String numeroConta;
    private double saldo;
    private String extrato;
   
    
   public Conta(String agencia, String numeroConta)
   {
   this.agencia = agencia;
   this.numeroConta = numeroConta;
   this.saldo = 0;
   this.extrato = "";
   
   
   }
   //tipo pode ser entrada ou saída
   private void salvarOperacaoExtrato(String msg, String tipo)
   {
   String tipoSinal = tipo.equals("Entrada")
           ?"+"
           :"-";
   this.extrato += tipoSinal + " " + msg + "\n";
   }
   
   public void depositar(double deposito)
   {
       this.saldo += deposito; 
       salvarOperacaoExtrato("Deposito de " + deposito + " reais","Entrada");
   }
   
   public String exibirExtrato()
   {
   String extratoCompleto = "***Extrato***\n-----------\n";
   extratoCompleto += this.extrato;
   extratoCompleto +="------------\n";
   extratoCompleto += "Saldo " + this.saldo + " reais \n";
   extratoCompleto +="------------\n";
   return extratoCompleto;
   }
   
   public void transferir(double transferencia,Conta recebe)        
   {
       
       
       if(saldo<transferencia){
           System.out.println("\nVoce nao tem saldo suficiente para realizar essa transacao");
       }
       else{
       this.saldo-= transferencia;
       recebe.depositar(transferencia);
       salvarOperacaoExtrato("Transferencia de " + transferencia + " reais","Saida");
       
       }
   }
   
   public void sacar (double saque)
   {
       if(saldo<saque){
           System.out.println("\nVoce nao tem saldo suficiente para realizar essa transacao");
       }
       else{
   this.saldo-= saque;
   salvarOperacaoExtrato("Saque de " + saque + " reais","Saida");
         }      
   }
  
   }

