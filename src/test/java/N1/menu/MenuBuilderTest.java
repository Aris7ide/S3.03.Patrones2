package N1.menu;

import N1.models.Coffee;
import N1.models.Dessert;
import N1.models.Drink;
import N1.models.Type;
import N1.models.appetizer.AppetizerBuilder;
import N1.models.mainCourse.MainCourse;
import N1.models.mainCourse.MainCourseBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuBuilderTest {

    @Test
    void shouldBuildMenu() {
        Menu fullMenu = MenuBuilder.buildFullMenu().setAppetizer(AppetizerBuilder.builder().setName("Croquetas").isVegan().build())
                .setMainCourse(MainCourseBuilder.builder().setName("Paella").setSupplement("Lemon").setCeliac().buildMain())
                .setCoffee(new Coffee(Type.AMERICANO)).setDrink(new Drink("Acquarius")).buildMenu();

        System.out.println(fullMenu);

    }

    @Test
    void shouldBuildHalfMenu() {

        Menu halfMenu = MenuBuilder.buildHalfMenu().setMainCourse(MainCourseBuilder.builder().setName("Pasta e patate").setSupplement("Parmigiano").buildMain())
                .setDrink(new Drink("Water")).buildMenu();

        System.out.println(halfMenu);
    }

    @Test
    void shouldBuildKidsMenu() {
        Menu kidsMenu = MenuBuilder.KidsMenu().setMainCourse(MainCourseBuilder.builder().setName("Pastina").setCeliac().buildMain())
                .setDrink(new Drink ("Water")).buildMenu();

        System.out.println(kidsMenu);
    }

    @Test
    void shouldOnlySetDessertCoffeOnce() {
        Menu menu = MenuBuilder.KidsMenu().setMainCourse(MainCourseBuilder.builder().setName("Pasta").buildMain())
                .setCoffee(new Coffee(Type.AMERICANO)).setDessert(new Dessert("Tiramisu")).buildMenu();

        System.out.println(menu);

    }
    
}