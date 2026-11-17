package N1.models.appetizer;

public class AppetizerBuilder {

    private String name;
    private boolean vegan;
    private boolean celiac;

    public AppetizerBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public AppetizerBuilder itsVegan() {
        this.vegan = true;
        return this;
    }

    public AppetizerBuilder itsCeliac() {
        this.celiac = true;
        return this;
    }

    public Appetizer build() {
        return new Appetizer(name, vegan, celiac);
    }
}
