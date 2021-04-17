/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armazem;

import core.Moeda;
import core.Armazem;

/**
 *
 * @author micre
 */
public class ArmazemMoeda extends Armazem {
    Moeda moeda;

    public ArmazemMoeda(Moeda moeda, int quantidade, int quantidadeMax, int quantidadeMin) {
        super(quantidade, quantidadeMax, quantidadeMin);
        this.moeda = moeda;
    }
    
    public Moeda getMoeda()
    {
        return this.moeda;
    }
}
