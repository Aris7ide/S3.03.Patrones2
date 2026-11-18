package N1.models.mainCourse;

import N1.models.appetizer.interfaces.Build;
import N1.models.appetizer.interfaces.Name;

public class MainCourseBuilder implements {

    private String name;
    private String supplement;
    private boolean vegan = false;
    private boolean celiac = false;

    public MainCourseBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public MainCourseBuilder setSupplement(String supplement) {
        this.supplement = supplement;
        return this;
    }

    public MainCourseBuilder setVegan(boolean vegan) {
        this.vegan = true;
        return this;
    }

    public MainCourseBuilder setCeliac(boolean celiac) {
        this.celiac = true;
        return this;
    }

    public String getName() {
        return name;
    }
    public String getSupplement() {
        return supplement;
    }
    public boolean isVegan() {
        return vegan;
    }
    public boolean isCeliac() {
        return celiac;
    }
}
