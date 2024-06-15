package praktikum.util;

import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;

import java.util.List;

import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;

public class BurgerParametrized {

    public static Object[] param1() {
        return new Object[]{
                burger1(), 500,
                "(==== black bun ====)\r\n" +
                        "= sauce hot sauce =\r\n" +
                        "= filling dinosaur =\r\n" +
                        "(==== black bun ====)\r\n" +
                        "\r\nPrice: 500,000000\r\n"
        };
    }

    public static Object[] param2() {
        return new Object[]{
                burger2(), 1200,
                "(==== white bun ====)\r\n" +
                        "= sauce chili sauce =\r\n" +
                        "= filling sausage =\r\n" +
                        "= sauce sour cream =\r\n" +
                        "(==== white bun ====)\r\n" +
                        "\r\nPrice: 1200,000000\r\n"
        };
    }

    public static Object[] param3() {
        return new Object[]{
                burger3(), 1100,
                "(==== red bun ====)\r\n" +
                        "= filling cutlet =\r\n" +
                        "= filling sausage =\r\n" +
                        "= sauce hot sauce =\r\n" +
                        "(==== red bun ====)\r\n" +
                        "\r\nPrice: 1100,000000\r\n"
        };
    }

    private static Burger burger1() {
        Bun black_bun = new Bun("black bun", 100);
        List<Ingredient> ingredients = List.of(new Ingredient(SAUCE, "hot sauce", 100),
                new Ingredient(FILLING, "dinosaur", 200));
        Burger burger = new Burger();
        burger.bun = black_bun;
        burger.ingredients = ingredients;
        return burger;
    }

    private static Burger burger2() {
        Bun white_bun = new Bun("white bun", 200);
        List<Ingredient> ingredients = List.of(new Ingredient(SAUCE, "chili sauce", 300),
                new Ingredient(FILLING, "sausage", 300),
                new Ingredient(SAUCE, "sour cream", 200));
        Burger burger = new Burger();
        burger.bun = white_bun;
        burger.ingredients = ingredients;
        return burger;
    }

    private static Burger burger3() {
        Bun red_bun = new Bun("red bun", 300);
        List<Ingredient> ingredients = List.of(new Ingredient(FILLING, "cutlet", 100),
                new Ingredient(FILLING, "sausage", 300),
                new Ingredient(SAUCE, "hot sauce", 100));
        Burger burger = new Burger();
        burger.bun = red_bun;
        burger.ingredients = ingredients;
        return burger;
    }
}
