package pl.pizza.pizza_spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.pizza.pizza_spring.bake.IPizzaBake;
import pl.pizza.pizza_spring.bake.PizzaHut;
import pl.pizza.pizza_spring.delivery.ByCar;
import pl.pizza.pizza_spring.delivery.IPizzaDelivery;
import pl.pizza.pizza_spring.order.ByPhone;
import pl.pizza.pizza_spring.order.IPizzaOrder;

@Configuration
public class AppConfig {

    @Bean
    public IPizzaBake pizzaBake() {
        return new PizzaHut();
    }

    @Bean
    public IPizzaDelivery pizzaDelivery(IPizzaBake bake) {
        return new ByCar(bake);   // constructor injection
    }

    @Bean
    public IPizzaOrder pizzaOrder(IPizzaDelivery delivery) {
        ByPhone byPhone = new ByPhone();
        // przez setter
        byPhone.setDelivery(delivery);
        return byPhone;
    }
}