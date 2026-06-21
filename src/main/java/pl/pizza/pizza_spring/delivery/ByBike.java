package pl.pizza.pizza_spring.delivery;

import pl.pizza.pizza_spring.model.Pizza;

public class ByBike implements IPizzaDelivery {

    private IPizzaDelivery next;

    public void setNext(IPizzaDelivery next) {
        this.next = next;
    }

    @Override
    public Pizza deliverPizza(String type) {
        Pizza pizza = next.deliverPizza(type);
        pizza.addHistory("Dostarczona przez: rowerem");
        return pizza;
    }
}