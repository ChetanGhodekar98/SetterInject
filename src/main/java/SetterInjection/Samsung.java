package SetterInjection;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Samsung implements Mobile{
    private SimCard simCard;
    // SETTER INJECTION
    public void setSimCard(SimCard simCard) {
        this.simCard = simCard;
    }

    @Override
    public void mobileInformation() {
        System.out.println("OPERATING SYSTEM :-ANDROID ");
        System.out.println("MOBILE PRICE :- 44999.99");
    }

    @Override
    public void getSimCardInformation() {
        simCard.simCardInformation();
    }
}
