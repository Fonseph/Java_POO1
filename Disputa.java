/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gabrielfsavio;

/**
 *
 * @author ifsp
 */
 public class Disputa {
            
       public String disputa;
        
             public Disputa(String disputa)
    {
        this.disputa= disputa;
    }
            public void realizarDisputa(CartaPokemon cp1,CartaPokemon cp2){
                if(cp1.ataque>cp2.defesa){
                    System.out.println("Na disputa"+ disputa +" a carta "+ cp1.nome + " Venceu!");
                }
                else{
                    System.out.println("Na disputa"+ disputa +" a carta "+ cp2.nome + " Venceu!");
                }
            
                
            }
            
}
