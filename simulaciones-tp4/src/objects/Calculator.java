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
    DefaultTableModel tm;
    DefaultTableModel tmPrimerTiro;
    DefaultTableModel tmSegundoTiroPara7;
    DefaultTableModel tmSegundoTiroPara8;
    DefaultTableModel tmSegundoTiroPara9;
    DefaultTableModel tmSegundoTiro;

    public Calculator() {

    }

    public void tablas(SimulacionMontecarlo tablaSimulacion, int cantSim, int desde, int hasta) {
        seteoTablas(tablaSimulacion);

        for (int i = 0; i < cantSim; i++) {
            simulacion(tablaSimulacion);
        }
        tablaSimulacion.setVisible(true);
    }

    public void simulacion(SimulacionMontecarlo tablaSimulacion) {
        Random r = new Random();
        int contador = 1;
        DecimalFormat aleat = new DecimalFormat("0.00");
        int puntaje = 0;
        int puntosAcum = 0;
        boolean superoLos120 = false;

        //       0       1       2          3        4         5                6                  7               8                       9
        // simulacion  ronda    rnd1    1erTiro     rnd2    2doTiro     totalPinosTirados   puntosTotales   puntosAcumulados    acumuladorSiSupera120  
        for (int i = 0; i < 10; i++) {
            //nro experimento

            float rnd1 = r.nextFloat();
            int tiro1 = calculoTiro1(rnd1);

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

    private int calculoTiro1(float rnd1) {
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

        switch (tiro1) {
            case 7:
                for (int i = 0; i < tmSegundoTiroPara7.getRowCount(); i++) {
                    if (rnd2 < (float) tmSegundoTiroPara7.getValueAt(i, 2)) {
                        nPinosTirados = (int) tmSegundoTiroPara7.getValueAt(i, 0);
                        break;
                    }
                }
                break;
            case 8:
                for (int i = 0; i < tmSegundoTiroPara8.getRowCount(); i++) {
                    if (rnd2 < (float) tmSegundoTiroPara8.getValueAt(i, 2)) {
                        nPinosTirados = (int) tmSegundoTiroPara8.getValueAt(i, 0);
                        break;
                    }
                }
                break;
            case 9:
                for (int i = 0; i < tmSegundoTiroPara9.getRowCount(); i++) {
                    if (rnd2 < (float) tmSegundoTiroPara9.getValueAt(i, 2)) {
                        nPinosTirados = (int) tmSegundoTiroPara9.getValueAt(i, 0);
                        break;
                    }
                }
                break;
        }
        return nPinosTirados;
    }

    private void seteoTablas(SimulacionMontecarlo tablaSimulacion) {
        tm = (DefaultTableModel) tablaSimulacion._tblMontecarlo.getModel();
        tmPrimerTiro = (DefaultTableModel) tablaSimulacion.tblPrimerTiro.getModel();
        tmSegundoTiroPara7 = (DefaultTableModel) tablaSimulacion.tblDespues7.getModel();
        tmSegundoTiroPara8 = (DefaultTableModel) tablaSimulacion.tblDespues8.getModel();
        tmSegundoTiroPara9 = (DefaultTableModel) tablaSimulacion.tblDespues9.getModel();
    }
}
