package com.willkernel.designpattern.proxy.binder;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * Created by willkernel
 * on 2019/3/19.
 */
public class BankImpl extends Binder implements IBank {
    public BankImpl() {
        this.attachInterface(this, DESCRIPTOR);
    }

    public static IBank asInterface(IBinder obj) {
        if (obj == null) {
            return null;
        }
        IInterface iInterface = obj.queryLocalInterface(DESCRIPTOR);
        if (iInterface != null && iInterface instanceof IBank) {
            return (IBank) iInterface;
        }
        return new BankImpl.Proxy(obj);
    }

    @Override
    public long queryMoney(int uid) throws RemoteException {
        return uid * 10;
    }

    @Override
    public IBinder asBinder() {
        return this;
    }

    @Override
    protected boolean onTransact(int code, @NonNull Parcel data, @Nullable Parcel reply, int flags) throws RemoteException {
        switch (code) {
            case INTERFACE_TRANSACTION:
                reply.writeString(DESCRIPTOR);
                return true;
            case TRANSACTION_queryMoney:
                data.enforceInterface(DESCRIPTOR);
                int uid = data.readInt();
                long result = queryMoney(uid);
                reply.writeNoException();
                reply.writeLong(result);
                return true;

        }
        return super.onTransact(code, data, reply, flags);
    }

    public static class Proxy implements IBank {
        private IBinder remote;

        public Proxy(IBinder binder) {
            this.remote = binder;
        }

        public String getInterfaceDescriptor() {
            return DESCRIPTOR;
        }

        @Override
        public long queryMoney(int uid) throws RemoteException {
            Parcel data = Parcel.obtain();
            Parcel reply = Parcel.obtain();
            long result;
            try {
                data.writeInterfaceToken(DESCRIPTOR);
                data.writeInt(uid);
                remote.transact(TRANSACTION_queryMoney, data, reply, 0);
                reply.readException();
                result = reply.readLong();
            } finally {
                data.recycle();
                reply.recycle();
            }
            return result;
        }

        @Override
        public IBinder asBinder() {
            return remote;
        }
    }
}
