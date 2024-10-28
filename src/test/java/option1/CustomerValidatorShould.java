package option1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomerValidatorShould {
    @Test
    public void take_valid_a_customer_with_work_phone_number_and_address_and_mobile_phone_number() {
        Customer customer = new Customer("123456789", "123456789", "123456789");
        var sut = new CustomerValidator();

        boolean expected = sut.validate(customer);

        assertThat(expected).isTrue();
    }

    @Test
    public void take_valid_a_customer_with_work_phone_number_and_address_but_without_mobile_phone_number() {
        Customer customer = new Customer("123456789", "123456789", "");
        var sut = new CustomerValidator();

        boolean expected = sut.validate(customer);

        assertThat(expected).isTrue();
    }

    @Test
    public void take_valid_a_customer_with_work_phone_number__and_mobile_phone_number_but_without_address() {
        Customer customer = new Customer("123456789", "", "123456789");
        var sut = new CustomerValidator();

        boolean expected = sut.validate(customer);

        assertThat(expected).isTrue();
    }
}

// WPN ADD MPN
// [x] [x] [x] -> can be registered
// [x] [x] [ ] -> can be registered
// [x] [ ] [x] -> can be registered
// [ ] [x] [x] -> can be registered
// [ ] [ ] [x] -> can be registered
// [x] [ ] [ ] -> cannot be registered
// [ ] [x] [ ] -> cannot be registered
// [ ] [ ] [ ] -> cannot be registered
