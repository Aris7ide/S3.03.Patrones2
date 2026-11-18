package N1.menu;

import N1.models.Coffee;
import N1.models.Dessert;
import N1.models.appetizer.Appetizer;
import N1.models.mainCourse.MainCourse;

public class MenuBuilder {

    private Appetizer appetizer;
    private MainCourse mainCourse;
    private Dessert dessert;
    private Coffee coffee;

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
        return this;
    }

    public MenuBuilder setCoffee(Coffee coffee) {
        this.coffee = coffee;
        return this;
    }

    public Appetizer getAppetizer(){
        return appetizer;
    }
    public MainCourse getMainCourse(){return mainCourse;}
    public Dessert getDessert(){return dessert;}
    public Coffee getCoffee(){return coffee;}

    public Menu build(){
        return new Menu(this);
    }
}
