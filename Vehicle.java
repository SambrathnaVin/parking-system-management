import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Vehicle {
    
    private int vehicleId;
    private String vehicleType;
    private String vehicleModel;
    private String vehicleColor;
    private String plateNumber;
    private LocalDate registrationDate;
    
    
    public Vehicle(int vehicleId, String vehicleType, String vehicleModel, 
                   String vehicleColor, String plateNumber, String registrationDate) {
        this.vehicleId = vehicleId;
        this.vehicleType = vehicleType;
        this.vehicleModel = vehicleModel;
        this.vehicleColor = vehicleColor;
        this.plateNumber = plateNumber;
        this.registrationDate = LocalDate.parse(registrationDate, 
            DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    
    
    public int getVehicleId() {
        return vehicleId;
    }
    
    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }
    
    public String getVehicleType() {
        return vehicleType;
    }
    
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    
    public String getVehicleModel() {
        return vehicleModel;
    }
    
    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }
    
    public String getVehicleColor() {
        return vehicleColor;
    }
    
    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }
    
    public String getPlateNumber() {
        return plateNumber;
    }
    
    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }
    
    public LocalDate getRegistrationDate() {
        return registrationDate;
    }
    
    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }
}
