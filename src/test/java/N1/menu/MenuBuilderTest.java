package N1.menu;

import N1.models.Dessert;
import N1.models.appetizer.AppetizerBuilder;
import N1.models.mainCourse.MainCourse;
import N1.models.mainCourse.MainCourseBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuBuilderTest {

    @Test
    void shouldBuildMenu() {
        MenuBuilder menuBuilder = new MenuBuilder();

        Menu menu = menuBuilder.setAppetizer(AppetizerBuilder.builder().setName("Caprese").isVegan().build())
                .setMainCourse(MainCourseBuilder.builder().setName("Pasta ai frutti di mare").setSupplement("Lemon").buildMain())
                .setDessert(new Dessert("Tiramisu")).build();

        System.out.println(menu);
    }

}