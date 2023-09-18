/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.visao;

import com.mycompany.controle.ControleSistema;
import com.mycompany.modelo.Computador;
import com.mycompany.modelo.VideoGame;
import com.mycompany.outros.Constantes;
import java.util.Scanner;

/**
 *
 * @author 10156
 */
public class VisaoMenu {
    public static int menuPrincipal(){
        System.out.println("=============SISTEMA DE VENDAS 2.0=============");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Alterar produto");
        System.out.println("3 - Remover produto");
        System.out.println("4 - Listar produtos");
        System.out.println("5 - Vender produto");
        System.out.println("===============================================");
        int opcaoMenu = new Scanner(System.in).nextInt();
        
        return opcaoMenu;
    }
    
    public static int menuEscolhaProduto(){
        System.out.println("===============CADASTRAR PRODUTO===============");
        System.out.println("Qual categoria de produto deseja cadastar?");
//        System.out.println("1 - Video Game");
//        System.out.println("2 - Computador");
        
        for(int i = 0; i < Constantes.CATEGORIAS.length; i++){
            System.out.println(i + 1 + " - " + Constantes.CATEGORIAS[i]);
        }
        
        System.out.println("===============================================");
        int opcaoProduto = new Scanner(System.in).nextInt();
        
        return opcaoProduto;
    }
    
    public static int menuAlteracaoProduto(){
        System.out.println("================ALTERAR PRODUTO================");
        System.out.println("Qual produto deseja alterar?");
        
        for(int i = 0; i < ControleSistema.produtos.size(); i++){
            System.out.println(i + 1 + " | " + ControleSistema.produtos.get(i));
        }
        
        System.out.println("===============================================");
        int produtoAlterar = new Scanner(System.in).nextInt();
        
        return produtoAlterar;
    }
    
    public static Object menuAlteracaoProdutoInformacoes(Object object){
        if(object instanceof VideoGame){
            System.out.println("Novo nome: ");
            ((VideoGame) object).setNome(new Scanner(System.in).nextLine());
            System.out.println("Novo preço: ");
            ((VideoGame) object).setPreco(new Scanner(System.in).nextDouble());
            System.out.println("Nova plataforma: ");
            ((VideoGame) object).setPlataforma(new Scanner(System.in).nextLine());
        }else if(object instanceof Computador){
            System.out.println("Novo nome: ");
            ((Computador) object).setNome(new Scanner(System.in).nextLine());
            System.out.println("Novo preço: ");
            ((Computador) object).setPreco(new Scanner(System.in).nextDouble());
            System.out.println("Nova quantidade de memória Ram: ");
            ((Computador) object).setMemoriaRam(new Scanner(System.in).nextDouble());
            System.out.println("Novo processador: ");
            ((Computador) object).setProcessador(new Scanner(System.in).nextLine());
        }
        
        return object;
    }
    
    public static int menuRemocaoProduto(){
        System.out.println("================REMOVER PRODUTO================");
        System.out.println("Qual produto deseja remover?");
        
        for(int i = 0; i < ControleSistema.produtos.size(); i++){
            System.out.println(i + 1 + " | " + ControleSistema.produtos.get(i));
        }
        
        System.out.println("===============================================");
        int produtoRemover = new Scanner(System.in).nextInt();
        
        return produtoRemover;
    }
    
    public static int menuVendaProduto(){
        System.out.println("================VENDA DE PRODUTO===============");
        System.out.println("Deseja realizar a venda de qual produto?");
        
        for(int i = 0; i < ControleSistema.produtos.size(); i++){
            System.out.println(i + 1 + " | " + ControleSistema.produtos.get(i));
        }
        
        System.out.println("===============================================");
        int produtoVender = new Scanner(System.in).nextInt();
        
        return produtoVender;
    }
    
    public static Object menuVendaProdutoInformacoes(Object object){
        if(object instanceof VideoGame){
            VideoGame videoGame = new VideoGame();
            videoGame = (VideoGame) object;
            System.out.println("Quantas unidades deseja vender do produto " + videoGame.getNome() + "?");
            ControleSistema.qtdeVenda = new Scanner(System.in).nextInt();
        }else if(object instanceof Computador){
            Computador computador = new Computador();
            computador = (Computador) object;
            System.out.println("Quantas unidades deseja vender do produto " + computador.getNome() + "?");
            ControleSistema.qtdeVenda = new Scanner(System.in).nextInt();
        }
        
        return object;
    }
}
