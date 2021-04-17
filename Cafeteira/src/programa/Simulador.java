package programa;

import java.io.FileNotFoundException;
import java.io.FileReader;
import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author micre
 */
public class Simulador {
    private Scanner arquivoConfiguracao = null;

    public Simulador(String arquivoInicial) throws FileNotFoundException
    {
        arquivoConfiguracao = new Scanner(new FileReader(arquivoInicial));
    }
    
    public void parserArquivo()
    {
        String checksun = null;
        String parse = null;
        int contadorLinha = 0;
        while (arquivoConfiguracao.hasNextLine()) 
        {
            String linha = arquivoConfiguracao.nextLine();
            contadorLinha++;
            if(linha.charAt(0) == '#')                                          // TAG
            {
                parse = linha.substring(1, 4);
                switch (parse) {
                    case "INI":
                        if(checksun != null)
                            setErro("MULTIPLAS ABERTURAS SEM FECHAMENTO NA LINHA " + contadorLinha + ">> " + linha);

                        checksun = linha.substring(5);
                        break;
                    case "FIM":
                        if(checksun == null)
                            setErro("FECHAMENTO SEM ABERTURA NA LINHA " + contadorLinha + ">> " + linha);
                        if(checksun.equals(linha.substring(5)))
                            checksun = null;
                        else
                            setErro("FECHAMENTO INCORRETO NA LINHA " + contadorLinha + " >> " + linha);

                        break;
                }
            }
            else // não é TAG e sim VALORES
            {
                String[] arrayValores = linha.split(" ");
                switch(checksun) {
                    case "MOEDA":
                        if(arrayValores.length != 5)
                            setErro("NÚMERO DE PARÂMETROS DE MOEDA INCORRETOS " + contadorLinha + " >> " + linha);

                        break;
                    case "INGREDIENTE":
                        System.out.printf("INGREDIENTE >> %s\n", linha);
                        break;
                    case "MOEDARIO":
                        System.out.printf("MOEDARIO >> %s\n", linha);
                        break;
                    default:
                        System.out.println(linha);
                            
                }
            }
        }
    }
    
    public void setErro(String msg)
    {
        this.setError(msg, -1);
    }
    
    public void setError(String msg, int codigo)
    {
        System.out.println(msg);
        exit(codigo);
    }
}
