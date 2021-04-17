/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armazem;
import core.Armazem;
import core.Ingrediente;


/**
 *
 * @author micre
 */
public class ArmazemIngrediente extends Armazem{
    Ingrediente ingrediente;
    
    public ArmazemIngrediente(Ingrediente ingrediente, int quantidade, int quantidadeMax, int quantidadeMin) {
        super(quantidade, quantidadeMax, quantidadeMin);
        this.ingrediente = ingrediente;
    }    
    
    public Ingrediente getIngrediente()
    {
        return this.ingrediente;
    }
}
