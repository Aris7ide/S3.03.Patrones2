package N1.models.appetizer;

import N1.models.appetizer.interfaces.*;
import N1.models.appetizer.interfaces.Build;
import N1.models.appetizer.interfaces.Name;

public class AppetizerBuilder implements Name, Build, AfterName, AfterVegan, AfterCeliac {

    private String name;
    private boolean vegan = false;
    private boolean celiac = false;

    public static Name builder() {
        return new AppetizerBuilder();
    }

    @Override
    public AppetizerBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public AppetizerBuilder isVegan() {
        this.vegan = true;
        return this;
    }

    @Override
    public AppetizerBuilder isCeliac() {
        this.celiac = true;
        return this;
    }

    public String getName() {
        return name;
    }
    public boolean getVegan() {
        return vegan;
    }
    public boolean getCeliac() {
        return celiac;
    }

    public Appetizer build(){
        return new Appetizer(this);
    }
}
