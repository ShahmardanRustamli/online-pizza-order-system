package service.impl;

import data.GlobalData;
import data.PizzaOrder;
import enums.ExceptionEnum;
import enums.Orders;
import enums.StatusEnum;
import model.Customer;
import response.GeneralResponse;
import service.CustomerService;
import util.InputUtil;

import java.util.List;

import static data.GlobalData.customerList;
import static helper.Helper.fillCustomer;

public class ICustomerService implements CustomerService {
    PizzaOrder order = new PizzaOrder();
    @Override
    public GeneralResponse<List<Customer>> customerRegister() {
        System.out.println("----------| CUSTOMER REGISTER | ----------");
        Customer customer =  fillCustomer();
        customerList.add(customer);
        return new GeneralResponse<List<Customer>>().of(StatusEnum.REGISTER_SUCCESSFULLY.getMessage());
    }

    @Override
    public GeneralResponse<List<Customer>> customerLogin() {
        if (customerList.isEmpty()){
            System.out.println(ExceptionEnum.EMPTY_LIST_EXCEPTION);
            System.out.println("You Must Register First!");
            Customer customer = fillCustomer();
            customerList.add(customer);

        }
        else {
            String email = InputUtil.getInstance().inputString("Enter The e-mail:");
            String password = InputUtil.getInstance().inputString("Enter The Password:");
            for (Customer customer : customerList) {
                if (customer.getEmail().equalsIgnoreCase(email)&&customer.getPassword().equalsIgnoreCase(password)){

                }
            }
        }
        return new GeneralResponse<List<Customer>>().of("Login Successfully!");
    }

    @Override
    public GeneralResponse<List<Customer>> placeOrder() {
        double total =0;
        while (true){
            System.out.println("Available Pizzas:");
            for (int i = 0; i < Orders.values().length; i++) {
                System.out.println(i+1+". "+ Orders.values()[i].getName()+ ". "+ Orders.values()[i].getPrice());
            }
            System.out.println("0. CHECKOUT AND FINISH ORDER");
            byte choice = InputUtil.getInstance().inputByte("Enter Number To Order Pizza:");
            if (choice == 0){
                Customer customer = customerList.get(0);
                customer.decreaseBalance(total);
                System.out.println("Thank you for your order!");
                System.out.println("Your Current Balance: "+customer.getMoneyAccount() + " $");
                break;
            } else if (choice>= 1 && choice<=Orders.values().length) {
                Orders orders = Orders.values()[choice-1];
                order.addPizza(orders);
                total = order.calculateTotal();
                System.out.println("Total: $"+ total);
                System.out.println("Added " + orders.getName() + " to your order");

            }else {
                System.out.println(ExceptionEnum.INVALID_CHOICE_EXCEPTION);
            }
        }
        System.out.println("Your Order: ");
        for (Orders orders : order.getPizzas()){
            System.out.println(orders.getName()+ " - $"+orders.getPrice());
        }
        return new GeneralResponse<List<Customer>>().of("Order Successfully!");
    }

    @Override
    public GeneralResponse<List<Customer>> trackOrder() {
        System.out.println("----------------| YOUR ORDERS |---------------- ");
        for (Orders orders : order.getPizzas()){
            System.out.println(orders.getName()+ " - $"+orders.getPrice());
        }
        return new GeneralResponse<List<Customer>>().of("Orders Showed!");

    }

    @Override
    public GeneralResponse<List<Customer>> cancelOrder() {
        return null;
    }
}
