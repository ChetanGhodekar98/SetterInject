package SetterInjection;

public class Jio implements  SimCard{
    @Override
    public void simCardInformation() {
        System.out.println("SERVICE PROVIDE JIO.");
        System.out.println("5g DISABLED");
        System.out.println("WEAK NETWORK");
    }
}
