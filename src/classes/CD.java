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
public class CD extends Produto {

    private String artista;

    // Construtor sem parâmetros.
    public CD() {
        this("Nenhum", 0.0, 0.0, "Nenhum"); // Chamada ao construtor com param.
    }

    // Construtor com parâmetros.
    public CD(String titulo, double valor, double desconto, String artista) {
        // Chamada ao construtor da classe Produto.
        super(titulo, valor, desconto);
        setArtista(artista);
    }

    //Função para impressao do tipo.
    @Override
    public String getTipo() {
        return ":: CD ::";
    }
// Função que retorna o conteúdo do campos desta
    // classe e da classe Produto (usando super !).

    /**
     *
     * @return
     */
    @Override
    public String getDados() {
        return super.getDados() + "Artista: " + artista + "\n";
    }

    public void setArtista(String artista_set) {
        artista = (artista_set.equals("")) ? artista_set : "";
    }

    // Função para leitura dos dados via teclado dos
    // campos desta classe e dos campos da classe
    // Produto (usando super !).
    @Override
    public void Lista() { // Leitura dos dados contidos nos campos pertencentes a classe
        super.Lista();

        Scanner in = new Scanner(System.in);
        // Leitura dos dados do teclado.
        System.out.printf("\n Artista: ");
        String artista_in = in.nextLine();

        // Enviando os dados lidos para as funcoes set.
        setArtista(artista_in);
    }
}
