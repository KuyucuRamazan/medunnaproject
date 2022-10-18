package pojos.Us009;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import pojos.Us001.UserPojo;

@JsonIgnoreProperties(ignoreUnknown = true)

public class PatientPojo {

    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private UserPojo user;


    public PatientPojo() {
    }

    public PatientPojo(String firstName, String lastName, String phone, String email, UserPojo user) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.user = user;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserPojo getUser() {
        return user;
    }

    public void setUser(UserPojo user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "PatientPojo{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", user=" + user +
                '}';
    }
}
