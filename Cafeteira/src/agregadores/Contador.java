package agregadores;

import core.Moeda;

/**
 *
 * @author micre
 */
public class Contador {
    private int status;
    private Moeda moedaAtual;
    
    public Contador()
    {
        this.setStatus(-1);
    }
    
    public String getStatus() {
        switch(status)
        {
            case -1:
                return "Ocioso!";
            case 0:
                return "Se Preparando!";
            case 1:
                return "Verificando Valor Depositado!";
            case 2:
                return "Verificando Moedas!";
            case 3:
                return "Saldo Insuficiente";
            case 4:
                return "Atualizando Quantitativos!";
            case 11:
                return "Baixa Quantidade da Moeda 0.05";
            case 12:
                return "Baixa Quantidade da Moeda 0.10";
            case 13:
                return "Baixa Quantidade da Moeda 0.25";
            case 14:
                return "Baixa Quantidade da Moeda 0.50";
            case 15:
                return "Baixa Quantidade da Moeda 1.00";
            case 21:
                return "Falta da Moeda 0.05";
            case 22:
                return "Falta da Moeda 0.10";
            case 23:
                return "Falta da Moeda  0.25";
            case 24:
                return "Falta da Moeda  0.50";
            case 25:
                return "Falta da Moeda  1.00";
        }
        return "ERROR !";
    }
    
    private void setStatus(int status) {
        this.status = status;
    }
    
    public boolean verificarMoeda(Moeda moeda)
    {
        moedaAtual = moeda;
        // Verificar Se é possível armazenar esta moeda no cofre!
        
        return true;
    }    
    
    public boolean verificarTroco(int valor)
    {
        // Posso dar Troco da Venda Atual? 
        
        // A quantidade Atual das Moedas nas Gavetas do Cofre estão num nível Bom??
        
        return true;
    }
    
    public boolean verificarValor(Receita receita, int valor)
    {
        if(receita.getValor() > valor)                                          // Verificar se o valor depositado paga a bebida
        {
            this.setStatus(3);                                                  // Contador Sinaliza que o Saldo é Insuficiente
            return false;                                                       // Retorna que NÃO VAI ROLAR!
        }
        return true;                                                            // TUDO CERTINHO!
    }
    
    public Moeda devolverMoeda() 
    {
        Moeda tmp = moedaAtual;
        moedaAtual = null;
        return tmp;
    }
}
