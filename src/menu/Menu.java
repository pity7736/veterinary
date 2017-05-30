package menu;

import java.util.ArrayList;
import java.util.List;

import utils.IO;

public abstract class Menu {

    protected List<Command> commandList;

    protected ExitCommand exitCommand;

    protected String name;

    private IO io = IO.instance();

    public Menu(String name, ExitCommand exitCommand) {
        this.name = name;
        this.exitCommand = exitCommand;
        this.commandList = new ArrayList<Command>();
        this.setOptions();
    }

    protected void setOptions() {
        ArrayList<Command> options = this.getOptions();
        this.commandList.addAll(options);
        this.commandList.add(this.exitCommand);
    }

    protected abstract ArrayList<Command> getOptions();

    public void run(){
        this.show();
        int option = this.getOption();
        this.commandList.get(option).execute();
    }

    protected void show() {
        io.writeln(this.name);
        io.writeln("-------------------------------------------");
        for(int i = 0; i < this.commandList.size(); i++) {
            this.io.writeln(i + 1 + ") " + this.commandList.get(i).getTitle());
        }
        io.writeln("-------------------------------------------");
    }

    protected int getOption() {
        int option;
        boolean ok = false;
        do {
            option = io.readInt("Ingrese opción: ") - 1;
            if (0 <= option && option < this.commandList.size()) {
                ok = true;
            } else {
                io.writeln("Opción inválida!");
            }
        } while(!ok);
        return option;
    }

}
