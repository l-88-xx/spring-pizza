package pl.pizza.pizza_spring.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.pizza.pizza_spring.model.Pizza;

@Component
public class PizzaOrder {

    private final IPizzaOrder chain;

    @Autowired
    public PizzaOrder(IPizzaOrder chain) {
        this.chain = chain;
    }

    public Pizza orderPizza(String type) {
        return chain.order(type);
    }
}