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
        Maquina cafeteira = new Maquina("teste.txt");
        for(int i = 0; i <= 5; i++)
            cafeteira.prepararBebida("Cappuccino (G)", 10);

        cafeteira.prepararBebida("Cappuccino (G)", 0);
    }
}
