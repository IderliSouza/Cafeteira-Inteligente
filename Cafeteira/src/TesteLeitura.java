import java.io.FileNotFoundException;
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

        System.out.println(cafeteira.barista.mostrarReceitas());
        for(int i = 0; i <= 15; i++)
            cafeteira.prepararBebida("Cappuccino (G)", 10);

        System.out.println(cafeteira.barista.mostrarReceitasValidas());
    }
}
