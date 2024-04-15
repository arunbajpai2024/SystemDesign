package com.arun.designpattern.chainofresonsibility;

public interface DispenserChain {

    void dispense(Currency currency);

    void setNextDispenseChain(DispenserChain dispenseChain);
}
