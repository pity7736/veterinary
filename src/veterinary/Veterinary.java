package veterinary;

import controllers.Login;
import menu.MainMenu;
import utils.IO;


public class Veterinary {

    public static void main(String[] args) {
        IO io = IO.instance();
        io.writeln("*****Bienvenidos a su veterinaria*****");
        boolean logged = new Login().make();
        if (logged) {
            io.writeln("login exitoso");
            MainMenu menu = new MainMenu();
            menu.run();
        } else {
            io.writeln("login incorrecto");
        }
    }
}
