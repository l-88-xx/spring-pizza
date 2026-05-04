package pl.pizza.pizza_spring.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.pizza.pizza_spring.delivery.PizzaDelivery;
import pl.pizza.pizza_spring.model.Pizza;

@Component
public class ByPhone implements IPizzaOrder {

    private final PizzaDelivery delivery;

    @Autowired
    public ByPhone(PizzaDelivery delivery) {
        this.delivery = delivery;
    }

    private IPizzaOrder next;

    public void setNext(IPizzaOrder next) {
        this.next = next;
    }

    @Override
    public Pizza order(String type) {
        Pizza pizza = next.order(type);
        pizza.addHistory("Zamówiona przez: telefon");
        return pizza;
    }
}