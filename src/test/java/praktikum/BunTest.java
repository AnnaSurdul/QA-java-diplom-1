package praktikum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static praktikum.util.DataTestInitializer.BUN_NAME;
import static praktikum.util.DataTestInitializer.BUN_PRISE;

public class BunTest {

    Bun bun = new Bun(BUN_NAME, BUN_PRISE);

    @Test
    public void shouldGetName() {
        assertEquals(BUN_NAME, bun.getName());
    }

    @Test
    public void shouldGetPrise() {
        assertEquals(BUN_PRISE, bun.getPrice(), 0);
    }
}
