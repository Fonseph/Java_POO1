/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gabrielfsavio;

/**
 *
 * @author ifsp
 */
public class produto {
    
 public String nome;
 public double valor;
 private int estoque;
 
 public produto(String nome,double valor){
this.nome=nome;
this.valor=valor;
this. estoque=0;

}
 public void addEstoque(int quantidade) {
estoque += quantidade;
}
 public void retirarEstoque (int quantidade)
 {
     if(quantidade<estoque){
         estoque -= quantidade; 
     }
     else{
         System.out.println("\nQuantidade invalido!");
     }
 }
     public String imprimirProduto()
     {
         String imprimir = "*** Estoque ***\n";
        imprimir += "--------\n";
        imprimir += "Produto: " + this.nome + "\n";
        imprimir += "Valor: " + this.valor + "\n";
        imprimir += "Estoque: " + this.estoque + "\n";
       
     return imprimir;
     
     }
   
}
