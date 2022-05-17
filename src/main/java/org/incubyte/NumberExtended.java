package org.incubyte;

public class NumberExtended {
    private int input;

    public NumberExtended(int input) {
        this.input = input;
    }

    public boolean isLeapYear() {
        if (isDivisibleByNumber(4) && !isDivisibleByNumber(100)) {
            return true;
        }
        return isDivisibleByNumber(400);
    }

    private boolean isDivisibleByNumber(int divisor) {
        return input % divisor == 0;
    }
}
