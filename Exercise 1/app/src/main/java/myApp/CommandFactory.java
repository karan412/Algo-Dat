package myApp;

public class CommandFactory {
    public IConsole createGCDSubRecCmd() {
        return new GCDSubRecCmd();
    }

    public IConsole createGCDSubItCmd() {
        return new GCDSubItCmd();
    }

    public  IConsole createGCDDivRestRecCmd() {
        return new GCDDivRestRecCmd();
    }

    public IConsole createGCDDivRestIteCmd() {
        return new GCDDivRestIteCmd();
    }

    public IConsole createSieveOfEratosthanes() {
        return new SieveOfEratosthanes();
    }
    public IConsole createProperties(){
        return new Properties();
    }

}
