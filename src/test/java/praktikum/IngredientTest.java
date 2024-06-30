package praktikum;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;
import static praktikum.util.DataTestInitializer.filling;
import static praktikum.util.DataTestInitializer.sauce;

@RunWith(Parameterized.class)
public class IngredientTest {

    private final String name;

    private final int price;

    private final IngredientType type;

    private Ingredient ingredient;

    public IngredientTest(String name, int price, IngredientType type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    @Before
    public void init() {
        ingredient = new Ingredient(type, name, price);
    }

    @Parameterized.Parameters
    public static Object[][] burgerCompound() {
        return new Object[][]{sauce(), filling()};
    }

    @Test
    public void shouldGetName() {
        assertEquals(name, ingredient.getName());
    }

    @Test
    public void shouldGetPrise() {
        assertEquals(price, ingredient.getPrice(), 0);

    }

    @Test
    public void shouldGetType() {
        assertEquals(type, ingredient.getType());

    }
}
