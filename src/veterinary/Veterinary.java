package veterinary;

import controllers.Login;
import menu.MainMenu;
import utils.IO;


public class Veterinary {

    public static void main(String[] args) {
        IO io = IO.instance();
        io.writeln("*****Bienvenidos a su veterinaria*****");
        boolean logged = false;
        MainMenu menu = new MainMenu();
        do {
            logged = new Login().make();
            if (logged) {
                menu.run();
            } else {
                io.writeln("Usuario y/o contraseña incorrectos\n");
            }
        } while(!logged);
    }
}
