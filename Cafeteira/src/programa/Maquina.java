package programa;
import agregadores.Barista;
import agregadores.Contador;
import armazem.ArmazemIngrediente;
import core.Moeda;
import java.io.FileNotFoundException;

/**
 *
 * @author micre
 */
public class Maquina extends Simulador {
    public Barista barista;
    public Contador contador;
    public Moeda moedaAtual;
    
    public Maquina(String text) throws FileNotFoundException
    {
        super(text);
        parserArquivo();
        System.out.println("Copos P: " + objDispensa.procurarDispensaCopo("P").getQuantidade());
    }
    
}
