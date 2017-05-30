package menu;

import java.util.ArrayList;

public class MainMenu extends Menu {

    public MainMenu() {
        super("Menú principal", new ExitCommand());
    }

    @Override
    protected ArrayList<Command> getOptions() {
        ArrayList<Command> commands = new ArrayList<Command>();
        commands.add(new OwnerCommand());
        return commands;
    }

    @Override
    public void run() {
        do {
            super.run();
        } while(!this.exitCommand.isClosed());

    }
}
