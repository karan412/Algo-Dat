package myApp;

import java.util.ArrayList;

public class SieveOfEratosthanes implements IConsole {

    public ArrayList<Integer> eratosthanesPrim(int prim){
        boolean[] P = new boolean[prim+1];
        ArrayList<Integer> primeArray = new ArrayList<>();
        for (int i = 2; i <= prim; i++) {
            (P[i]) = true;
        }

        for (int i = 2; i * i <= prim; i++) {
            if (P[i])
                for (int n = 2; n * i <= prim; n++)
                    P[n * i] = false;
        }

        for (int i = 2; i <= prim; i++)
            if (P[i])
                primeArray.add(i);

        return primeArray;
    }

    @Override
    public void execute() {
        Console c = new Console();
        int n = c.readIntegerFromStdin("Please enter value for N:");
        ArrayList<Integer> primeNumbers = eratosthanesPrim(n);
        System.out.println("Prime Numbers are: " + primeNumbers+"\n");
    }

}
