package pl.pizza.pizza_spring.bake;

import pl.pizza.pizza_spring.model.Pizza;

public class PizzaHut implements IPizzaBake {

    @Override
    public Pizza bakePizza(String type) {
        Pizza pizza = new Pizza(type);
        pizza.addHistory("Upieczona przez: PizzaHut");
        return pizza;
    }
}