package com.arun.designpattern.chainofresonsibility;

public class AtmDispenser {
    private DispenserChain dispenserChain;
    public AtmDispenser() {
        this.dispenserChain = new INR500Dispenser();
        INR100Dispenser inr100Dispenser = new INR100Dispenser();
        this.dispenserChain.setNextDispenseChain(inr100Dispenser);
        INR50Dispenser inr50Dispenser = new INR50Dispenser();
        inr100Dispenser.setNextDispenseChain(inr50Dispenser);

        INR10Dispenser inr10Dispenser = new INR10Dispenser();
        inr50Dispenser.setNextDispenseChain(inr10Dispenser);

    }

    public DispenserChain getDispenserChain() {
        return dispenserChain;
    }
}
