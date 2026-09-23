/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gabrielfsavio;

/**
 *
 * @author ifsp
 */
public class Funcionario {
    
   private String nome;
   private String cargo;
   private double salarioBruto;
    
    
 public Funcionario(String nome) {
     this.nome = nome;
     this.cargo= cargo;
     this.salarioBruto = salarioBruto;
 }
public void SalarioLiquido(double salarioBruto){
double liquido;
if(salarioBruto < 2000){
liquido = salarioBruto;
 System.out.println("Salario liquido=  " + liquido);

}
else if (salarioBruto>= 2000 && salarioBruto<= 4000)
{
liquido = salarioBruto * 0.875;
    System.out.println("Salario liquido=  " + liquido);
}
else 
{
liquido = salarioBruto * 0.725;
 System.out.println("Salario liquido=  " + liquido);

}

}

}
