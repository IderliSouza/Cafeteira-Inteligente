/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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
         ArmazemCopo objArmazemCopo = new ArmazemCopo(new Copo("P", 150), 100, 500, 20);
         System.out.println("Quantidade de Copos Atual: " + objArmazemCopo.getQuantidade());
         System.out.println("RETIRANDO 30: ");
         if(objArmazemCopo.retirarRecurso(30))
             System.out.println("Quantidade de Copos Atual: " + objArmazemCopo.getQuantidade());
         else
             System.out.println("NÃO HÁ COPOS SUFICIENTES: " + objArmazemCopo.getQuantidade());

         System.out.println("RETIRANDO +30: ");
         if(objArmazemCopo.retirarRecurso(30))
             System.out.println("Quantidade de Copos Atual: " + objArmazemCopo.getQuantidade());
         else
             System.out.println("NÃO HÁ COPOS SUFICIENTES: " + objArmazemCopo.getQuantidade());

         System.out.println("RETIRANDO +30: ");
         if(objArmazemCopo.retirarRecurso(30))
             System.out.println("Quantidade de Copos Atual: " + objArmazemCopo.getQuantidade());
         else
             System.out.println("NÃO HÁ COPOS SUFICIENTES: " + objArmazemCopo.getQuantidade());
         
         System.out.println("RETIRANDO +30: ");
         if(objArmazemCopo.retirarRecurso(30))
             System.out.println("Quantidade de Copos Atual: " + objArmazemCopo.getQuantidade());
         else
             System.out.println("NÃO HÁ COPOS SUFICIENTES: " + objArmazemCopo.getQuantidade());
         
    }
    
}
