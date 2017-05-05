/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import front.vista.simulacion.SimulacionMontecarlo;
import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gabrielneil
 */
public class Calculator {

//cantidad de simulaciones realizadas 
int cantExperimentos = 1;
    public Calculator() {

    }

    public void tablas(SimulacionMontecarlo tablaSimulacion,int cantSim, int desde, int hasta) {
tablaSimulacion.setVisible(true);
        for (int i = 0; i < cantSim; i++) {
            simulacion(tablaSimulacion);
        }
    }

    public void simulacion(SimulacionMontecarlo tablaSimulacion) {
        Random r = new Random();
        int contador = 1;
        DecimalFormat rnd = new DecimalFormat("0.00");
        for (int i = 0; i < 10; i++) {
            //nro experimento
            DefaultTableModel tm = (DefaultTableModel) tablaSimulacion._tblMontecarlo.getModel();
            tm.addRow(new Object[]{cantExperimentos,contador,rnd.format(r.nextFloat()),123,rnd.format(r.nextFloat()),123,123,123,123,false,123});
//            tabla[i][0] = contador;
//            //rnd1
//            tabla[i][1] = r.nextFloat();
//            //rnd2
//            tabla[i][3] = r.nextFloat();
        contador++;
        }
        cantExperimentos++;
    }
}
