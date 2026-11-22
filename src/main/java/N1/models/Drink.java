package N1.models;

public class Drink {
    private final String name;

    public Drink(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
