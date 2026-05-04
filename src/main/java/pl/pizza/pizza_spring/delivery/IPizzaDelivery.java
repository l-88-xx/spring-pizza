package pl.pizza.pizza_spring.delivery;

import pl.pizza.pizza_spring.model.Pizza;

public interface IPizzaDelivery {
    Pizza deliver(String type);
}