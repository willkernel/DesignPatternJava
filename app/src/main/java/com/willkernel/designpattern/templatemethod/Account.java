package com.willkernel.designpattern.templatemethod;

/**
 * Created by willkernel
 * on 2019/3/20.
 */
public abstract class Account {
    public double calculateInterest() {
        double interest = doCalculateRate();
        String type = doCalculateType();
        double amount = doCalculateAmount(type);
        return amount * interest;
    }

    private double doCalculateAmount(String type) {
        return 100000;
    }


    abstract String doCalculateType();

    abstract double doCalculateRate();
}
