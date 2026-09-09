/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula0809;

/**
 *
 * @author ifsp
 */
public class AULA0809 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // essse modo de trabalhar deixaxando os atributos privados eh uma convensao
        Cliente c1 = new Cliente();
        c1.setCodigo(1);
        c1.setNome("John Lennon");
        endereco end1 = new endereco();
        end1.setRua("O. Nascimento");
        end1.setNumero("379");
        end1.setBairro("JArdim Paraiso");
        
        c1.setEndereco(end1);// estou salvando um objeto dentro de outro objeto , isso se chama de associacao 
        
       
        System.out.println("Nome do c1: " + c1.getNome());
        System.out.println("Nome do Bairro" + c1.getEndereco().getBairro());
        System.out.println("End. de c1: "+ c1.getEndereco().getEnderecoCompleto());
    }
    
}
