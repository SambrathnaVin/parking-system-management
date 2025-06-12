public class Staff {
    private String staff_id;
    private String staff_name;
    private String staff_dob;
    private String contact_number;
    private String email;

    public String staff_work_experience;
    public String staff_role;
    public String staff_workshift;
    public String staff_first_work_day;

    public Staff(String staff_id, String staff_name, String staff_dob, String contact_number, String email,
            String staff_work_experience, String staff_role, String staff_workshift, String staff_first_work_day) {
        this.staff_id = staff_id;
        this.staff_name = staff_name;
        this.staff_dob = staff_dob;
        this.contact_number = contact_number;
        this.email = email;
        this.staff_work_experience = staff_work_experience;
        this.staff_role = staff_role;
        this.staff_workshift = staff_workshift;
        this.staff_first_work_day = staff_first_work_day;
    }

    public String getStaff_id() {
        return staff_id;
    }

    public String getStaff_name() {
        return staff_name;
    }

    public String getStaff_dob() {
        return staff_dob;
    }

    public String getContact_number() {
        return contact_number;
    }

    public String getEmail() {
        return email;
    }

    public void setStaff_name(String staff_name) {
        this.staff_name = staff_name;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void displayStaffInfo() {

    }
}