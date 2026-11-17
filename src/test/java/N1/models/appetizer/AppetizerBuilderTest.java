package N1.models.appetizer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppetizerBuilderTest {

    @Test
    void shouldCreateAppetizer() {
        AppetizerBuilder appetizerBuilder = new AppetizerBuilder();
        Appetizer appetizer = appetizerBuilder.setName("Caprese").itsCeliac().build();

        System.out.println(appetizer.toString());
    }

}