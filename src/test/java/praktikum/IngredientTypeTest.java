package praktikum;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class IngredientTypeTest {

    @Test
    public void sauceTest() {
        assertThat(IngredientType.valueOf("SAUCE"), is(notNullValue()));
    }

    @Test
    public void fillingTest() {
        assertThat(IngredientType.valueOf("FILLING"), is(notNullValue()));

    }
}
