package com.you;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Receiver {
    public static void main(String[] args) {

        File MyPath = new File("src");
        readTool readTool = new readTool();
        readTool.read(MyPath);

    }
}
class readTool{
    public void read(File MyPath)
    {
        int chi;
        File MyFile = new File(MyPath,"Data.dat");
        try {
            FileInputStream fin = new FileInputStream(MyFile);
            while((chi = fin.read())!=-1)
            {
                System.out.println((char)chi);
            }
            fin.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
