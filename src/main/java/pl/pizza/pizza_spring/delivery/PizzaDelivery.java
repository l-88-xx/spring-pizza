package pl.pizza.pizza_spring.delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.pizza.pizza_spring.model.Pizza;

@Component
public class PizzaDelivery {

    private final IPizzaDelivery chain;

    @Autowired
    public PizzaDelivery(IPizzaDelivery chain) {
        this.chain = chain;
    }

    public Pizza deliverPizza(String type) {
        return chain.deliver(type);
    }
}