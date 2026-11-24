package N2.models;

public interface Observable {

    void addObserver(Observer o);
    void removeObserver(N2.models.Observer o);
    void notifyObservers();
}
