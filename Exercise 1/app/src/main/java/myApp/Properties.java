package myApp;

public class Properties implements IConsole {

    public void execute() {
        Console console = new Console();
        String a = console.readStringFromStdin("Please enter Prename:");
        String b = console.readStringFromStdin("PLease enter Surname:");
        int c = console.readIntegerFromStdin("Please enter value for x:");
        int d = console.readIntegerFromStdin("Please enter value for y:");
        System.out.println("Prename: " + a+"; Surname: "+b);
        System.out.println("X: "+c+"; Y: "+d+"\n");
    }
}
