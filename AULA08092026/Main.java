/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livro;

/**
 *
 * @author ifsp
 */
public class Main {
    
    public static void main(String[] args) {
        
        Livro livro = new Livro();
        livro.setNome("O teclado invisivel");
        livro.setAnoPublicacao("2026");
        Genero genero = new Genero();
        genero.setGenero("ficcao");
        genero.setCodigo(0);
        Autor autor = new Autor();
        autor.setCodigo(0);
        autor.setNome("Gabriel");
        
        livro.setGenero(genero);
        livro.setAutor(autor);
        
        System.out.println("Livro: "+ livro.getNome());
        System.out.println("Ano da publicacao: "+ livro.getAnoPublicacao());
        System.out.println("Genero: "+ livro.getGenero().getGenero());
        System.out.println("Autor: "+livro.getAutor().getNome());
        
        Livro livro2 = new Livro();
        livro2.setNome("O grande mouse");
        livro2.setAnoPublicacao("2025");
        Genero genero2 = new Genero();
        genero2.setGenero("drama");
        genero2.setCodigo(1);
        Autor autor2 = new Autor();
        autor2.setCodigo(1);
        autor2.setNome("Fonseca");
        
        livro2.setGenero(genero2);
        livro2.setAutor(autor2);
        
        System.out.println("Livro: "+ livro2.getNome());
        System.out.println("Ano da publicacao: "+ livro2.getAnoPublicacao());
        System.out.println("Genero: "+ livro2.getGenero().getGenero());
        System.out.println("Autor: "+livro2.getAutor().getNome());
        
        
        
        
        
        

        
        
        
        
        
        
    }
    
}
