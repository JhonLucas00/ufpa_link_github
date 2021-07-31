/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Scanner;

/**
 *
 * @author Pará Sistemas
 */
public class Livro extends Produto{
    private String autor;
    
    public Livro() {
        this("Nenhum", 0.0, 0.0, "Nenhum"); 
    }

    public Livro(String titulo, double valor, double desconto, String autor) {
        super(titulo, valor, desconto);
        setAutor(autor);
    }

    @Override
    public String getTipo() {
        return ":: LIVRO ::";
    }

    @Override
    public String getDados() {
        return super.getDados() + "Autor: " + autor + "\n";
    }

    public void setAutor(String autor_text) {
        autor = (autor_text.equals("")) ? autor_text : "";
    }
    @Override
    public void Lista() {
        super.Lista();

        Scanner in = new Scanner(System.in);
        System.out.printf("\n Autor: ");
        String autor_txt = in.nextLine();
        setAutor(autor_txt);
    }
}
