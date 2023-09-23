package enums;

public enum ExceptionEnum {

    INVALID_LOGIN("Invalid Login!"),
    UNSUCCESSFULLY_REGISTER("Unsuccessfully Register!"),
    COURIER_REGISTER_FAILED("Courier Register failed!"),
    EMPTY_LIST_EXCEPTION("Customer Not Found!"),
    INVALID_CHOICE_EXCEPTION("Invalid Order Choice!");

    String message;

    ExceptionEnum(String message){
        this.message = message;
    }


    public String getMessage(){
        return message;
    }
}
