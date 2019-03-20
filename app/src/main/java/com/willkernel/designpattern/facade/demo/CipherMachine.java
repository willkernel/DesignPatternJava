package com.willkernel.designpattern.facade.demo;

/**
 * Created by willkernel
 * on 2019/3/19.
 */
public class CipherMachine {
    public String encrypt(String text) {
        StringBuilder es = new StringBuilder();
        char[] chars = text.toCharArray();
        for (char ch : chars) {
            String c = String.valueOf((ch % 7));
            es.append(c);
        }
        return es.toString();
    }
}
