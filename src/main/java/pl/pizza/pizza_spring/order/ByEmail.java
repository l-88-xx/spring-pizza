package pl.pizza.pizza_spring.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.pizza.pizza_spring.delivery.PizzaDelivery;
import pl.pizza.pizza_spring.model.Pizza;

@Component
public class ByEmail implements IPizzaOrder {

    private final PizzaDelivery delivery;

    @Autowired
    public ByEmail(PizzaDelivery delivery) {
        this.delivery = delivery;
    }

    @Override
    public Pizza order(String type) {
        Pizza pizza = delivery.deliverPizza(type);
        pizza.addHistory("Zamówiona przez: email");
        return pizza;
    }
}
