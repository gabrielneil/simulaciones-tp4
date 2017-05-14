/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import front.Main;
import front.Default;
import front.vista.simulacion.SimulacionMontecarlo;

/**
 *
 * @author gabrielneil
 */
public class Controller {

    private static Controller controller;
    static Main inicio;
    static Default defaul;
    static Calculator calculator;
    private SimulacionMontecarlo tablaSimulacion;

    protected Controller(Main menu) {
        inicio = menu;
        defaul = new Default(this);
        calculator = new Calculator();
    }

    public static Controller getInstance(Main menu) {
        if (controller == null) {
            controller = new Controller(menu);
        } else {
            controller.setMain(menu);
        }

        return controller;
    }

    public void setMain(Main in) {
        inicio = in;
    }

    public Main getInicio() {
        return inicio;
    }

    public void iniciar(int cantSim, int desde, int hasta) {
        tablaSimulacion = new SimulacionMontecarlo(cantSim,desde,hasta,this);
        tablaSimulacion.setVisible(true);
//        calculator.tablas(tablaSimulacion, cantSim, desde, hasta);
    }
    
    public void selectedDefault(){
        inicio.setVisible(false);
        this.defaul.setVisible(true);
    }
    
    public void selectedSet(){
        
    }
    
    public void showDefault(){
        defaul.setVisible(true);
    }
    
    public void showMenu(){
        inicio.setVisible(true);
    }

}
