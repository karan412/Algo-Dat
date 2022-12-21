package myApp;

public class GCDSubItCmd implements IConsole{

     public int euclidSubtractionIterative(int a, int b){
         if (a == 0)
             return b;

         while(b!=0){
             if(a>b){
                 a= a-b;
             }else {
                 b=b-a;
             }
         }return a;
     }

    @Override
    public void execute() {
        Console console = new Console();
        int a = console.readIntegerFromStdin("Please enter value for x:");
        int b = console.readIntegerFromStdin("Please enter value for y:");
        int gcd = euclidSubtractionIterative(a, b);
        System.out.println("GCD is: " + gcd+"\n");

    }


}
