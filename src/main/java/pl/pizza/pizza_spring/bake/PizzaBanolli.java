package pl.pizza.pizza_spring.bake;

import pl.pizza.pizza_spring.model.Pizza;

public class PizzaBanolli implements IPizzaBake {

    @Override
    public Pizza bakePizza(String type) {
        return new Pizza(type);
    }
}