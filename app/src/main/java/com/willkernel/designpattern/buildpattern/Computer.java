package com.willkernel.designpattern.buildpattern;

/**
 * Created by willkernel
 * on 2019/3/18.
 */
public abstract class Computer {
    protected int mCpuCore = 1;
    protected int mRamSize = 0;
    protected String mOs = "Dos";

    public Computer() {
    }

    public abstract void setmCpuCore(int mCpuCore);

    public abstract void setmRamSize(int mRamSize);

    public abstract void setmOs(String mOs);

    @Override
    public String toString() {
        return "Computer{" +
                "mCpuCore=" + mCpuCore +
                ", mRamSize=" + mRamSize +
                ", mOs='" + mOs + '\'' +
                '}';
    }
}
