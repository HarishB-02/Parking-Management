package details;

import java.time.LocalDateTime;
import java.util.UUID;

public class Details {

    private UUID id;
    private String vehicleNumber;
    private String vehicleType;
    private LocalDateTime entryTime;
    private String phoneNumber;
    private String tokenNumber;
    private float price;
    
    public Details() {

    }

    public Details(UUID id, String vehicleNumber, String vehicleType, LocalDateTime entryTime, String phoneNumber,
            String tokenNumber, float price) {
        this.id = id;
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.entryTime = entryTime;
        this.phoneNumber = phoneNumber;
        this.tokenNumber = tokenNumber;
        this.price = price;
    }

    
    @Override
    public String toString() {
        return "Details [id=" + id + ", vehicleNumber=" + vehicleNumber + ", vehicleType=" + vehicleType
                + ", entryTime=" + entryTime + ", phoneNumber=" + phoneNumber + ", tokenNumber=" + tokenNumber
                + ", price=" + price + "]";
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTokenNumber() {
        return tokenNumber;
    }

    public void setTokenNumber(String tokenNumber) {
        this.tokenNumber = tokenNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
}
