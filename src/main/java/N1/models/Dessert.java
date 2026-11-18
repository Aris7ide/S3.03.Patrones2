package N1.models;

public class Dessert {

    private final String name;

    public Dessert(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
