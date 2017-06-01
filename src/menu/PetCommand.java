package menu;

import models.Pet;
import utils.IO;

public class PetCommand extends Command {

    public PetCommand() {
        super("Mascota");
    }

    @Override
    public void execute() {
        IO io = IO.instance();
        String id = io.readString("Ingrese cédula: ");
        String name = io.readString("Ingrese nombre mascota: ");
        int code = io.readInt("Ingrese nombre mascota: ");
        String breed = io.readString("Ingrese raza: ");
        String gender = io.readString("Ingrese género: ");
        int age = io.readInt("Ingrese edad mascota: ");
        Pet pet = new Pet(id, name, code, breed, gender, age);
        pet.add();
        io.writeln("Registro exitoso!\n");
    }

}
