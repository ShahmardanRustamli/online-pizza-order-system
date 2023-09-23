package service;

import model.Admin;
import model.Courier;
import model.Customer;
import model.Order;
import response.GeneralResponse;

import java.util.List;

public interface AdminService {
    boolean adminLogin();
    GeneralResponse<List<Courier>> addCourier();
    GeneralResponse<List<Order>> trackOrders();
    GeneralResponse<List<Courier>> viewCouriers();
    GeneralResponse<List<Customer>> viewCustomers();


}
