/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armazem;
import core.Armazem;
import core.Copo;


/**
 *
 * @author micre
 */
public class ArmazomCopo extends Armazem {
    Copo copo;
    
        
    public ArmazomCopo(Copo copo, int quantidade, int quantidadeMax, int quantidadeMin) {
        super(quantidade, quantidadeMax, quantidadeMin);
        this.copo = copo;
    }    
    
    public Copo getCopo()
    {
        return this.copo;
    }
}
