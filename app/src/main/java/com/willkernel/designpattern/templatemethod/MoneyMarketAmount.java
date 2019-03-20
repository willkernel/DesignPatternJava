package com.willkernel.designpattern.templatemethod;

/**
 * Created by willkernel
 * on 2019/3/20.
 */
public class MoneyMarketAmount extends Account {
    @Override
    protected String doCalculateType() {
        return "market";
    }

    @Override
    protected double doCalculateRate() {
        return 0.045;
    }
}
