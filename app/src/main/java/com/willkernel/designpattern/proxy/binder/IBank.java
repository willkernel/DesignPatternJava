package com.willkernel.designpattern.proxy.binder;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/**
 * Created by willkernel
 * on 2019/3/19.
 */
public interface IBank extends IInterface {
    static final String DESCRIPTOR = "com.willkernel.designpattern.proxy.binder.IBank";
    int TRANSACTION_queryMoney = IBinder.FIRST_CALL_TRANSACTION + 0;

    long queryMoney(int uid) throws RemoteException;
}
