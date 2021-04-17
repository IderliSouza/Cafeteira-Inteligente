package agregadores;

/**
 *
 * @author micre
 */
public class Barista {
    int status;
    
    public Barista()
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
                return "Verificando a Receita!";
            case 2:
                return "Verificando Estoque!";
            case 3:
                return "Preparando Bebida!";
            case 4:
                return "Atualizando Quantitativos!";
            case 11:
                return "Baixa Quantidade de X";
            case 12:
                return "Baixa Quantidade de Y";
            case 13:
                return "Baixa Quantidade de Z";
            case 14:
                return "Baixa Quantidade de W";
            case 21:
                return "Falta do Ingrediente X";
            case 22:
                return "Falta do Ingreidente Y";
            case 23:
                return "Falta do Ingrediente Z";
            case 24:
                return "Falta do Ingrediente W";
        }
        return "ERROR !";
    }
    
    private void setStatus(int status) {
        this.status = status;
    }
    
    public boolean prepararBebida(Receita receita)
    {
        
        return true;
    }
}
