public class Customer {
    private String customer_id;
    private String customer_dob;
    private String customer_phone_number;
    private String customer_email;
    private String registration_date;

    public int loyalty_points;
    public String membership_status;

    public Customer(String customer_id, String customer_dob, String customer_phone_number,
            String customer_email, int loyalty_points, String membership_status, String registration_date) {
        this.customer_id = customer_id;
        this.customer_dob = customer_dob;
        this.customer_phone_number = customer_phone_number;
        this.customer_email = customer_email;
        this.loyalty_points = loyalty_points;
        this.membership_status = membership_status;
        this.registration_date = registration_date;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public String getCustomer_dob() {
        return customer_dob;
    }

    public String getCustomer_phone_number() {
        return customer_phone_number;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public String getRegistration_date() {
        return registration_date;
    }

    public void setCustomer_phone_number(String customer_phone_number) {
        this.customer_phone_number = customer_phone_number;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public void displayCustomerInfo() {

    }

    public void addLoyaltyPoints(int points) {

    }
}
