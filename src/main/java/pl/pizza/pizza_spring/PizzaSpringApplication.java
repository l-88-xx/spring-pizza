package pl.pizza.pizza_spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.pizza.pizza_spring.consumer.Consumer;

@SpringBootApplication
public class PizzaSpringApplication implements CommandLineRunner {

    private final Consumer consumer;

    public PizzaSpringApplication(Consumer consumer) {
        this.consumer = consumer;
    }

    public static void main(String[] args) {
        SpringApplication.run(PizzaSpringApplication.class, args);
    }

    @Override
    public void run(String... args) {
        consumer.start();
    }
}