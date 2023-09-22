/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.outros;

import com.mycompany.modelo.Computador;
import com.mycompany.modelo.VideoGame;
import java.util.ArrayList;

/**
 *
 * @author jose_
 */
public class Utilizades {
    public static boolean produtoJaExiste(String nomeNovoProduto, ArrayList<Object> produtos){
        for(int i = 0; i < produtos.size(); i++){
            if(produtos.get(i) instanceof Computador){
                if(((Computador) produtos.get(i)).getNome().equals(nomeNovoProduto)){
                    return true;
                }
            }else if(produtos.get(i) instanceof VideoGame){
                if(((VideoGame) produtos.get(i)).getNome().equals(nomeNovoProduto)){
                    return true;
                }
            }
        }
        return false;
    }
}
