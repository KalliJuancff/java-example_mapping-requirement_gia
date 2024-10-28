package option1;

public class CustomerValidator {
    public boolean validate(Customer customer) {
        if (customer.getAddress().isEmpty() && customer.getMobilePhoneNumber().isEmpty()) {
            return false;
        }

        return true;
    }
}
