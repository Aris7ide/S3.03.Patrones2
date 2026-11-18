package N1.models.mainCourse;

public class MainCourse {

    private final String name;
    private final String supplement;
    private final boolean vegan;
    private final boolean celiac;

    public MainCourse(MainCourseBuilder builder) {
        this.name = builder.getName();
        this.supplement = builder.getSupplement();
        this.vegan = builder.isVegan();
        this.celiac = builder.isCeliac();
    }

    @Override
    public String toString() {
        return this.name + " with supplement: "  + this.supplement + " " + (this.vegan? "(Vegan)" : "") + (this.celiac? "(Celiac)" : "");
    }
}
