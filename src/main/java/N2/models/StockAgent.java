package N2.models;

import java.util.HashSet;
import java.util.Observer;
import java.util.Set;

public class StockAgent implements Observable {

    public final String name;
    public double marketValue;
    public final Set<N2.models.Observer> observers;

    public StockAgent(String name, double marketValue,  Set<N2.models.Observer> observers) {
        this.name = name;
        this.marketValue = marketValue;
        this.observers = new HashSet<>();
    }

    public void addValue (int value){
        this.marketValue = this.marketValue + value;
        this.notifyObservers();
    }

    public void removeValue (int value){
        this.marketValue = this.marketValue - value;
        this.notifyObservers();
    }

    public void addObserver(N2.models.Observer o) {
        this.observers.add(o);
    }

    public void removeObserver(N2.models.Observer o) {
        this.observers.remove(o);
    }

    public void notifyObservers() {
        for (N2.models.Observer o : this.observers) {
            o.update();
        }
    }



}
