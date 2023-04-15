package Behavioral.ChainOfResponsibility;

public class Euro50Dispense implements DispenseChain {

    private DispenseChain chain;
    @Override
    public void dispense(Money money) {
        if(money.getAmount() >= 50) {
            int count = money.getAmount() / 50;
            int remainder = money.getAmount() % 50;
            System.out.println("Dispensing" + " " + count  + " " + "of 50 euros.");
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
