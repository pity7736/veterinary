package utils;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;


public class IO {

    private static IO io = null;

    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    private IO() {}

    public static IO instance() {
        if (io == null) {
            io = new IO();
        }
        return io;
    }

    public int readInt(String title) {
        int input = 0;
        boolean ok = false;
        do {
            try {
                input = Integer.parseInt(this.readString(title));
                ok = true;
            } catch (Exception e) {
                this.writeln("Ingrese un número");
            }
        } while(!ok);
        return input;
    }

    public String readPassword(String title) {
        Console console = System.console();
        String password;
        if (console != null) {
            this.write(title);
            password = new String(console.readPassword());
        } else {
            this.writeln("console no disponible.");
            password = this.readString(title);
        }
        return password;
    }

    public String readString(String title) {
        String input = null;
        boolean ok = false;
        do {
            this.write(title);
            try {
                input = this.bufferedReader.readLine();
                ok = true;
            } catch (Exception e) {
                this.writeln("Error en el input.");
            }
        } while(!ok);
        return input;
    }

    public void writeln(String string) {
        System.out.println(string);
    }

    public void write(String string) {
        System.out.print(string);
    }
}
