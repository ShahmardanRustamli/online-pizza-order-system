package util;

public class MenuUtil {
    public static byte entryMenu(){
        System.out.println("""
                [0] - > Exit.
                [1] - > Admin.
                [2] - > Customer.
                """);

        return InputUtil.getInstance().inputByte("Choose Option:");
    }

    public static byte adminMenu(){
        System.out.println("""
                [0] - > Exit.
                [1] - > Back...
                [2] - > Add Courier.
                [3] - > Track Orders.
                [4] - > View Couriers.
                [5] - > View Customers.
                """);
        return InputUtil.getInstance().inputByte("Choose Option:");
    }
    public static byte customerMenu(){
        System.out.println("""
                [0] - > Exit.
                [1] - > Login.
                [2] - > Sign Up.
                [3] - > Back...
                """);

        return InputUtil.getInstance().inputByte("Choose Option:");
    }
    public static byte orderMenu(){
        System.out.println("""
                [0] - > Exit.
                [1] - > Back...
                [2] - > Place Orders.
                [3] - > Track Orders.
                [4] - > Cancel Orders. 
                """);
        return InputUtil.getInstance().inputByte("Choose Option:");
    }

    public static byte pizzaMenu(){
        System.out.println("""
                [1] - > Italiano.
                [2] - > Americano.
                [3] - > Mexican.
                [4] - > Chicken Kickers.
                [5] Margherita.
                """);
        return InputUtil.getInstance().inputByte("Choose Option:");
    }
}
