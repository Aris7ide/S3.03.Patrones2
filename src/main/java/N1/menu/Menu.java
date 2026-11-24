package N1.menu;

import N1.models.Coffee;
import N1.models.Dessert;
import N1.models.Drink;
import N1.models.appetizer.Appetizer;
import N1.models.mainCourse.MainCourse;

public class Menu {

    private final Appetizer appetizer;
    private final MainCourse mainCourse;
    private final Dessert dessert;
    private final Coffee coffee;
    private final Drink drink;

    public Menu(MenuBuilder builder){
        this.appetizer = builder.getAppetizer();
        this.mainCourse = builder.getMainCourse();
        this.dessert = builder.getDessert();
        this.coffee = builder.getCoffee();
        this.drink = builder.getDrink();
    }

    @Override
    public String toString(){
        return "MENU: \n" +
                (appetizer != null ? "Appetizer:" + appetizer.toString() + "\n" : "")  +
                (mainCourse != null ? "Main course: " + mainCourse.toString() + "\n" : "" ) +
                (dessert != null ? "Dessert: " + dessert.toString() +"\n" : "") + (coffee != null ? "Coffee: " + coffee.toString()+ "\n" : "") +
                (drink != null ? "Drink: " + drink.toString() + "\n" : "");
    }
}
