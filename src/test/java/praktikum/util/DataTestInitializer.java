package praktikum.util;

import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;

public class DataTestInitializer {

    public final static String BUN_NAME = "red bun";
    public final static int BUN_PRISE = 300;

    public static Object[] sauce() {
        return new Object[] {
                "chili sauce",
                300,
                SAUCE
        };
    }

    public static Object[] filling() {
        return new Object[] {
                "cutlet",
                100,
                FILLING
        };
    }
}
