package N1.models.mainCourse.interfaces;

public interface AfterNameMain extends BuildMain {
    AfterVeganMain isVegan();
    AfterCeliacMain isCeliac();
    AfterSupplement supplement();
}
