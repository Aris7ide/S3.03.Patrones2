package N1.models.appetizer;

public class Appetizer {

    private final String name;
    private final boolean vegan;
    private final boolean celiac;

    public Appetizer(AppetizerBuilder builder) {
        this.name = builder.getName();
        this.vegan = builder.getVegan();
        this.celiac = builder.getCeliac();
    }

    @Override
    public String toString() {
        return this.name + " " + (this.vegan? "(Vegan)" : "") + " " + (this.celiac? "(Celiac)" : "");
    }
}
