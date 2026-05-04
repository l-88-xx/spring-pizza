package pl.pizza.pizza_spring.delivery;

import org.springframework.stereotype.Component;
import pl.pizza.pizza_spring.model.Pizza;

@Component
public class ByBike implements IPizzaDelivery {

    private IPizzaDelivery next;

    public void setNext(IPizzaDelivery next) {
        this.next = next;
    }

    @Override
    public Pizza deliver(String type) {
        Pizza pizza = next.deliver(type);
        pizza.addHistory("Dostarczona przez: rowerem");
        return pizza;
    }
}