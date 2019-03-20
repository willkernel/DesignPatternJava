package com.willkernel.designpattern.facade.demo;

/**
 * Created by willkernel
 * on 2019/3/19.
 */
public class EcryptFacade {
    private FileReader fileReader;
    private FileWriter fileWriter;
    private CipherMachine cipherMachine;

    public EcryptFacade() {
        fileReader = new FileReader();
        fileWriter = new FileWriter();
        cipherMachine = new CipherMachine();
    }

    public void ecryptFile(String filePath, String savePath) {
        String plainStr = fileReader.read(filePath);
        String encrypt = cipherMachine.encrypt(plainStr);
        fileWriter.writeFile(encrypt, savePath);
    }
}
