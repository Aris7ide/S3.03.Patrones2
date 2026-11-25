package N2.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StockAgentTest {

    StockAgent stockAgent;
    Observerr observer1;

    @BeforeEach
    void setUp() {
        stockAgent = new StockAgent("Nintendo", 245.600);
        observer1 = new Observerr("My Mother");
        stockAgent.addObserver(observer1);
    }

    @Test
    void shouldAddObserver() {
        stockAgent.addObserver(new Observerr("My father"));

        assertThat(stockAgent.getObservers().size()).isEqualTo(2);
    }

    @Test
    void shouldRemoveObserver() {
        stockAgent.removeObserver(observer1);

        assertThat(stockAgent.getObservers().size()).isEqualTo(0);
    }

    @Test
    void shouldNotifyObservers() {
        stockAgent.notifyObservers();

        assertThat(observer1.getNotified()).isEqualTo(1);
    }

    @Test
    void shouldNotifyAllObservers() {
        Observerr observer2 = new Observerr("My Father");
        Observerr observer3 = new Observerr("Myself");

        stockAgent.addObserver(observer2);
        stockAgent.addObserver(observer3);

        stockAgent.notifyObservers();

        assertThat(observer1.getNotified()).isEqualTo(1);
        assertThat(observer2.getNotified()).isEqualTo(1);
        assertThat(observer3.getNotified()).isEqualTo(1);
    }

    @Test
    void shouldNotifyWhenAddMarketValue() {
        stockAgent.addValue(234.00);

        assertThat(stockAgent.getMarketValue()).isEqualTo(479.6);

        assertThat(stockAgent.getObservers().size()).isEqualTo(1);
        assertThat(observer1.getNotified()).isEqualTo(1);
    }

    @Test
    void shouldNotifyWhenRemoveMarketValue() {
        stockAgent.removeValue(100.00);

        assertThat(stockAgent.getMarketValue()).isEqualTo(145.6);

        assertThat(stockAgent.getObservers().size()).isEqualTo(1);
        assertThat(observer1.getNotified()).isEqualTo(1);
    }



}