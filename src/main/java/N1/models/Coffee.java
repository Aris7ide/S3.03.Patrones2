package N1.models;

public class Coffee {

    private final Type type;

    public Coffee(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.type.toString();
    }
}
