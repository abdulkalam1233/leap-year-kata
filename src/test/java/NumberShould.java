import org.incubyte.NumberExtended;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberShould {
    @Test
    void should_return_number_is_leap_year_if_divisible_by_400() {
        NumberExtended number = new NumberExtended(2000);

        Assertions.assertEquals(true, number.isLeapYear());
    }

    @Test
    void should_return_number_is_not_leap_year_if_divisible_by_100_but_not_400() {
        NumberExtended number = new NumberExtended(1700);

        Assertions.assertEquals(false, number.isLeapYear());

        number = new NumberExtended(1800);

        Assertions.assertEquals(false, number.isLeapYear());

        number = new NumberExtended(1900);

        Assertions.assertEquals(false, number.isLeapYear());

        number = new NumberExtended(2100);

        Assertions.assertEquals(false, number.isLeapYear());
    }

    @Test
    void should_return_is_leap_year_if_divisible_by_4_but_not_100() {
        NumberExtended number;
        number = new NumberExtended(2008);

        Assertions.assertEquals(true, number.isLeapYear());

        number = new NumberExtended(2012);

        Assertions.assertEquals(true, number.isLeapYear());

        number = new NumberExtended(2016);

        Assertions.assertEquals(true, number.isLeapYear());
    }

    @Test
    void should_return_is_not_leap_year_if_not_divisible_by_4() {
        NumberExtended number;
        number = new NumberExtended(2009);

        Assertions.assertEquals(false, number.isLeapYear());
    }
}
