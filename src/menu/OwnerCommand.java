package menu;

import models.Owner;
import utils.IO;


public class OwnerCommand extends Command {

    public OwnerCommand() {
        super("Dueño");
    }

    @Override
    public void execute() {
        IO io = IO.instance();
        String id = io.readString("Ingrese cédula: ");
        String name = io.readString("Ingrese nombre completo: ");
        String address = io.readString("Ingrese dirección: ");
        String phoneNumber = io.readString("Ingrese número telefónico: ");
        Owner owner = new Owner(id, name, address, phoneNumber);
        owner.add();
        io.writeln("Registro exitoso!\n");
    }

}
