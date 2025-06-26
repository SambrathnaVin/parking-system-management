public class parkingevent {

    private String eventID;
    private String vehicleID;
    private String entryTime;
    private String exitTime;
    private String duration;
    private double feeAmount;
    private String slotID;
    private String staffID;

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

    public String getEventID() {
        return eventID;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public String getEntryTime() {
        return entryTime;
    }

    public String getExitTime() {
        return exitTime;
    }

    public String getDuration() {
        return duration;
    }

    public double getFeeAmount() {
        return feeAmount;
    }

    public String getSlotID() {
        return slotID;
    }
    public String getStaffID() {
        return staffID;
    }


    public void setEventID(String eventID) {
        this.eventID = eventID;
    }


    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }


    public void setExitTime(String exitTime) {
        this.exitTime = exitTime;
    }

  
    public void setDuration(String duration) {
        this.duration = duration;
    }


    public void setFeeAmount(double feeAmount) {
        this.feeAmount = feeAmount;
    }

  
    public void setSlotID(String slotID) {
        this.slotID = slotID;
    }

    
    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

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


