package SetterInjection;

public class Apple implements Mobile{
    private SimCard simCard;

    public void setSimCard(SimCard simCard){
        this.simCard=simCard;
    }

    @Override
    public void mobileInformation() {
        System.out.println("OPERATING SYSTEM IS :- IOS");
        System.out.println("MOBILE PRICE IS :- 59999.99");
    }

    @Override
    public void getSimCardInformation() {
        simCard.simCardInformation();
    }
}
