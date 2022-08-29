package java_calculator;

public class RepresentationParser {

    public static Representation parse(String arg1, String arg2, String arg3) throws RepresentationParserException {
        try {
            double num1 = Double.parseDouble(arg1);
            double num2 = Double.parseDouble(arg3);
            char op = arg2.charAt(0);
            if (!(op == '-' || op == '+' || op == '/' || op == '*')) {
                throw new RepresentationParserException();
            }
            return new Representation(num1, num2, op);
        } catch (NullPointerException | NumberFormatException | StringIndexOutOfBoundsException ex) {
            throw new RepresentationParserException();
        }
    }
}
