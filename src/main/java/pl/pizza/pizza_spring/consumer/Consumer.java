package pl.pizza.pizza_spring.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.pizza.pizza_spring.model.Pizza;
import pl.pizza.pizza_spring.order.IPizzaOrder;

@Component
public class Consumer {

    private final IPizzaOrder order;

    @Autowired
    public Consumer(IPizzaOrder order) {
        this.order = order;
    }

    public void start() {
        Pizza pizza = order.orderPizza("Margherita");
        pizza.addHistory("Zamówił: Max Kowalski");
        pizza.printHistory();
    }
}