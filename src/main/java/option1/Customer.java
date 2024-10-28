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

    public boolean hasWorkPhoneNumber() {
        return !workPhoneNumber.isEmpty();
    }

    public boolean hasAddress() {
        return !address.isEmpty();
    }

    public boolean hasMobilePhoneNumber() {
        return !mobilePhoneNumber.isEmpty();
    }
}
