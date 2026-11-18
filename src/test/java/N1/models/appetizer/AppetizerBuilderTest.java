package N1.models.appetizer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppetizerBuilderTest {

    @Test
    void shouldCreateAppetizer() {
        Appetizer appetizer = AppetizerBuilder.builder().setName("Caprese").build();
        Appetizer appetizer2 = AppetizerBuilder.builder().setName("Aubergine").isCeliac().isVegan().build();

        System.out.println(appetizer.toString());
        System.out.println(appetizer2.toString());
    }

}