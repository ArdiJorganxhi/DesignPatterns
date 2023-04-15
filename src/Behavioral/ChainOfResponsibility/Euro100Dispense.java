package Behavioral.ChainOfResponsibility;

public class Euro100Dispense implements DispenseChain {

    private DispenseChain chain;
    @Override
    public void dispense(Money money) {
        if(money.getAmount() >= 100) {
            int count = money.getAmount() / 100;
            int remainder = money.getAmount() % 100;
            System.out.println("Dispensing" + " " + count  + " " + "of 100 euros.");
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
