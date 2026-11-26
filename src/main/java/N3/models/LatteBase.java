package N3.models;

public class LatteBase extends BubbleTeaDecorator implements BubbleTea {

    private String description;
    private double cost;

    public LatteBase(String description, double cost) {
        this.description = description;
        this.cost = cost;
    }

    public String getDescription() {
        return this.description;
    }

    public double getCost() {
        return this.cost;
    }
}
