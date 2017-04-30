/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import front.Main;

/**
 *
 * @author gabrielneil
 */
public class Controller {

    private static Controller controller;
    static Main main;

    protected Controller(Main menu) {

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
}
