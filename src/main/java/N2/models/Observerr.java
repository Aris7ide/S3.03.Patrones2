package N2.models;

public class Observerr implements Observer {

    private final String name;
    private int notified;

    public Observerr(String name) {
        this.name = name;
        this.notified = 0;
    }

    public int getNotified() {
        return notified;
    }

    public String update(){
        notified++;
        return "The observer " + this.name + " has been notified";
    }
}
