/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.util.Random;

/**
 *
 * @author gabrielneil
 */
public class Calculator {

    public Calculator() {

    }

    public void tablas(int cantSim, int desde, int hasta) {

        for (int i = 0; i < cantSim; i++) {
            simulacion();
        }
    }

    public void simulacion() {
        Object[][] tabla = new Object[9][10];
        Random r = new Random();
        int contador = 0;
        for (int i = 0; i < tabla.length; i++) {
            //nro experimento
            tabla[i][0] = contador;
            //rnd1
            tabla[i][1] = r.nextFloat();
            //rnd2
            tabla[i][3] = r.nextFloat();
        }
    }
}
