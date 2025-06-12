import java.util.Date;

public class Transaction {
    private int transactionID; // Unique and mandatory
    private Date transactionDate;
    private String amount; // Stored as String for currency symbol, but can be changed to BigDecimal
    private Timestamp timestamp; // Composite
    private String paymentMethod; // e.g., "Cash", "Card"

    // Constructor
    public Transaction(int transactionID, Date transactionDate, String amount, Timestamp timestamp, String paymentMethod) {
        this.transactionID = transactionID;
        this.transactionDate = transactionDate;
        this.amount = amount;
        this.timestamp = timestamp;
        this.paymentMethod = paymentMethod;
    }

    // Getters and Setters
    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    // Inner class for composite timestamp
    public static class Timestamp {
        private String startTime;
        private String endTime;

        public Timestamp(String startTime, String endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }

        public String getStartTime() {
            return startTime;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        public String getEndTime() {
            return endTime;
        }

        public void setEndTime(String endTime) {
            this.endTime = endTime;
        }

        @Override
        public String toString() {
            return startTime + " - " + endTime;
        }
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionID=" + transactionID +
                ", transactionDate=" + transactionDate +
                ", amount='" + amount + '\'' +
                ", timestamp=" + timestamp +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}
