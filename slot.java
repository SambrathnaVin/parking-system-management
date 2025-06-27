import java.util.Date;

public class slot {
    private int slotId; // Unique and mandatory
    private String slotStatus; // Occupied, Free
    private SlotLocation slotLocation; // Composite and mandatory
    private String slotType; // Open, Covered
    private String slotSize; // L, M, S
    private String isReserved; // Y, N
    private Date lastUpdated; // Composite (date + time)

    // Constructor
    public slottracker(int slotId, String slotStatus, SlotLocation slotLocation,
                       String slotType, String slotSize, String isReserved, Date lastUpdated) {
        this.slotId = slotId;
        this.slotStatus = slotStatus;
        this.slotLocation = slotLocation;
        this.slotType = slotType;
        this.slotSize = slotSize;
        this.isReserved = isReserved;
        this.lastUpdated = lastUpdated;
    }

    // Getters and Setters
    public int getSlotId() {
        return slotId;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    public String getSlotStatus() {
        return slotStatus;
    }

    public void setSlotStatus(String slotStatus) {
        this.slotStatus = slotStatus;
    }

    public SlotLocation getSlotLocation() {
        return slotLocation;
    }

    public void setSlotLocation(SlotLocation slotLocation) {
        this.slotLocation = slotLocation;
    }

    public String getSlotType() {
        return slotType;
    }

    public void setSlotType(String slotType) {
        this.slotType = slotType;
    }

    public String getSlotSize() {
        return slotSize;
    }

    public void setSlotSize(String slotSize) {
        this.slotSize = slotSize;
    }

    public String getIsReserved() {
        return isReserved;
    }

    public void setIsReserved(String isReserved) {
        this.isReserved = isReserved;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    // Static inner class for composite slot location
    public static class SlotLocation {
        private String floor;
        private String area;

        public SlotLocation(String floor, String area) {
            this.floor = floor;
            this.area = area;
        }

        public String getFloor() {
            return floor;
        }

        public void setFloor(String floor) {
            this.floor = floor;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        @Override
        public String toString() {
            return floor + "-" + area;
        }
    }

    @Override
    public String toString() {
        return "SlotTracker{" +
                "slotId=" + slotId +
                ", slotStatus='" + slotStatus + '\'' +
                ", slotLocation=" + slotLocation +
                ", slotType='" + slotType + '\'' +
                ", slotSize='" + slotSize + '\'' +
                ", isReserved='" + isReserved + '\'' +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}
