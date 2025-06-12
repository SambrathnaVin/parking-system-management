import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParkingRate {
    
    private String vehicleType;
    private String rateType;
    private double rateValue;
    private int minDuration;
    private int maxDuration;
    private LocalDate effectiveStartDate;
    private LocalDate effectiveEndDate;
    
    
    public ParkingRate(String vehicleType, String rateType, double rateValue,
                       int minDuration, int maxDuration, String effectiveStartDate,
                       String effectiveEndDate) {
        this.vehicleType = vehicleType;
        this.rateType = rateType;
        this.rateValue = rateValue;
        this.minDuration = minDuration;
        this.maxDuration = maxDuration;
        this.effectiveStartDate = LocalDate.parse(effectiveStartDate,
            DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.effectiveEndDate = LocalDate.parse(effectiveEndDate,
            DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    
    
    public String getVehicleType() {
        return vehicleType;
    }
    
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    
    public String getRateType() {
        return rateType;
    }
    
    public void setRateType(String rateType) {
        this.rateType = rateType;
    }
    
    public double getRateValue() {
        return rateValue;
    }
    
    public void setRateValue(double rateValue) {
        this.rateValue = rateValue;
    }
    
    public int getMinDuration() {
        return minDuration;
    }
    
    public void setMinDuration(int minDuration) {
        this.minDuration = minDuration;
    }
    
    public int getMaxDuration() {
        return maxDuration;
    }
    
    public void setMaxDuration(int maxDuration) {
        this.maxDuration = maxDuration;
    }
    
    public LocalDate getEffectiveStartDate() {
        return effectiveStartDate;
    }
    
    public void setEffectiveStartDate(LocalDate effectiveStartDate) {
        this.effectiveStartDate = effectiveStartDate;
    }
    
    public LocalDate getEffectiveEndDate() {
        return effectiveEndDate;
    }
    
    public void setEffectiveEndDate(LocalDate effectiveEndDate) {
        this.effectiveEndDate = effectiveEndDate;
    }
    
    
    public double calculateParkingCost(int parkingDurationHours) {
        if (rateType.equalsIgnoreCase("Hourly")) {
            return rateValue * parkingDurationHours;
        } else if (rateType.equalsIgnoreCase("Daily")) {
            int days = (int) Math.ceil(parkingDurationHours / 24.0);
            return rateValue * days;
        }
        return 0.0;
    }
    
    
    public boolean isCurrentlyEffective() {
        LocalDate today = LocalDate.now();
        return !today.isBefore(effectiveStartDate) && !today.isAfter(effectiveEndDate);
    }
}

