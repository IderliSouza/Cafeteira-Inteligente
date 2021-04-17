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
         Copo copo = new Copo("P", 200);
         ArmazemCopo objArmazemCopo = new ArmazemCopo(copo, 100, 500, 20);
    }
    
}
