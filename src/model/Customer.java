package model;

import java.time.LocalDateTime;

public class Customer {
    private long customerId;
    private String name;
    private String surname;
    private String phoneNumber;
    private String email;
    private String password;
    private long orderId;
    private double moneyAccount;
    private LocalDateTime registrationDate;
    private boolean status;

    public Customer(long customerId, String name, String surname, String phoneNumber, String eMail, String password,double moneyAccount, LocalDateTime registrationDate, boolean status) {
        this.customerId = customerId;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.email = eMail;
        this.password = password;
        this.moneyAccount = moneyAccount;
        this.registrationDate = registrationDate;
        this.status = status;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public double getMoneyAccount() {
        return moneyAccount;
    }

    public void setMoneyAccount(double moneyAccount) {
        this.moneyAccount = 100;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", eMail='" + email + '\'' +
                ", password='" + password + '\'' +
                ", orderId=" + orderId +
                ", moneyAccount=" + moneyAccount +
                ", registrationDate=" + registrationDate +
                ", status=" + status +
                '}';
    }
    public Double decreaseBalance(double amount){
        if (amount>0 && moneyAccount>=amount){
            moneyAccount-=amount;
        }
        return moneyAccount;
    }
}
