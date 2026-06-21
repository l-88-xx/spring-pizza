package pl.pizza.pizza_spring.bake;

import pl.pizza.pizza_spring.model.Pizza;

public interface IPizzaBake {
    Pizza bakePizza(String type);
}