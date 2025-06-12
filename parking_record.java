import java.time.LocalDate;
import java.util.List;

public class ParkingRecord {
    private String vehicleID; // e.g., "53719" or "PP-9999"
    private String parkingSpotID; // e.g., "888999"
    private LocalDate entryTime; // e.g., 2025-06-07
    private LocalDate exitTime; // e.g., 2025-06-08
    private List<String> entryLaneIDs; // e.g., ["Lane 1", "Lane 3"]
    private List<String> exitLaneIDs; // e.g., ["Lane 2", "Lane 4"]
    private String ticketNumber; // e.g., "TKT-001234"

    public ParkingRecord(String vehicleID, String parkingSpotID, LocalDate entryTime, LocalDate exitTime,
                         List<String> entryLaneIDs, List<String> exitLaneIDs, String ticketNumber) {
        if (vehicleID == null || vehicleID.isEmpty()) {
            throw new IllegalArgumentException("Vehicle ID is mandatory.");
        }
        this.vehicleID = vehicleID;
        this.parkingSpotID = parkingSpotID;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
        this.entryLaneIDs = entryLaneIDs;
        this.exitLaneIDs = exitLaneIDs;
        this.ticketNumber = ticketNumber;
    }

    // Getters and setters
    public String getVehicleID() { return vehicleID; }
    public void setVehicleID(String vehicleID) { this.vehicleID = vehicleID; }

    public String getParkingSpotID() { return parkingSpotID; }
    public void setParkingSpotID(String parkingSpotID) { this.parkingSpotID = parkingSpotID; }

    public LocalDate getEntryTime() { return entryTime; }
    public void setEntryTime(LocalDate entryTime) { this.entryTime = entryTime; }

    public LocalDate getExitTime() { return exitTime; }
    public void setExitTime(LocalDate exitTime) { this.exitTime = exitTime; }

    public List<String> getEntryLaneIDs() { return entryLaneIDs; }
    public void setEntryLaneIDs(List<String> entryLaneIDs) { this.entryLaneIDs = entryLaneIDs; }

    public List<String> getExitLaneIDs() { return exitLaneIDs; }
    public void setExitLaneIDs(List<String> exitLaneIDs) { this.exitLaneIDs = exitLaneIDs; }

    public String getTicketNumber() { return ticketNumber; }
    public void setTicketNumber(String ticketNumber) { this.ticketNumber = ticketNumber; }

    @Override
    public String toString() {
        return "ParkingRecord{" +
                "vehicleID='" + vehicleID + '\'' +
                ", parkingSpotID='" + parkingSpotID + '\'' +
                ", entryTime=" + entryTime +
                ", exitTime=" + exitTime +
                ", entryLaneIDs=" + entryLaneIDs +
                ", exitLaneIDs=" + exitLaneIDs +
                ", ticketNumber='" + ticketNumber + '\'' +
                '}';
    }
}
