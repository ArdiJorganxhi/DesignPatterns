package ChainOfResponsibility;

public class ATMDispenser {
    public DispenseChain euro200;
    public ATMDispenser() {
        euro200 = new Euro200Dispense();
        DispenseChain euro100 = new Euro100Dispense();
        DispenseChain euro50 = new Euro50Dispense();
        DispenseChain euro20 = new Euro20Dispense();
        DispenseChain euro10 = new Euro10Dispense();

        euro200.setNextChain(euro100);
        euro100.setNextChain(euro50);
        euro50.setNextChain(euro20);
        euro20.setNextChain(euro10);

    }
}

