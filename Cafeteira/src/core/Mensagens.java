package core;

/**
 * @version 1.0
 * @since 
 */

public final class Mensagens {

    private Mensagens() {
    }
    
    public static void mensagemTela(String msg)
    {
        System.out.println("MENSAGEM NA TELA " + msg);
    }
    
    public static void mandaEmailTecnico(String msg)
    {
        System.out.println("MANDAR EMAIL PARA TÉCNICO " + msg);
    }
}
