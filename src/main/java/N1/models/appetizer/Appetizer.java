package N1.models.appetizer;

public class Appetizer {

    private final String name;
    private final boolean vegan;
    private final boolean celiac;

    public Appetizer(String name, boolean vegan, boolean celiac) {
        this.name = name;
        this.vegan = vegan;
        this.celiac = celiac;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
