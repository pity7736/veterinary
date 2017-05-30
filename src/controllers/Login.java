package controllers;

import models.User;
import utils.IO;


public class Login {

    private IO io = IO.instance();

    private String username;

    private String password;

    public boolean make(){
        this.askData();
        boolean login = false;
        User user = User.getUserByUsername(this.username);
        if (user != null) {
            login = user.checkPassword(this.password);
        }
        return login;
    }

    private void askData() {
        this.username = this.io.readString("Ingrese nombre de usuario: ");
        this.password = this.io.readPassword("Ingrese contraseña: ");
    }
}
