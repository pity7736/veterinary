package veterinary;

import models.User;
import utils.IO;


public class Veterinary {

    public static void main(String[] args) {
        IO io = IO.instance();
        User user = User.getUserByUsername("admin");
        io.writeln(user.toString());
    }
}
