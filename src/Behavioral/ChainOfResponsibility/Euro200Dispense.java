package Behavioral.ChainOfResponsibility;

public class Euro200Dispense implements DispenseChain {

    private DispenseChain chain;
    @Override
    public void dispense(Money money) {
        if(money.getAmount() >= 200) {
            int count = money.getAmount() / 200;
            int remainder = money.getAmount() % 200;
            System.out.println("Dispensing" + " " + count  + " " + "of 200 euros.");
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
