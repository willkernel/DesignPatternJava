package com.willkernel.designpattern.decorator;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by willkernel
 * on 2019/3/19.
 */
public class Client {
    public static void main(String[] args) {
        // 第一种写法  单层装饰
        TheGreatestSage sage = new Monkey();
        TheGreatestSage fish = new Fish(sage);
        TheGreatestSage bird = new Bird(sage);
        fish.move();
        bird.move();
        // 第二种写法 双层装饰
        TheGreatestSage sage1 = new Fish(new Bird(sage));
        sage1.move();

//        使用I/O流读取文件内容的简单操作示例
//        最里层是一个FileInputStream对象，然后把它传递给一个BufferedInputStream对象，
//        经过BufferedInputStream处理，再把处理后的对象传递给了DataInputStream对象进行处理，
//        这个过程其实就是装饰器的组装过程，FileInputStream对象相当于原始的被装饰的对象，而BufferedInputStream对象和DataInputStream对象则相当于装饰器
        try {
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("./test.txt")));
            byte[] bs = new byte[dataInputStream.available()];
            dataInputStream.read(bs);
            String content = new String(bs);
            System.out.println(content);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
