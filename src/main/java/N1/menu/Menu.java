package N1.menu;

import N1.models.appetizer.Appetizer;

public class Menu {

    private final Appetizer appetizer;

    public Menu(MenuBuilder builder){
        this.appetizer = builder.getAppetizer();
    }
}
