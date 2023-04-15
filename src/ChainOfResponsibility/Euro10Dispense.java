package ChainOfResponsibility;

public class Euro10Dispense implements DispenseChain {

    private DispenseChain chain;
    @Override
    public void dispense(Money money) {
        if(money.getAmount() >= 10) {
            int count = money.getAmount() / 10;
            int remainder = money.getAmount() % 10;
            System.out.println("Dispensing" + " " + count  + " " + "of 10 euros.");
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
