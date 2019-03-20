package com.willkernel.designpattern.facade.demo;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by willkernel
 * on 2019/3/19.
 */
public class FileWriter {
    public void writeFile(String encrypt, String filename) {
        java.io.FileWriter fileWriter = null;
        try {
            fileWriter = new java.io.FileWriter(filename);
            byte[] chr = encrypt.getBytes();
            System.out.println("chr " + Arrays.toString(chr));
            fileWriter.write(encrypt);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
