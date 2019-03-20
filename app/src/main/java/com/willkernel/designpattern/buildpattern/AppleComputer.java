package com.willkernel.designpattern.buildpattern;

/**
 * Created by willkernel
 * on 2019/3/18.
 */
public class AppleComputer extends Computer {
    protected AppleComputer() {
    }

    @Override
    public void setmCpuCore(int mCpuCore) {
        this.mCpuCore = mCpuCore;
    }

    @Override
    public void setmRamSize(int mRamSize) {
        this.mRamSize = mRamSize;
    }

    @Override
    public void setmOs(String mOs) {
        this.mOs = mOs;
    }
}
