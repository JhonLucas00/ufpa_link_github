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
        this("Nenhum", 0.0, 0.0, "Nenhum"); // Chamada ao construtor com param. }
    }
    // Construtor com parâmetros.

    public Livro(String titulo, double valor, double desconto, String autor) {
        super(titulo, valor, desconto);
        setAutor(autor);
    }
    //Função para impressao do tipo.

    @Override
    public String getTipo() {
        return ":: LIVRO ::";
    }
    // Função que retorna o conteúdo do campos desta
    // classe e da classe Produto (usando super !).

    @Override
    public String getDados() {
        return super.getDados() + "Autor: " + autor + "\n";
    }

    public void setAutor(String autor_text) {
        autor = (autor_text.equals("")) ? autor_text : "";
    }

    // Função para leitura dos dados via teclado dos
    // campos desta classe e dos campos da classe
    // Produto (usando super !).
    @Override
    public void Lista() {
        // Leitura dos dados contidos nos campos
        // pertencentes a classe Produto.
        super.Lista();

        Scanner in = new Scanner(System.in);

        // Leitura dos dados do teclado.
        System.out.printf("\n Autor: ");
        String autor_txt = in.nextLine();

        // Enviando os dados lidos para as funcoes set.
        setAutor(autor_txt);
    }
}
