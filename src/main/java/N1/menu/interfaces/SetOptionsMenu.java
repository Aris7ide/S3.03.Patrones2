package N1.menu.interfaces;

import N1.models.Coffee;
import N1.models.Dessert;
import N1.models.Drink;

public interface SetOptionsMenu extends BuildMenu {
    SetOptionsMenu setDessert(Dessert dessert);
    SetOptionsMenu setCoffee(Coffee coffee);
    SetOptionsMenu setDrink(Drink drink);

}
