
public class parkingevent {

    // Unique identifier for the parking event.
    private String eventID;

    // Identifier for the vehicle involved in the parking event.
    private String vehicleID;

    // The time when the vehicle entered the parking slot.
    private String entryTime; // Using String for simplicity, consider java.time.LocalDateTime for real applications.

    // The time when the vehicle exited the parking slot.
    private String exitTime;  // Using String for simplicity, consider java.time.LocalDateTime for real applications.

    // The duration of the parking event.
    private String duration; // Using String, consider a dedicated Duration class or long for minutes/seconds.

    // The amount of fee charged for the parking event.
    private double feeAmount; // Using double for currency, consider java.math.BigDecimal for precision.

    // Identifier for the parking slot used.
    private String slotID;

    // Identifier for the staff member associated with the event.
    private String staffID;

    /**
     * Constructs a new ParkingEvent with the specified details.
     *
     * @param eventID The unique identifier for the parking event.
     * @param vehicleID The identifier for the vehicle.
     * @param entryTime The entry time of the vehicle.
     * @param exitTime The exit time of the vehicle.
     * @param duration The duration of the parking event.
     * @param feeAmount The fee amount for the parking event.
     * @param slotID The identifier for the parking slot.
     * @param staffID The identifier for the staff member.
     */
    public parkingevent(String eventID, String vehicleID, String entryTime, String exitTime,
                        String duration, double feeAmount, String slotID, String staffID) {
        this.eventID = eventID;
        this.vehicleID = vehicleID;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
        this.duration = duration;
        this.feeAmount = feeAmount;
        this.slotID = slotID;
        this.staffID = staffID;
    }

    // --- Getter Methods ---

    /**
     * Returns the unique identifier of the parking event.
     * @return The event ID.
     */
    public String getEventID() {
        return eventID;
    }

    /**
     * Returns the identifier of the vehicle involved.
     * @return The vehicle ID.
     */
    public String getVehicleID() {
        return vehicleID;
    }

    /**
     * Returns the entry time of the vehicle.
     * @return The entry time.
     */
    public String getEntryTime() {
        return entryTime;
    }

    /**
     * Returns the exit time of the vehicle.
     * @return The exit time.
     */
    public String getExitTime() {
        return exitTime;
    }

    /**
     * Returns the duration of the parking event.
     * @return The duration.
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Returns the fee amount for the parking event.
     * @return The fee amount.
     */
    public double getFeeAmount() {
        return feeAmount;
    }

    /**
     * Returns the identifier of the parking slot used.
     * @return The slot ID.
     */
    public String getSlotID() {
        return slotID;
    }

    /**
     * Returns the identifier of the staff member associated with the event.
     * @return The staff ID.
     */
    public String getStaffID() {
        return staffID;
    }

    // --- Setter Methods ---

    /**
     * Sets the unique identifier of the parking event.
     * @param eventID The new event ID.
     */
    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    /**
     * Sets the identifier of the vehicle involved.
     * @param vehicleID The new vehicle ID.
     */
    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    /**
     * Sets the entry time of the vehicle.
     * @param entryTime The new entry time.
     */
    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    /**
     * Sets the exit time of the vehicle.
     * @param exitTime The new exit time.
     */
    public void setExitTime(String exitTime) {
        this.exitTime = exitTime;
    }

    /**
     * Sets the duration of the parking event.
     * @param duration The new duration.
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * Sets the fee amount for the parking event.
     * @param feeAmount The new fee amount.
     */
    public void setFeeAmount(double feeAmount) {
        this.feeAmount = feeAmount;
    }

    /**
     * Sets the identifier of the parking slot used.
     * @param slotID The new slot ID.
     */
    public void setSlotID(String slotID) {
        this.slotID = slotID;
    }

    /**
     * Sets the identifier of the staff member associated with the event.
     * @param staffID The new staff ID.
     */
    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    /**
     * Provides a string representation of the ParkingEvent object.
     * This is useful for debugging and logging.
     * @return A string containing all the parking event details.
     */
    @Override
    public String toString() {
        return "ParkingEvent{" +
               "eventID='" + eventID + '\'' +
               ", vehicleID='" + vehicleID + '\'' +
               ", entryTime='" + entryTime + '\'' +
               ", exitTime='" + exitTime + '\'' +
               ", duration='" + duration + '\'' +
               ", feeAmount=" + feeAmount +
               ", slotID='" + slotID + '\'' +
               ", staffID='" + staffID + '\'' +
               '}';
    }
}


