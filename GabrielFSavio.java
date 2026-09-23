/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gabrielfsavio;

/**
 *
 * @author ifsp
 */
public class GabrielFSavio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Ex. 1 
        Funcionario melhorFuncionario = new Funcionario("Savio");
        melhorFuncionario.SalarioLiquido(2000);
        
        //Ex.2
        produto Produto = new produto("Celular",2000);
        
        Produto.addEstoque(1000);
        Produto.retirarEstoque(500);
        System.out.println(Produto.imprimirProduto());
       
        CartaPokemon Carta1 = new CartaPokemon("Pikachu",1000,750);
        CartaPokemon Carta2 = new CartaPokemon("Charmander",1000,450);
        /*Disputa novaDisputa = new Disputa("disputa1");*/
        Disputa novaDisputa = new Disputa(" 1");
        novaDisputa.realizarDisputa(Carta1,Carta2);
        
        ArCondicionado ecoBRISA = new ArCondicionado(); 
        ecoBRISA.ligar();
        ecoBRISA.aumentarTemperatura();
        ecoBRISA.aumentarTemperatura();
        ecoBRISA.aumentarTemperatura();
        ecoBRISA.aumentarTemperatura();
        ecoBRISA.aumentarTemperatura();
        ecoBRISA.aumentarTemperatura();
        ecoBRISA.exibirTemperatura();
        
    }
    
}
