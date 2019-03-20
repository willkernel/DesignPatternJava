package com.willkernel.designpattern.templatemethod;

/**
 * Created by willkernel
 * on 2019/3/20.
 */
public class Client {
    public static void main(String[] args) {

        Account account = new MoneyMarketAmount();
        System.out.println(account.calculateInterest());

        account = new CDAccount();
        System.out.println(account.calculateInterest());
    }
}
