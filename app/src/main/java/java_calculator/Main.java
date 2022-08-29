package java_calculator;

public class Main {
    public static void main(String[] args) {
        if (args.length == 3) {
            try {
                Representation rep = RepresentationParser.parse(args[0], args[1], args[2]);
                double res = Calculator.calculate(rep);
                System.out.printf("Result: %.3f\n", res);
            } catch (RepresentationParserException ex) {
                usage();
            }
        } else {
            usage();
        }
    }

    private static void usage() {
        System.err.println(
                "SYNOPSIS\n" +
                        "Usage: calculator number operator number\n\n" +
                        "DESCRIPTION\n" +
                        "calculator calculates 2 numbers with operator. Operators available are '+', '-', '*', '/'."
        );
    }

}
