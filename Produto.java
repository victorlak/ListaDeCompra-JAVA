/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopedro;

/**
 *
 * @author Victor
 */
import java.util.Scanner;

public class Produto {
    private String nome;
    private int estoque;
    private double preco;
    private String categoria;

    public Produto(String nome, int estoque, double preco, String categoria) {
        this.nome = nome;
        this.estoque = estoque;
        this.preco = preco;
        this.categoria = categoria;
    }

    public Produto() {
        this.nome = "";
        this.estoque = 0;
        this.preco = 0.0;
        this.categoria = "";
    }
    public String getNome() {
        return nome;
    }

    // Setter para nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para estoque
    public int getEstoque() {
        return estoque;
    }

    // Setter para estoque
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    // Getter para preco
    public double getPreco() {
        return preco;
    }

    // Setter para preco
    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Getter para categoria
    public String getCategoria() {
        return categoria;
    }

    // Setter para categoria
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public void fill(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("Informe os dados do produto.");
        System.out.println("------------------------------");
        System.out.println("Nome:");
        this.nome = leitor.next();
        System.out.println("Preco:");
        this.preco = leitor.nextDouble();
        System.out.println("Estoque:");
        this.estoque = leitor.nextInt();
        System.out.println("Categoria:");
        this.categoria = leitor.next();
    }
    public void copiarProduto(Produto outro){
        this.nome = outro.getNome();
        this.categoria = outro.getCategoria();
        this.estoque = outro.getEstoque();
        this.preco = outro.getPreco();
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", estoque=" + estoque +
                ", preco=" + preco +
                ", categoria='" + categoria + '\'' +
                '}';
    }
    
    
}
