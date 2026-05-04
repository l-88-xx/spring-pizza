package pl.pizza.pizza_spring.bake;


import org.springframework.stereotype.Component;
import pl.pizza.pizza_spring.model.Pizza;

@Component
public class PizzaBanolli implements IPizzaBake {

    @Override
    public Pizza bake(String type) {
        return new Pizza(type);
    }
}