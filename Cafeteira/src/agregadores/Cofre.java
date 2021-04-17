/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregadores;
import armazem.ArmazemMoeda;
import core.Moeda;
import java.util.ArrayList;


/**
 *
 * @author micre
 */
public class Cofre {
    public ArrayList<ArmazemMoeda> moedasInternas;
    
    public Cofre()
    {
        
    }
    
    public void addGavetaMoeda(Moeda moeda, int quantidade, int quantidadeMin, int quantidadeMax)
    {
        moedasInternas.add(moeda.getValor(), new ArmazemMoeda(moeda, quantidade, quantidadeMin, quantidadeMax));
    }
}
