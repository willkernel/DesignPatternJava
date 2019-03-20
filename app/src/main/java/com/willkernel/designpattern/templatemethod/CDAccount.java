package com.willkernel.designpattern.templatemethod;

/**
 * Created by willkernel
 * on 2019/3/20.
 */
public class CDAccount extends Account {
    @Override
    protected String doCalculateType() {
        return "Certificate of Deposite";
    }

    @Override
    protected double doCalculateRate() {
        return 0.06;
    }
}
