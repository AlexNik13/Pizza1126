import pizza.Pizza;

import java.util.ArrayList;

public class Check {
    private ArrayList<Pizza> pizzas = new ArrayList<>();

    public void addPizza(Pizza pizza){
        pizzas.add(pizza);
    }

    public void prinCheck(){
        for (int i = 0; i < pizzas.size(); i++) {
            System.out.println((i + 1) + " " + pizzas.get(i).getName() + " цена: " + pizzas.get(i).getPrice());
        }
    }
}
