package com.willkernel.designpattern.facade.demo;

import android.util.Log;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by willkernel
 * on 2019/3/19.
 */
public class FileReader {

    public String read(String filename) {
        java.io.FileReader fileReader = null;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            fileReader = new java.io.FileReader(filename);
            int data;
            while ((data = fileReader.read()) != -1) {
                stringBuilder.append((char)data);
                System.out.println("data "+(char)data);
            }

            fileReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("read\n" + stringBuilder);
        return stringBuilder.toString();
    }
}
