package helper;

import enums.ExceptionEnum;
import exceptions.ApplicationException;
import model.Courier;
import model.Customer;
import util.InputUtil;

import java.time.LocalDateTime;

public class Helper {
    public static Customer fillCustomer(){
        try {
            int id = 0;
            String name = InputUtil.getInstance().inputString("Enter The Name:");
            String surname = InputUtil.getInstance().inputString("Enter The Surname:");
            String phoneNumber = InputUtil.getInstance().inputString("Enter The Phone Number:");
            String eMail = InputUtil.getInstance().inputString("Enter The e-mail Address:");
            String password = InputUtil.getInstance().inputString("Enter The Password:");
            LocalDateTime localDateTime = LocalDateTime.now();
            double moneyAccount = 100;

            boolean status = true;
            return new Customer(++id,name,surname,phoneNumber,eMail,password,moneyAccount,localDateTime.now(),status);
        }catch (ApplicationException exception){
            throw new ApplicationException(ExceptionEnum.UNSUCCESSFULLY_REGISTER);
        }
    }
    public static Courier fillCourier(){
        int id = 0;
        try {
            String name = InputUtil.getInstance().inputString("Enter The Courier Name:");
            String courierNumber = InputUtil.getInstance().inputString("Enter the Courier's Number:");
            String vehicleType = InputUtil.getInstance().inputString("Enter The Vehicle Type:");
            String vehicleNumber = InputUtil.getInstance().inputString("Enter The Vehicle Number:");
            LocalDateTime localDateTime = LocalDateTime.now();
            return new Courier(++id, name,courierNumber,vehicleType,vehicleNumber,localDateTime);
        }catch (ApplicationException exception){
            throw new ApplicationException(ExceptionEnum.COURIER_REGISTER_FAILED);
        }

    }
//    public static Customer decreaseMoney(){
//        Customer customer;
//        int leftBalance = customer.getMoneyAccount()-
//        return null;
//    }
}
