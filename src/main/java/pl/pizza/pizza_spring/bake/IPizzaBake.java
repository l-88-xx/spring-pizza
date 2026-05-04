package pl.pizza.pizza_spring.bake;

import pl.pizza.pizza_spring.model.Pizza;

public interface IPizzaBake {
    Pizza bake(String type);
}