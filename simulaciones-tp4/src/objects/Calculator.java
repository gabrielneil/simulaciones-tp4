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

    int acumSiSupera120 = 0;

    public Calculator() {

    }

    public void tablas(SimulacionMontecarlo tablaSimulacion, int cantSim, int desde, int hasta) {
        tablaSimulacion.setVisible(true);
        for (int i = 0; i < cantSim; i++) {
            simulacion(tablaSimulacion);
        }
    }

    public void simulacion(SimulacionMontecarlo tablaSimulacion) {
        Random r = new Random();
        int contador = 1;
        DecimalFormat aleat = new DecimalFormat("0.00");
        int puntaje = 0;
        int puntosAcum = 0;
        boolean superoLos120 = false;
        //float[][] matrizEstado = new float[2][9];
        //       0       1       2          3        4         5                6                  7               8                       9
        // simulacion  ronda    rnd1    1erTiro     rnd2    2doTiro     totalPinosTirados   puntosTotales   puntosAcumulados    acumuladorSiSupera120  
        for (int i = 0; i < 10; i++) {
            //nro experimento

            DefaultTableModel tm = (DefaultTableModel) tablaSimulacion._tblMontecarlo.getModel();
            float rnd1 = r.nextFloat();

            int tiro1 = calculoTiro1(rnd1, tablaSimulacion);
            if (tiro1 == 10) {
                puntaje = 20;
                puntosAcum += puntaje;

                if (puntosAcum >= 120) {
                    superoLos120 = true;
                    acumSiSupera120++;
                    tm.addRow(new Object[]{cantExperimentos, contador, rnd1, tiro1, "-", "-", tiro1, puntaje, puntosAcum, superoLos120, acumSiSupera120});
                    break;
                }
                tm.addRow(new Object[]{cantExperimentos, contador, rnd1, tiro1, "-", "-", tiro1, puntaje, puntosAcum, superoLos120, acumSiSupera120});
            } else {
                float rnd2 = r.nextFloat();
                int tiro2 = calculoTiro2(tiro1, rnd2, tablaSimulacion);
                int cantPinosTirados = tiro1 + tiro2;
                if (cantPinosTirados == 10) {
                    puntaje = 15;
                    puntosAcum += puntaje;
                    if (puntosAcum >= 120) {
                        superoLos120 = true;
                        acumSiSupera120++;
                        tm.addRow(new Object[]{cantExperimentos, contador, rnd1, tiro1, rnd2, tiro2, cantPinosTirados, puntaje, puntosAcum, superoLos120, acumSiSupera120});
                        break;
                    }
                } else {
                    puntaje = cantPinosTirados;
                    puntosAcum += puntaje;

                    if (puntosAcum >= 120) {
                        superoLos120 = true;
                        acumSiSupera120++;
                        tm.addRow(new Object[]{cantExperimentos, contador, rnd1, tiro1, rnd2, tiro2, cantPinosTirados, puntaje, puntosAcum, superoLos120, acumSiSupera120});
                        break;
                    }
                }
                tm.addRow(new Object[]{cantExperimentos, contador, rnd1, tiro1, rnd2, tiro2, cantPinosTirados, puntaje, puntosAcum, superoLos120, acumSiSupera120});
            }

            contador++;
        }
        cantExperimentos++;
    }

    private int calculoTiro1(float rnd1, SimulacionMontecarlo tablaSimulacion) {
        DefaultTableModel tmPrimerTiro = (DefaultTableModel) tablaSimulacion.tblPrimerTiro.getModel();
        int nPinosTirados = 0;
        for (int i = 0; i < tmPrimerTiro.getRowCount(); i++) {
            if (rnd1 < (float) tmPrimerTiro.getValueAt(i, 2)) {
                nPinosTirados = (int) tmPrimerTiro.getValueAt(i, 0);
                break;
            }
        }
        return nPinosTirados;
    }

    private int calculoTiro2(int tiro1, float rnd2, SimulacionMontecarlo tablaSimulacion) {
        int nPinosTirados = 0;
        DefaultTableModel tmSegundoTiro;
        switch (tiro1) {
            case 7:
                tmSegundoTiro = (DefaultTableModel) tablaSimulacion.tblDespues7.getModel();
                for (int i = 0; i < tmSegundoTiro.getRowCount(); i++) {
                    if (rnd2 < (float) tmSegundoTiro.getValueAt(i, 2)) {
                        nPinosTirados = (int) tmSegundoTiro.getValueAt(i, 0);
                        break;
                    }
                }
                break;
            case 8:
                tmSegundoTiro = (DefaultTableModel) tablaSimulacion.tblDespues8.getModel();
                for (int i = 0; i < tmSegundoTiro.getRowCount(); i++) {
                    if (rnd2 < (float) tmSegundoTiro.getValueAt(i, 2)) {
                        nPinosTirados = (int) tmSegundoTiro.getValueAt(i, 0);
                        break;
                    }
                }
                break;
            case 9:
                tmSegundoTiro = (DefaultTableModel) tablaSimulacion.tblDespues9.getModel();
                for (int i = 0; i < tmSegundoTiro.getRowCount(); i++) {
                    if (rnd2 < (float) tmSegundoTiro.getValueAt(i, 2)) {
                        nPinosTirados = (int) tmSegundoTiro.getValueAt(i, 0);
                        break;
                    }
                }
                break;
        }
        return nPinosTirados;
    }
}
