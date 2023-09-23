package enums;

public enum Orders {
    ITALIANO("Italiano Pizza",6.99),
    AMERICANO("Americano Pizza", 9.99),
    MEXICAN("Mexican Chili Pizza", 12.99),
    CHICKEN_KICKERS("Chicke Pizza", 7.99),
    MARGHERITA("Margherita Pizza",16.99);

    private final String name;
    private final double price;

    Orders(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }


}
