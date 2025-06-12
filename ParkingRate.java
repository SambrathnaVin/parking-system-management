import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParkingRate {
    
    String vehicleType;
    String rateType;
    double rateValue;
    int minDuration;
    int maxDuration;
    LocalDate effectiveStartDate;
    LocalDate effectiveEndDate;
    
    
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
