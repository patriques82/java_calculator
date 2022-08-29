package java_calculator;

public class Calculator {

    public static double calculate(Representation rep) {
        switch (rep.operator) {
            case '-':
                return rep.num1 - rep.num2;
            case '+':
                return rep.num1 + rep.num2;
            case '/':
                return rep.num1 / rep.num2;
            case '*':
                return rep.num1 * rep.num2;
            default:
                return 0.0;
        }
    }

}
