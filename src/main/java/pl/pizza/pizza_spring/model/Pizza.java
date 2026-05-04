package pl.pizza.pizza_spring.model;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private final String name;
    private final List<String> history = new ArrayList<>();

    public Pizza(String name) {
        this.name = name;
        addHistory("Pizza: " + name);
    }

    public void addHistory(String entry) {
        history.add(entry);
    }

    public void printHistory() {
        for (String entry : history) {
            System.out.println(entry);
        }
    }
}