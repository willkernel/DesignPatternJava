package com.willkernel.designpattern.strategy;

/**
 * Created by willkernel
 * on 2019/3/20.
 */
public class AdvancedMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double bookPrice) {
        return bookPrice*0.8;
    }
}
