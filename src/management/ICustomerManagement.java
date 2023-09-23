package management;

import service.CustomerService;
import service.impl.ICustomerService;

import static util.MenuUtil.*;

public class ICustomerManagement implements CustomerManagement{

    public void customerManagement(){
        CustomerService customerService = new ICustomerService();
        ManagementService managementService = new IManagementService();
        while (true){
            byte option = customerMenu();
            switch (option){
                case 0:
                    System.exit(-1);
                    break;
                case 1:
                    customerService.customerLogin();
                    while (true){
                        byte login = orderMenu();
                        switch (login){
                            case 0:
                                System.exit(-1);
                                break;
                            case 1:
                                break;
                            case 2:
                                customerService.placeOrder();
                                break;
                            case 3:
                                customerService.trackOrder();
                                break;
                            case 4:
                                customerService.cancelOrder();
                                break;
                        }
                    }
                case 2:
                    customerService.customerRegister();
                    break;
                case 3:
                    managementService.management();
                    break;

            }
        }
    }
}
