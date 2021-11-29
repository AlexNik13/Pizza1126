package pizza;

import ingredient.Ingredient;

public class IngredientPizza extends Ingredient {
    private int amount;
    private double priceIngredientPizza;

    public IngredientPizza(Ingredient ingredient) {
        super(ingredient.getName(), ingredient.getPrice());

    }

    public IngredientPizza(Ingredient ingredient, int amount) {
        super(ingredient.getName(), ingredient.getPrice());
        this.amount = amount;
    }


    public int getAmount() {
        return amount;
    }


    public double getPriceIngredientInPizza() {
        return super.getPrice() /1000 * amount;
    }


}
