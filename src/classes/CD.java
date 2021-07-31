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
    public CD() {
        this("Nenhum", 0.0, 0.0, "Nenhum"); 
    }
    public CD(String titulo, double valor, double desconto, String artista) {
        super(titulo, valor, desconto);
        setArtista(artista);
    }
    @Override
    public String getTipo() {
        return ":: CD ::";
    }

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
    @Override
    public void Lista() { 
        super.Lista();

        Scanner in = new Scanner(System.in);
        System.out.printf("\n Artista: ");
        String artista_in = in.nextLine();
        setArtista(artista_in);
    }
}
