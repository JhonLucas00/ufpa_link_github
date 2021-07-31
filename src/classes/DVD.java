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
public class DVD extends Produto {

    private int duracao;

    // Construtor sem parâmetros.
    public DVD() {
        this("Nenhum", 0.0, 0.0, 0); // Chamada ao construtor com param. }
    }
    // Construtor com parâmetros.

    public DVD(String titulo, double valor, double desconto, int duracao) {
        super(titulo, valor, desconto);
        setDuracao(duracao);
    }
    //Função para impressao do tipo.

    @Override
    public String getTipo() {
        return ":: DVD ::";
    }
    // Função que retorna o conteúdo do campos desta
    // classe e da classe Produto (usando super !).

    @Override
    public String getDados() {
        return super.getDados() + "Duração: " + duracao + "\n";
    }

    public void setDuracao(int dur) {
        duracao = (dur > 0) ? dur : 0;
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
        System.out.printf("\n Duração: ");
        int dur = in.nextInt();

        // Enviando os dados lidos para as funcoes set.
        setDuracao(dur);
    }
}
