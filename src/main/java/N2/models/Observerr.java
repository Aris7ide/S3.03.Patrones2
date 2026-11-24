package N2.models;

public class Observerr implements Observer {

    private final String name;

    public Observerr(String name) {
        this.name = name;
    }

    public String update(){
        return "The observer " + this.name + " has been notified";
    }
}
