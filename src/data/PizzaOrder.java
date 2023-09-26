package data;

import enums.Orders;

import java.util.ArrayList;
import java.util.List;

public class PizzaOrder {
    private static List<Orders> pizzas = new ArrayList<>();

    public void addPizza(Orders orders){
        pizzas.add(orders);
    }
    public double calculateTotal(){
        double total = 0;
        for (int i = 0; i < pizzas.size(); i++) {
            Orders orders = pizzas.get(i);
            total+=orders.getPrice();
        }
        return total;
    }

    public List<Orders> getPizzas(){
        return pizzas;

    }
}
