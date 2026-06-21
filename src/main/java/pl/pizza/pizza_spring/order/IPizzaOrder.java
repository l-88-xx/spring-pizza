package pl.pizza.pizza_spring.order;

import pl.pizza.pizza_spring.model.Pizza;

public interface IPizzaOrder {
    Pizza orderPizza(String type);
}
