package models;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class User {

    private String username;

    private String password;

    private static String filePath = "/home/pity/development/java/veterinary/src/models/users.txt";

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public static User getUserByUsername(String username){
        BufferedReader br = null;
        String line;
        String name;
        String password;
        User user = null;
        try {
            br = new BufferedReader(new FileReader(filePath));
            while((line = br.readLine()) != null) {
                name = line.split(",")[0];
                password = line.split(",")[1];
                if(username.equals(name)) {
                    user = new User(username, password);
                    break;
                }
            }
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {

                }
            }
        }
        return user;
    }

    public boolean checkPassword(String password) {
        boolean ok = false;
        if (this.password.equals(password)){
            ok = true;
        }
        return ok;
    }

    public String toString() {
        return this.username;
    }
}
