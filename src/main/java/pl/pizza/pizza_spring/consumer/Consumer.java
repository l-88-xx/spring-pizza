package pl.pizza.pizza_spring.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.pizza.pizza_spring.model.Pizza;
import pl.pizza.pizza_spring.order.PizzaOrder;

@Component
public class Consumer {

    private final PizzaOrder order;

    @Autowired
    public Consumer(PizzaOrder order) {
        this.order = order;
    }

    public void start() {
        Pizza pizza = order.orderPizza("Margherita");
        pizza.printHistory();
    }
}