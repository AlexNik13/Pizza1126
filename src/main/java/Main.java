import ingredient.Ingredient;
import pizza.Pizza;
import pizza.SizePizza;

public class Main {

    public static void main(String[] args) {


        Ingredient ingredient1 = new Ingredient("Тесто", 80);
        Ingredient ingredient2 = new Ingredient("Мясо", 130);
        Ingredient ingredient3 = new Ingredient("Колбаса", 220);
        Ingredient ingredient4 = new Ingredient("Ананасы", 120);
        Ingredient ingredient5 = new Ingredient("Сыр", 220);
        Ingredient ingredient6 = new Ingredient("Кетчуп", 50);

        Pizza pizza = new Pizza("Meat", SizePizza.SMALL);

        pizza.addIngredient(ingredient1);
        pizza.addIngredient(ingredient2);
        pizza.addIngredient(ingredient3);
        pizza.addIngredient(ingredient4);
        pizza.addIngredient(ingredient5);
        pizza.addIngredient(ingredient6);

        System.out.println(pizza);

        Pizza pizza2 = new Pizza("FreshMeat", SizePizza.BIG);

        pizza2.addIngredient(ingredient1);
        pizza2.addIngredient(ingredient2);
        pizza2.addIngredient(ingredient3);
        pizza2.addIngredient(ingredient4);
        pizza2.addIngredient(ingredient5);
        pizza2.addIngredient(ingredient6);
        System.out.println(pizza2);

    }
}
