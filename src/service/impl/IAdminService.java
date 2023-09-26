package service.impl;

import data.GlobalData;
import enums.ExceptionEnum;
import enums.StatusEnum;
import model.Admin;
import model.Courier;
import model.Customer;
import model.Order;
import response.GeneralResponse;
import service.AdminService;
import util.InputUtil;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static helper.Helper.fillCourier;

public class IAdminService implements AdminService {

    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASS = "admin";

    @Override
    public boolean adminLogin() {
        final byte MAX_ATTEMPTS = 3;
        byte attempt = 0;
        byte last_attempts = 3;
        System.out.println("------------| ADMIN LOGIN |-----------");
        while (attempt<MAX_ATTEMPTS){
            String username = InputUtil.getInstance().inputString("Enter Admin Username:");
            String password = InputUtil.getInstance().inputString("Enter Admin Password:");
            if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASS)) {
                return true;

            } else {
                System.err.println(ExceptionEnum.INVALID_LOGIN);
                System.out.println("Incorrect Password, Please Try Again!\n" +
                        "Your attempts: " + --last_attempts);
                attempt++;
            }
            if (attempt == MAX_ATTEMPTS){
                System.out.println("Limit Reached! System is Closing...");
            }

        }
        return false;

    }

    @Override
    public GeneralResponse<List<Courier>> addCourier() {
        System.out.println("------------- | ADD COURIER | -------------");
        int courierCount = InputUtil.getInstance().inputInt("Enter The Courier Count:");
        ArrayList<Courier> tempList = new ArrayList<>();
        for (int i = 0; i < courierCount; i++) {
            Courier courier = fillCourier();
            tempList.add(courier);
            GlobalData.courierList.add(courier);

        }
        return new GeneralResponse<>("Courier(s) Registered Successfully!", LocalDateTime.now(),tempList);
    }

    @Override
    public GeneralResponse<List<Order>> trackOrders() {
        return null;
    }

    @Override
    public GeneralResponse<List<Courier>> viewCouriers() {
        for (Courier courier : GlobalData.courierList){
            System.out.println(courier);
        }
        return new GeneralResponse<List<Courier>>().of("Couriers Showed Successfully!:");
    }

    @Override
    public GeneralResponse<List<Customer>> viewCustomers() {
        for (Customer customer : GlobalData.customerList){
            System.out.println(customer);
            if (GlobalData.customerList == null){
                System.out.println("There Are No Customers!: Customer List Is Empty!");
            }
        }
        return new GeneralResponse<List<Customer>>().of("Customer(s) Showed Successfully!");

    }
}
