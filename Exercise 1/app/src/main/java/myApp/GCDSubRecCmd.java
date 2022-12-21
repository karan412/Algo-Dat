package myApp;

public class GCDSubRecCmd implements IConsole {

    public int euclidSubtractionRecursive(int a, int b) {
        if (b == 0) {
            return a;
        } else if (a == 0) {
            return b;
        }
        if (a > b) {
            return euclidSubtractionRecursive(a - b, b);
        } else
        return euclidSubtractionRecursive(a, b - a);
    }

    @Override
    public void execute() {
        Console console = new Console();
        int a = console.readIntegerFromStdin("Please enter value for x:");
        int b = console.readIntegerFromStdin("Please enter value for y:");
        int gcd = euclidSubtractionRecursive(a, b);
        System.out.println("GCD is: " + gcd+"\n");

    }

}
