package option1;

public class CustomerValidator {
    public boolean validate(Customer customer) {
        if (!customer.hasAddress() && !customer.hasMobilePhoneNumber()) {
            return false;
        }

        if (!customer.hasMobilePhoneNumber() && !customer.hasWorkPhoneNumber()) {
            return false;
        }

        return true;
    }

}
