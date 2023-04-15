package ChainOfResponsibility;

public interface DispenseChain {

    void dispense(Money money);
    void setNextChain(DispenseChain nextChain);
}
