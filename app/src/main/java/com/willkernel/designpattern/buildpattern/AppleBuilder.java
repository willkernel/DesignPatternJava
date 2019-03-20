package com.willkernel.designpattern.buildpattern;


import com.willkernel.designpattern.abstractfactorypattern.Apple;

/**
 * Created by willkernel
 * on 2019/3/18.
 */
public class AppleBuilder extends Builder {
    AppleComputer appleComputer = new AppleComputer();

    @Override
    public void buildCPU(int core) {
        appleComputer.setmCpuCore(core);
    }

    @Override
    public void buildRAM(int gb) {
        appleComputer.setmRamSize(gb);
    }

    @Override
    public void buildOs(String os) {
        appleComputer.setmOs(os);
    }

    @Override
    public Computer create() {
        return appleComputer;
    }
}
