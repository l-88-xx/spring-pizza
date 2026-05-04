package pl.pizza.pizza_spring.order;

import pl.pizza.pizza_spring.model.Pizza;

public interface IPizzaOrder {
    Pizza order(String type);
}
