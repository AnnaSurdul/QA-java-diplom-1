package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;
import static praktikum.util.BurgerParametrized.*;

@RunWith(Parameterized.class)
public class ParameterizedBurgerTest {

    private final Burger burger;
    private final float priceExpected;
    private final String receiptExpected;


    public ParameterizedBurgerTest(Burger burger, float priceExpected, String receiptExpected) {
        this.burger = burger;
        this.priceExpected = priceExpected;
        this.receiptExpected = receiptExpected;
    }

    @Parameterized.Parameters
    public static Object[][] burgerCompound() {
        return new Object[][]{param1(), param2(), param3()};
    }

    @Test
    public void shouldGetPrice() {
        assertEquals(priceExpected, burger.getPrice(), 0);
    }

    @Test
    public void shouldGetReceipt() {
        assertEquals(receiptExpected, burger.getReceipt());
    }
}
