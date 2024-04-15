package com.arun.designpattern.rulebased;

import java.util.ArrayList;
import java.util.List;

public class RuleEngine {
    List<CartRule> cartRules = new ArrayList<>();

    void addRule(CartRule cartRule){
        cartRules.add(cartRule);
    }
}
