package option1;

public class Customer {
    private final String workPhoneNumber;
    private final String address;
    private final String mobilePhoneNumber;

    public Customer(String workPhoneNumber, String address, String mobilePhoneNumber) {
        this.workPhoneNumber = workPhoneNumber;
        this.address = address;
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getWorkPhoneNumber() {
        return workPhoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }
}
