package management;

import service.AdminService;
import service.impl.IAdminService;

import static util.MenuUtil.adminMenu;
import static util.MenuUtil.entryMenu;

public class IAdminManagement implements AdminManagement {
    @Override
    public void management() {
        AdminService adminService = new IAdminService();
        ManagementService managementService = new IManagementService();
        boolean checkAdminLogin = adminService.adminLogin();
        if (checkAdminLogin) {

            byte option = adminMenu();

            switch (option) {

                case 0:
                    System.exit(-1);
                    break;
                case 1:
                    managementService.management();
                    break;
                case 2:
                    adminService.addCourier();
                    break;
                case 3:
                    adminService.trackOrders();
                    break;
                case 4:
                    adminService.viewCouriers();
                    break;
                case 5:
                    adminService.viewCustomers();
                    break;
            }

        }
        else {
            System.out.println("TOO MANY WRONG ATTEMPTS!");
            System.exit(-1);
        }
    }

}