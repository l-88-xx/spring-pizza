package pl.pizza.pizza_spring.delivery;

import pl.pizza.pizza_spring.bake.IPizzaBake;
import pl.pizza.pizza_spring.model.Pizza;

public class ByCar implements IPizzaDelivery {

    private final IPizzaBake bake;

    public ByCar(IPizzaBake bake) {
        this.bake = bake;
    }

    @Override
    public Pizza deliverPizza(String type) {
        Pizza pizza = bake.bakePizza(type);
        pizza.addHistory("Dostarczona przez: samochodem");
        return pizza;
    }
}