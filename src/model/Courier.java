package model;

import java.time.LocalDateTime;

public class Courier {
    private long courierId;
    private String name;
    private String phoneNumber;
    private String vehicleType;
    private String VehiclePlate;
    private long orderId;
    private boolean availabilityStatus;
    private LocalDateTime registerDate;


    public Courier(long courierId, String name, String phoneNumber, String vehicleType, String vehiclePlate, LocalDateTime registerDate) {
        this.courierId = courierId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.vehicleType = vehicleType;
        VehiclePlate = vehiclePlate;
        this.registerDate = registerDate;
    }

    public LocalDateTime getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDateTime registerDate) {
        this.registerDate = registerDate;
    }

    public long getCourierId() {
        return courierId;
    }

    public void setCourierId(long courierId) {
        this.courierId = courierId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehiclePlate() {
        return VehiclePlate;
    }

    public void setVehiclePlate(String vehiclePlate) {
        VehiclePlate = vehiclePlate;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public boolean isAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(boolean availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "courierId=" + courierId +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", VehiclePlate='" + VehiclePlate + '\'' +
                ", orderId=" + orderId +
                ", availabilityStatus=" + availabilityStatus +
                ", registerDate=" + registerDate +
                '}';
    }
}
