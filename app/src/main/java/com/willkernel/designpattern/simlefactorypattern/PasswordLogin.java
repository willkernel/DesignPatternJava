package com.willkernel.designpattern.simlefactorypattern;

/**
 * Created by willkernel
 * on 2019/3/18.
 */
public class PasswordLogin implements Login {
    @Override
    public boolean verify(String name, String password) {
        return name.equals("willkernel") && password.equals("123456");
    }
}
