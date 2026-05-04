package pl.pizza.pizza_spring.bake;

import org.springframework.stereotype.Component;
import pl.pizza.pizza_spring.model.Pizza;

@Component
public class PizzaHut implements IPizzaBake {

    private IPizzaBake next;

    public void setNext(IPizzaBake next) {
        this.next = next;
    }

    @Override
    public Pizza bake(String type) {
        Pizza pizza = next.bake(type);
        pizza.addHistory("Upieczona przez: PizzaHut");
        return pizza;
    }
}