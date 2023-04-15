package Behavioral.ChainOfResponsibility;

public class Euro20Dispense implements DispenseChain {

    private DispenseChain chain;
    @Override
    public void dispense(Money money) {
        if(money.getAmount() >= 20) {
            int count = money.getAmount() / 20;
            int remainder = money.getAmount() % 20;
            System.out.println("Dispensing" + " " + count  + " " + "of 20 euros.");
            if(remainder != 0) {
                chain.dispense(new Money(remainder));
            }
        } else {
            chain.dispense(money);
        }
    }

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }
}
