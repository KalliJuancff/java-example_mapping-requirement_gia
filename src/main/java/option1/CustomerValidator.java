package option1;

public class CustomerValidator {
    public boolean validate(Customer customer) {
        return (customer.hasAddress() || customer.hasMobilePhoneNumber()) && (customer.hasMobilePhoneNumber() || customer.hasWorkPhoneNumber());
    }

}
