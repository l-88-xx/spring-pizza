package pl.pizza.pizza_spring.bake;

import pl.pizza.pizza_spring.model.Pizza;

public class PizzaBake implements IPizzaBake {

    private IPizzaBake next;

    public void setNext(IPizzaBake next) {
        this.next = next;
    }

    @Override
    public Pizza bakePizza(String type) {
        Pizza pizza = next.bakePizza(type);
        pizza.addHistory("Upieczona przez: PizzaBake");
        return pizza;
    }
}