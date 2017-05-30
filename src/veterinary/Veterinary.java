package veterinary;

import controllers.Login;
import models.Owner;
import utils.IO;


public class Veterinary {

    public static void main(String[] args) {
        IO io = IO.instance();
        io.writeln("*****Bienvenidos a su veterinaria*****");
        boolean logged = new Login().make();
        if (logged) {
            io.writeln("login exitoso");
            for (int i = 0; i < 5; i++) {
                Owner.create();
            }
        } else {
            io.writeln("login incorrecto");
        }
    }
}
