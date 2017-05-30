package menu;

import utils.IO;

public class ExitCommand extends Command {

    private boolean closed = false;

    public ExitCommand() {
        super("Salir");
    }

    @Override
    public void execute() {
        this.closed = true;
        IO.instance().writeln("Saliendo...");
    }

    public boolean isClosed() {
        return this.closed;
    }

}
