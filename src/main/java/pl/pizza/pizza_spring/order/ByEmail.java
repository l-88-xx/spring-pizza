package pl.pizza.pizza_spring.order;

import pl.pizza.pizza_spring.delivery.IPizzaDelivery;
import pl.pizza.pizza_spring.model.Pizza;

public class ByEmail implements IPizzaOrder {

    private final IPizzaDelivery delivery;

    public ByEmail(IPizzaDelivery delivery) {
        this.delivery = delivery;
    }

    @Override
    public Pizza orderPizza(String type) {
        Pizza pizza = delivery.deliverPizza(type);
        pizza.addHistory("Zamówiona przez: email");
        return pizza;
    }
}