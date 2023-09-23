package enums;

public enum StatusEnum {
    LOGIN_SUCCESSFULLY("Login Successfully!"),

    REGISTER_SUCCESSFULLY("Register Successfully!");

    String message;

    StatusEnum(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
