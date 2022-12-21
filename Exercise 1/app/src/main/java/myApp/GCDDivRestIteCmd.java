package myApp;

public class GCDDivRestIteCmd implements IConsole {
    public int euclidDivisionRestIterative(int a, int b) {

        while (b != 0) {
            int h = a % b;
            a = b;
            b = h;
        }
        return a;
    }

    @Override
    public void execute() {
        Console console = new Console();
        int a = console.readIntegerFromStdin("Please enter value for x:");
        int b = console.readIntegerFromStdin("Please enter value for y:");
        int gcd = euclidDivisionRestIterative(a, b);
        System.out.println("GCD is: " + gcd+"\n");

    }
}


