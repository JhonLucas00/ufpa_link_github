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

    // Métodos para inserir valores nos campos.
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Métodos para retornar os valores contidos nos campos.
    public double getDesconto() {
        return desconto;
    }

    public double getValor() {
        return valor;
    }

    public String getTitulo() {
        return titulo;
    }

    // Construtor sem parâmetros.
    public Produto() {
        this("Nenhum", 0.0, 0.0); // Chamada ao construtor com param.
    }

    // Construtor com parâmetros.
    public Produto(String titulo, double valor, double desconto) {
        setTitulo(titulo);
        setValor(valor);
        setDesconto(desconto);
    }

    // Função para impressao dos dados do tipo.
    public String getTipo() {
        return "Produto: ";
    }

    // Função que retorna o conteúdo do campos em forma de String.
    public String getDados() {
        return "Titulo: " + getTitulo() + "\n"
                + "Valor: " + getValor() + "\n"
                + "Desconto: " + getDesconto() + "\n";
    }

    // Função para impressao dos dados via getDados().
    public void descreve_produto() {
        String s = getTipo() + "\n" + getDados() + "\n";
        System.out.println(s);
    }

    // Função para leitura dos dados via teclado.
    public void Lista() {
        Scanner in = new Scanner(System.in);

        // Leitura dos dados do teclado.
        System.out.printf("\n Titulo: ");
        String t = in.nextLine();

        System.out.printf("\n Valor: ");
        double v = in.nextDouble();

        in.nextLine(); // Leitura do enter.
        System.out.printf("\n Desconto: ");
        double d = in.nextDouble();

        // Enviando os dados lidos para as funcoes set.
        setTitulo(t);
        setValor(v);
        setDesconto(d);
    }
// Fim Classe Lista.

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
        // Cria um vetor de elementos que são objetos da classe Produto.
        Produto[] lista = new Produto[10];

        int valor;

        // Preenchendo o vetor com CDs.
        for (int i = 0; i < 3; i++) {
            // Usuário escolhe se quer cadastrar CD ou DVD.
            System.out.printf("\n 1 (LIVRO) - 2 (CD) - 3 (DVD): ");
            Scanner in = new Scanner(System.in);
            valor = in.nextInt();
            switch (valor) {
                // Criar CD.
                case 1:
                    lista[i] = new Livro();
//                    double din = lista.toString().charAt(1);
//                    System.out.printf("\n Valor book: "+din);
                    break;
                case 2:
                    lista[i] = new CD();
                    break;
                // Criar DVD.
                default:
                    lista[i] = new DVD();
                    break;
            }
            lista[i].Lista(); // Inserir dados no objeto criado seja CD ou

            //DVD.
        }
        // Imprimindo o conteudo de cada elemento do vetor de acordo
        //com a // classe a que ele pertence (isto é, usando polimorfismo).
        for (int i = 0; i < 3; i++) {
            lista[i].descreve_produto();
//            int sum = IntStream.of(i).sum();
//            System.out.println("The sum is " + sum);
        }
        double total = 0;
        for (int i = 0; i < lista.length; i++) {
            total += lista[1].getValor();
        }
        System.out.println(":: Total :: " + total);
    }
}
