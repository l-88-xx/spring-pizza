package pl.pizza.pizza_spring.order;

import pl.pizza.pizza_spring.delivery.IPizzaDelivery;
import pl.pizza.pizza_spring.model.Pizza;

public class ByPhone implements IPizzaOrder {

    private IPizzaDelivery delivery;

    public void setDelivery(IPizzaDelivery delivery) {
        this.delivery = delivery;
    }

    @Override
    public Pizza orderPizza(String type) {
        Pizza pizza = delivery.deliverPizza(type);
        pizza.addHistory("Zamówiona przez: telefon");
        return pizza;
    }
}