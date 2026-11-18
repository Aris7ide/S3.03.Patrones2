package N1.menu;

import N1.models.appetizer.Appetizer;

public class MenuBuilder {

    private Appetizer appetizer;

    public MenuBuilder setAppetizer(Appetizer appetizer){
        this.appetizer = appetizer;
        return this;
    }

    public Appetizer getAppetizer(){
        return appetizer;
    }
}
