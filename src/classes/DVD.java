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
    public DVD() {
        this("Nenhum", 0.0, 0.0, 0); 
    }

    public DVD(String titulo, double valor, double desconto, int duracao) {
        super(titulo, valor, desconto);
        setDuracao(duracao);
    }

    @Override
    public String getTipo() {
        return ":: DVD ::";
    }

    @Override
    public String getDados() {
        return super.getDados() + "Duração: " + duracao + "\n";
    }

    public void setDuracao(int dur) {
        duracao = (dur > 0) ? dur : 0;
    }
    @Override
    public void Lista() {
        super.Lista();

        Scanner in = new Scanner(System.in);
        System.out.printf("\n Duração: ");
        int dur = in.nextInt();
        setDuracao(dur);
    }
}
