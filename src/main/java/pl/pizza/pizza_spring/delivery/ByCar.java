package pl.pizza.pizza_spring.delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.pizza.pizza_spring.bake.IPizzaBake;
import pl.pizza.pizza_spring.model.Pizza;

@Component
public class ByCar implements IPizzaDelivery {

    private final IPizzaBake bake;

    @Autowired
    public ByCar(IPizzaBake bake) {
        this.bake = bake;
    }

    @Override
    public Pizza deliver(String type) {
        Pizza pizza = bake.bake(type);
        pizza.addHistory("Dostarczona przez: samochodem");
        return pizza;
    }
}