import agregadores.Receita;
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
        String nomeReceita = new String();
        String comValorDepositado = new String();
        int acucar = 10;
        
        /* CAMINHO COMPLETO
            LISTA DE BOTÕES <TIPOS DE BEBIDA>
            BOTÕES DE QUANTIDADE DE AÇUCAR (0, P, M, G) 
            CANCELAR <TIPOS DE BEBIDA>
        1:: parâmetros Iniciais
         String nomeReceita
         String acucar
         String comValorDepositado
        
        2:: Verificar Valor da Receita 

        3:: Se Precisa e Pode dar o Troco
        
        4:: Preprar Bebida (TRUE ou FALSE)
            - Verifica Quantidade de Copos
            - Verifica Quantidade de Açucar
            - Verifica Quantidade de Ingredientes
            == PREPARAR E SERVIR
            - Atualizar Copos (Verificar ZERADO e <= QuantidadeMin)
            - Atualizar Açucar (Verificar ZERADO e <= QuantidadeMin)
            - Atualizar Ingredriente (Verificar ZERADO e <= QuantidadeMin)
        
        4.1 :: SE TRUE (CONTADOR)
            Devolver Troco
            Atualizar Moedas
        
        4.2 :: SE FALSE (CONTADOR)
            Devolver VALOR TOTAL DEPOSITADO
            Atualizar Moedas (VOLTANDO O POSSÍVEL TROCO)
        */
        
        // 2
        Receita receitaEscolhida = cafeteira.objLivroReceitas.procuraReceitaLivro(nomeReceita);
        
        if(cafeteira.contador.verificarValor(receitaEscolhida, Integer.parseInt(comValorDepositado)))
        {
            // 3 ALTERAR (cafeteira.objCofre.moedasInternas) PARA O PARÂMETRO QUE TU PRECISA
            /*
                    cafeteira.contador.verificarTroco(
                    receitaEscolhida.getValor(), 
                    Integer.parseInt(comValorDepositado), 
                    cafeteira.objCofre.moedasInternas);
            */
            
            // 4 (TRANSFORMAR O 2° PARÂMETRO EM INTEIRO COM O VALOR DO AÇUCAR CONSUMIDO
            if(!cafeteira.barista.prepararBebida(receitaEscolhida, acucar))
            {
                //cafeteira.contador.darTroco();
                //cafeteira.contador.AtualizarMoedarios(cafeteira.objCofre);
                
                for(int i = 0; i < cafeteira.objCofre.moedasInternas.size(); i++)
                {
                    
                }
            }
                    
        }
        
        System.out.println(cafeteira.barista.mostrarReceitas());
        for(int i = 0; i <= 15; i++)
            cafeteira.prepararBebida("Cappuccino (G)", 10);

        System.out.println(cafeteira.barista.mostrarReceitasValidas());
    }
}
