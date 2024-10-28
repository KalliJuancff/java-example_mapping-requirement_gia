package option1;

public class CustomerValidator {
    public boolean validate(Customer customer) {
        return (customer.hasWorkPhoneNumber() && customer.hasAddress()) || customer.hasMobilePhoneNumber();
    }
}
