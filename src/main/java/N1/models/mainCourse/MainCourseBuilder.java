package N1.models.mainCourse;

import N1.models.mainCourse.interfaces.BuildMain;
import N1.models.mainCourse.interfaces.NameMain;
import N1.models.mainCourse.interfaces.OptionStepMain;

public class MainCourseBuilder implements NameMain, OptionStepMain, BuildMain {

    private String name;
    private String supplement;
    private boolean vegan = false;
    private boolean celiac = false;

    public static NameMain builder() {
        return new MainCourseBuilder();
    }

    @Override
    public MainCourseBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public MainCourseBuilder setSupplement(String supplement) {
        if (this.supplement != null) {
            throw new IllegalArgumentException("Supplement cannot be set twice!");
        }
        this.supplement = supplement;
        return this;
    }

    @Override
    public MainCourseBuilder setVegan() {
        if (this.vegan) {
            throw new IllegalStateException("Vegan already specified");
        }
        this.vegan = true;
        return this;
    }

    @Override
    public MainCourseBuilder setCeliac() {
        if (this.celiac) {
            throw new IllegalStateException("Celiac already set");
        }
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

    @Override
    public MainCourse buildMain(){
        return new MainCourse(this);
    }
}
