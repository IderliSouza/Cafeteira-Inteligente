/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregadores;
import armazem.ArmazemIngrediente;
import armazem.ArmazemCopo;
import core.Ingrediente;
import core.Copo;
import java.util.ArrayList;

/**
 *
 * @author micre
 */
public class Dispensa {
    ArrayList<ArmazemIngrediente> dispensaIngrediente;
    ArrayList<ArmazemCopo> dispensaCopo;
    
    public Dispensa()
    {
        
    }
    
    public void addItemDispensaIngrediente(Ingrediente ingrediente, int quantidade, int quantidadeMin, int quantidadeMax)
    {
        dispensaIngrediente.add(new ArmazemIngrediente(ingrediente, quantidade, quantidadeMin, quantidadeMax));
    }
    
    public void addItemDispensaCopo(Copo copo, int quantidade, int quantidadeMin, int quantidadeMax)
    {
        dispensaCopo.add(copo.getVolume(), new ArmazemCopo(copo, quantidade, quantidadeMin, quantidadeMax));
    }
}
