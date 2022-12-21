package myApp;

public class GCDDivRestRecCmd implements IConsole {

    public int euclidDivisionRestRecursive(int a, int b) {
        if (b == 0)
            return a;
        else return euclidDivisionRestRecursive(b, a % b);
    }

    @Override
    public void execute() {
        Console console = new Console();
        int a = console.readIntegerFromStdin("Please enter value for x:");
        int b = console.readIntegerFromStdin("Please enter value for y:");
        int gcd = euclidDivisionRestRecursive(a, b);
        System.out.println("GCD is: " + gcd+"\n");
    }

}
