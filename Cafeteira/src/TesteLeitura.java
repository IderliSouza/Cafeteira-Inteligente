import armazem.ArmazemCopo;
import core.Copo;
import java.io.FileNotFoundException;
import programa.Simulador;
import programa.Maquina;

/**
 *
 * @author micre
 */
public class TesteLeitura {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        Simulador simulador = new Simulador("teste.txt");
        simulador.parserArquivo();
    }
}
