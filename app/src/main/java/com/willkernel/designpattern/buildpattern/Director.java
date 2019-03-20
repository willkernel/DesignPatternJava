package com.willkernel.designpattern.buildpattern;

/**
 * Created by willkernel
 * on 2019/3/18.
 */
public class Director {
    Builder builder = null;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(int cpu, int ram, String os) {
        builder.buildCPU(cpu);
        builder.buildRAM(ram);
        builder.buildOs(os);
    }
}
