package N2.models;

import java.util.HashSet;
import java.util.Set;

public class StockAgent implements Observable {

    private final String name;
    private double marketValue;
    private final Set<N2.models.Observer> observers;

    public StockAgent(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
        this.observers = new HashSet<>();
    }

    public void addValue (double value){
        this.marketValue = this.marketValue + value;
        this.notifyObservers();
    }

    public void removeValue (double value){
        this.marketValue = this.marketValue - value;
        this.notifyObservers();
    }

    public Set<Observer> getObservers(){
        return this.observers;
    }

    public double getMarketValue() {
        return this.marketValue;
    }

    @Override
    public void addObserver(N2.models.Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(N2.models.Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (N2.models.Observer o : this.observers) {
            o.update();
        }
    }
}
