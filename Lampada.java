/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula0901;

/**
 *
 * @author ifsp
 */
public class Lampada {//isso eh uma nova classe
    
    //atirubtos da classe 
    public String marca;
    public int potencia;
    private boolean status;// mudamos de publico para privado,agora nao consigo alterar no extraclasse
    //metodos da classe
    public void statusLampada(){
        String msg = "A lampada " + marca + "esta ";
        if (status){
            System.out.println(msg + " ligada");
        }
            else {
            System.out.println(msg + " desligada");
        }
    }
    
    public void ligar(){ // eu crio esse metodo para conseguir alterar o estado da lampada, ja que eu deixei privado
    
    if(!status)
    {
        status= true;
        System.out.println("A lampada " + marca + " foi ligada");
    }
    else{
        
        System.out.println("A lampada " + marca + " jah estah ligada");
    }
    }
    
   public void desligar(){ // eu crio esse metodo para conseguir alterar o estado da lampada, ja que eu deixei privado
    
    if(status)
    {
        status= false;
        System.out.println("A lampada " + marca + " foi desligada");
    }
    else{
        
        System.out.println("A lampada " + marca + " jah estah desligada");
    }
    }
}
