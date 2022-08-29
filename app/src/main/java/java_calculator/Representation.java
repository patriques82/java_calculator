package java_calculator;

import java.util.Objects;

public class Representation {
    double num1;
    double num2;
    char operator;

    public Representation(double num1, double num2, char operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Representation that = (Representation) o;
        return Double.compare(that.num1, num1) == 0 &&
                Double.compare(that.num2, num2) == 0 &&
                operator == that.operator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num1, num2, operator);
    }
}
