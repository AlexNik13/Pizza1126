package pizza;

import ingredient.Ingredient;

import java.util.ArrayList;

public class Pizza {
    private String name;
    private SizePizza size;
    private ArrayList<IngredientPizza> ingredients = new ArrayList<>();
    private double price;

    public Pizza(String name, SizePizza size) {
        this.name = name;
        this.size = size;
    }

    public void addIngredient(Ingredient ingredient){
        int amount = (size == SizePizza.BIG) ? 150:80;
        ingredients.add(new IngredientPizza(ingredient, amount));
    }

    public String getName() {
        return name;
    }

    public SizePizza getSize() {
        return size;
    }

    public ArrayList<IngredientPizza> getIngredients() {
        return ingredients;
    }

    public double getPrice() {
        price = 0;
        for (IngredientPizza ingredient : ingredients) {
            price += ingredient.getPriceIngredientInPizza();
        }
        return price;
    }

    @Override
    public String toString() {
        return "Pizza" +
                "\nname='" + name + '\'' +
                "\nsize=" + size +
                "\ningredients=" + ingredients +
                "\nprice=" + getPrice();
    }
}
