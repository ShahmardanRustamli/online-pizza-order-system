package management;

import service.AdminService;
import service.impl.IAdminService;

import static util.MenuUtil.*;

public class IManagementService implements ManagementService{

    @Override
    public void management() {
        CustomerManagement customerManagement = new ICustomerManagement();
        AdminManagement adminManagement = new IAdminManagement();
        while(true){
            byte option = entryMenu();
            switch (option) {
                case 0:
                    System.exit(-1);
                    break;
                case 1:
                    adminManagement.management();
                    break;
                case 2:
                    customerManagement.customerManagement();
                    break;
            }
        }
    }
}
