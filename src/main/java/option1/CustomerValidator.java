package option1;

public class CustomerValidator {
    public boolean validate(Customer customer) {
        if (customer.getAddress().isEmpty() && customer.getMobilePhoneNumber().isEmpty()) {
            return false;
        }
        if (customer.getMobilePhoneNumber().isEmpty() && customer.getWorkPhoneNumber().isEmpty()) {
            return false;
        }

        return true;
    }
}
