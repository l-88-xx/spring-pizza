package pl.pizza.pizza_spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import pl.pizza.pizza_spring.bake.IPizzaBake;
import pl.pizza.pizza_spring.bake.PizzaBake;
import pl.pizza.pizza_spring.bake.PizzaBanolli;
import pl.pizza.pizza_spring.bake.PizzaHut;
import pl.pizza.pizza_spring.delivery.ByBike;
import pl.pizza.pizza_spring.delivery.ByCar;
import pl.pizza.pizza_spring.delivery.IPizzaDelivery;
import pl.pizza.pizza_spring.order.ByEmail;
import pl.pizza.pizza_spring.order.ByPhone;
import pl.pizza.pizza_spring.order.IPizzaOrder;

// setter injection
// spięcie łańcucha


@Configuration
public class AppConfig {

    @Bean
    @Primary
    public IPizzaOrder order(ByPhone phone, ByEmail email) {
        phone.setNext(email);
        return phone;
    }

    @Bean
    @Primary
    public IPizzaBake bake(PizzaBake bake, PizzaHut hut, PizzaBanolli banolli) {
        bake.setNext(hut);
        hut.setNext(banolli);
        return bake;
    }

    @Bean
    @Primary
    public IPizzaDelivery delivery(ByBike bike, ByCar car) {
        bike.setNext(car);
        return bike;
    }
}