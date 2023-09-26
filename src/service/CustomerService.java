package service;

import model.Customer;
import response.GeneralResponse;

import java.util.List;

public interface CustomerService {
    GeneralResponse<List<Customer>> customerRegister();
    GeneralResponse<List<Customer>> customerLogin();
    GeneralResponse<List<Customer>> placeOrder();
    GeneralResponse<List<Customer>> trackOrder();
    GeneralResponse<List<Customer>> cancelOrder();


}
