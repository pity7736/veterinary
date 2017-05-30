package menu;


public abstract class Command {

    private String title;

    protected Command(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract void execute();
}
