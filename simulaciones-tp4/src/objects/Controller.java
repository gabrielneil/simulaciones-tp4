/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import front.Main;
import front.vista.simulacion.SimulacionMontecarlo;
/**
 *
 * @author gabrielneil
 */
public class Controller {

    private static Controller controller;
    static Main main;
    static Calculator calculator;
    private SimulacionMontecarlo tablaSimulacion;

    protected Controller(Main menu) {
        main = menu;
        calculator = new Calculator();
        tablaSimulacion = new SimulacionMontecarlo();
    }

    public static Controller getInstance(Main menu) {
        if (controller == null) {
            controller = new Controller(menu);
        } else {
            controller.setMain(menu);
        }

        return controller;
    }

    public void setMain(Main menu) {
        main = menu;
    }

    public Main getMain(){
    return main;
    }
    public void iniciar(int cantSim, int desde, int hasta) {
        calculator.tablas(tablaSimulacion, cantSim, desde, hasta);
    }

}
