/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gabrielfsavio;

/**
 *
 * @author ifsp
 */
public class ArCondicionado {
    
   private boolean ligado;
   private double temperaturaAtual;
   
    public ArCondicionado()
    {
        this.ligado= false;
        this.temperaturaAtual= 20;

    }

    public void ligar()
    {
        ligado= true;
    
    }
    public void desligar()
    {
        ligado= false;
    }

    

    public void aumentarTemperatura()
    {
        if(ligado== true)
        {
        
            if(temperaturaAtual<25)
            {
             temperaturaAtual+=1;
            }
            else{
                System.out.println("Maximo atingido");

            }
        }
    }
    
    public void diminuirTemperatura()
    {
        if(ligado== true)
        {
            if(temperaturaAtual>16)
            {
             temperaturaAtual-=1;
            }
            else{
           System.out.println("Minimo atingido");
            }
        }
   }
    
    public void exibirTemperatura()
    {
        System.out.println("Temperatura: " + temperaturaAtual + " graus Celsius");
    }
}
