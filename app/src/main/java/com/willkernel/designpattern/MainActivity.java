package com.willkernel.designpattern;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.willkernel.designpattern.abstractfactorypattern.Apple;
import com.willkernel.designpattern.abstractfactorypattern.Factory;
import com.willkernel.designpattern.abstractfactorypattern.PhoneFactory;
import com.willkernel.designpattern.abstractfactorypattern.Samsung;
import com.willkernel.designpattern.abstractfactorypattern.TabsFactory;
import com.willkernel.designpattern.abstractfactorypattern.iPhone;
import com.willkernel.designpattern.adapter.NewEnumeration;
import com.willkernel.designpattern.buildpattern.AppleBuilder;
import com.willkernel.designpattern.buildpattern.Builder;
import com.willkernel.designpattern.buildpattern.Director;
import com.willkernel.designpattern.factorymethod.BulbCreator;
import com.willkernel.designpattern.factorymethod.BulbLight;
import com.willkernel.designpattern.factorymethod.ICreator;
import com.willkernel.designpattern.proxy.binder.BankImpl;
import com.willkernel.designpattern.proxy.binder.BankService;
import com.willkernel.designpattern.proxy.binder.IBank;
import com.willkernel.designpattern.simlefactorypattern.Login;
import com.willkernel.designpattern.simlefactorypattern.LoginManager;
import com.willkernel.designpattern.singleinstance.EasySingleton;
import com.willkernel.designpattern.singleinstance.Singleton6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends Activity {

    private ServiceConnection conn = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            IBank bankService = BankImpl.asInterface(service);
            try {
                long money = bankService.queryMoney(20000);
                System.out.println("query money " + money);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Intent intent = new Intent(this, BankService.class);
        bindService(intent, conn, Context.BIND_AUTO_CREATE);
    }

    @Override
    protected void onDestroy() {
        unbindService(conn);
        super.onDestroy();
    }

    @OnClick({R.id.simpleFactory, R.id.factoryMethod, R.id.abstractFactory, R.id.singleton, R.id.builder,
            R.id.adapter
    })
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.simpleFactory:
                Login login = LoginManager.factory("password");
                if (login.verify("willkernel", "123456")) {
                    toast("success");
                } else {
                    toast("fail");
                }
                break;
            case R.id.factoryMethod:
                ICreator creator = new BulbCreator();
                BulbLight bulbLight = (BulbLight) creator.createLight();
                bulbLight.turnOn();
                view.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        bulbLight.turnOff();
                    }
                }, 2000);

                jdbc();
                break;
            case R.id.abstractFactory:
                Factory phoneFactory = new PhoneFactory();
                Factory padFactory = new TabsFactory();

                Apple phone = phoneFactory.createAppleProduct();
                Samsung tab = padFactory.createSamsungProduct();
                phone.appleStyle();
                tab.samsungStyle();

                phoneFactory.createSamsungProduct();
                Apple pad = padFactory.createAppleProduct();
                pad.appleStyle();
                break;
            case R.id.singleton:
                Singleton6.getInstance();
                EasySingleton easySingleton = EasySingleton.INSTANCE;
                break;
            case R.id.builder:
                Builder builder = new AppleBuilder();
                Director director = new Director(builder);
                director.construct(4, 4, "Mac OS");
                System.out.println(builder.create());

                break;
            case R.id.adapter:
//                JDK1.1 之前提供的容器有 Arrays,Vector,Stack,Hashtable,Properties,BitSet，其中定义了一种访问群集内各元素的标准方式，称为 Enumeration（列举器）接口
                Vector vector = new Vector();
                vector.add("2");
                vector.add("5");
                vector.add("67");

                for (Enumeration enumeration = vector.elements(); enumeration.hasMoreElements(); ) {
                    Object o = enumeration.nextElement();
                    System.out.println(o);
                }
//                JDK1.2 版本中引入了 Iterator 接口，新版本的集合对（HashSet,HashMap,WeakHeahMap,ArrayList,TreeSet,TreeMap, LinkedList）是通过 Iterator 接口访问集合元素
//                NewEnumeration 实现了Enumeration
                List list = new ArrayList();
                list.add("1");
                list.add("2");
                list.add("3");
                for (Iterator iterator = list.iterator(); iterator.hasNext(); ) {
                    Object o = iterator.next();
                    System.out.println(o);
                }
// 代码省略
//                ListView myListView = (ListView) findViewById(listview_id);
// 设置适配器
//                myListView.setAdapter(new MyAdapter(context,myDatas));
                break;
            default:
                break;
        }
    }

    /**
     * 工厂方法java的实现示例
     */
    private void jdbc() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:microsoft:sqlserver://localhost:1433; DatabaseName=DB;user=sa;password=");
            Statement statement = connection.createStatement();
            statement.execute("select * from UserInfo");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void toast(String txt) {
        Toast.makeText(this, txt, Toast.LENGTH_SHORT).show();
    }
}
