package N1.menu;

import N1.menu.interfaces.AppetizerMenu;
import N1.menu.interfaces.BuildMenu;
import N1.menu.interfaces.MainCourseMenu;
import N1.menu.interfaces.SetOptionsMenu;
import N1.models.Coffee;
import N1.models.Dessert;
import N1.models.Drink;
import N1.models.appetizer.Appetizer;
import N1.models.mainCourse.MainCourse;

public class MenuBuilder implements AppetizerMenu, MainCourseMenu, SetOptionsMenu, BuildMenu {

    private Appetizer appetizer;
    private MainCourse mainCourse;
    private Dessert dessert;
    private Coffee coffee;
    private Drink drink;

    public static AppetizerMenu builder() {return new MenuBuilder();}

    public MenuBuilder setAppetizer(Appetizer appetizer){
        this.appetizer = appetizer;
        return this;
    }

    public MenuBuilder setMainCourse(MainCourse mainCourse){
        this.mainCourse = mainCourse;
        return this;
    }

    public MenuBuilder setDessert(Dessert dessert){
        this.dessert = dessert;
        this.coffee = null;
        return this;
    }

    public MenuBuilder setCoffee(Coffee coffee) {
        this.coffee = coffee;
        this.dessert = null;
        return this;
    }

    public MenuBuilder setDrink(Drink drink) {
        this.drink = drink;
        return this;
    }

    public Appetizer getAppetizer(){
        return appetizer;
    }
    public MainCourse getMainCourse(){return mainCourse;}
    public Dessert getDessert(){return dessert;}
    public Coffee getCoffee(){return coffee;}
    public Drink getDrink(){return drink;}

    public Menu buildMenu(){
        return new Menu(this);
    }
}
