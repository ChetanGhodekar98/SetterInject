package SetterInjection;

public class Airtel implements SimCard{
    @Override
    public void simCardInformation() {
        System.out.println("SERVICE PROVIDE AIRTEL.");
        System.out.println("5g ENABLED");
        System.out.println("STRONG NETWORK");
    }
}
