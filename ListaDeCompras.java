/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopedro;

import java.util.Scanner;

/**
 *REMOVER DA LISTA
 * ADD A LISTA
 * RESETAR TD
 * PRECO TOTAL
 * LISTAR ITENS E ATRIBUTOS
 * @author Victor
 */
public class ListaDeCompras {
    private Produto[] itens;
    private double valorTotal;
    private int quantidade;

    public ListaDeCompras(){
        itens = new Produto[100];
        valorTotal = 0.0;
        quantidade = 0;
    }
    public ListaDeCompras(int tamanho) {
        this.itens = new Produto[tamanho];
        this.valorTotal = 0.0;
        this.quantidade = 0;
    }
    public void realocarLista(int index){
        int casasRealocadas = itens.length -(index + 1);
        for(int i = 1; i <= casasRealocadas; i++){
            itens[index].copiarProduto(itens[index+1]);
            index++;
        }
        itens[quantidade] = null;
    }
    public void adicionarProduto(){
        
        if(quantidade< itens.length){
            Produto produto = new Produto();
            produto.fill();
            this.itens[quantidade] = produto;
            quantidade++;
            System.out.println("Produto adicionado!");
        }else{
            System.out.println("Lista cheia!");
        } 
    }
    public void removerProduto(){
        Scanner leitor = new Scanner(System.in);
        String remover;
        boolean encontrou = false;
        
        System.out.println("Informe o nome do produto que deseja remover.");
        remover = leitor.next();

        for(int i=0; i<quantidade; i++){
            
            if(itens[i].getNome().equals(remover)){
                quantidade--;
                realocarLista(i);
                encontrou = true;
            }
        }
        if(encontrou){
            System.out.println("Removido!");
        }else{
            System.out.println("Nao encontrado");
        }
    }
    public void listarProdutos(){
        
        for(int i = 0; i < itens.length; i++){
            System.out.println(itens[i]);
        }
    }
}
