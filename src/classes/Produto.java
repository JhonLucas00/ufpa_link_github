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
public class Produto {

    private String titulo;
    private double valor;
    private double desconto;
    
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public double getDesconto() {
        return desconto;
    }

    public double getValor() {
        return valor;
    }

    public String getTitulo() {
        return titulo;
    }
    public Produto() {
        this("Nenhum", 0.0, 0.0); 
    }
    public Produto(String titulo, double valor, double desconto) {
        setTitulo(titulo);
        setValor(valor);
        setDesconto(desconto);
    }
    public String getTipo() {
        return "Produto: ";
    }
    public String getDados() {
        return "Titulo: " + getTitulo() + "\n"
                + "Valor: " + getValor() + "\n"
                + "Desconto: " + getDesconto() + "\n";
    }
    public void descreve_produto() {
        String s = getTipo() + "\n" + getDados() + "\n";
        System.out.println(s);
    }
    public void Lista() {
        Scanner in = new Scanner(System.in);
        System.out.printf("\n Titulo: ");
        String t = in.nextLine();

        System.out.printf("\n Valor: ");
        double v = in.nextDouble();

        in.nextLine(); 
        System.out.printf("\n Desconto: ");
        double d = in.nextDouble();
        
        setTitulo(t);
        setValor(v);
        setDesconto(d);
    }

    public static void main(String args[]) {
//        Scanner s = new Scanner(System.in);
//
//        List<Long> list = new ArrayList<>();
//        System.out.print("Number one: ");
//        long n1 = s.nextLong();
//        list.add(n1);
//        System.out.print("Number two: ");
//        long n2 = s.nextLong();
//        list.add(n2);
//
//        long aux = 0;
//
//        for (int n = 0; n < list.size(); n++) {
//            aux = aux + list.get(n);
//        }
//
//        System.out.println(aux);

//--------------------------------BREAK--------------------------------------------

        Produto[] lista = new Produto[10];

        int valor;
        for (int i = 0; i < 3; i++) {
            System.out.printf("\n 1 (LIVRO) - 2 (CD) - 3 (DVD): ");
            Scanner in = new Scanner(System.in);
            valor = in.nextInt();
            switch (valor) {
                case 1:
                    lista[i] = new Livro();
//                    double din = lista.toString().charAt(1);
//                    System.out.printf("\n Valor book: "+din);
                    break;
                case 2:
                    lista[i] = new CD();
                    break;
                default:
                    lista[i] = new DVD();
                    break;
            }
            lista[i].Lista(); 
        }
        for (int i = 0; i < 3; i++) {
            lista[i].descreve_produto();
        }
        double total = 0;
        for (int i = 0; i < lista.length; i++) {
            total += lista[1].getValor();
        }
        System.out.println(":: Total :: " + total);
    }
}
