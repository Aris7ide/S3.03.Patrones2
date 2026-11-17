package N1.models.appetizer;

import N1.models.appetizer.interfaces.*;

public class AppetizerBuilder implements Name, Build, AfterName, AfterVegan, AfterCeliac {

    private String name;
    private boolean vegan;
    private boolean celiac;

    public AppetizerBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public AppetizerBuilder isVegan() {
        this.vegan = true;
        return this;
    }

    public AppetizerBuilder isCeliac() {
        this.celiac = true;
        return this;
    }

    public Appetizer build() {
        return new Appetizer(name, vegan, celiac);
    }
}
