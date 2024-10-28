package option1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomerValidatorShould {
    @ParameterizedTest
    @CsvSource({
            "123456789, 123456789, 123456789",
            "123456789, 123456789, ''",
    })
    public void take_as_valid_if_customer_has_work_phone_number_and_address(String workPhoneNumber, String address, String mobilePhoneNumber) {
        Customer customer = new Customer(workPhoneNumber, address, mobilePhoneNumber);
        var sut = new CustomerValidator();

        boolean expected = sut.validate(customer);

        assertThat(expected).isTrue();

    }

    @ParameterizedTest
    @CsvSource({
            "123456789, '', 123456789",
            "'' , 123456789, 123456789",
            "'' , '', 123456789",
    })
    public void take_as_valid_if_customer_has_mobile_phone_number(String workPhoneNumber, String address, String mobilePhoneNumber) {
        Customer customer = new Customer(workPhoneNumber, address, mobilePhoneNumber);
        var sut = new CustomerValidator();

        boolean expected = sut.validate(customer);

        assertThat(expected).isTrue();

    }

    @ParameterizedTest
    @CsvSource({
            "123456789, '', ''",
            "'', 123456789, ''",
            "'', '', ''",
    })
    public void take_as_non_valid_if_customer_has_not_work_phone_number_and_address_nor_either_mobile_phone_number(String workPhoneNumber, String address, String mobilePhoneNumber) {
        Customer customer = new Customer(workPhoneNumber, address, mobilePhoneNumber);
        var sut = new CustomerValidator();

        boolean expected = sut.validate(customer);

        assertThat(expected).isFalse();
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
