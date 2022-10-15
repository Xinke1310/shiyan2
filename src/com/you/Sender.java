package com.you;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sender {
    public static void main(String[] args) {

        File MyPath = new File("src\\main\\resources\\static");
        if(!MyPath.exists())
        {
            MyPath.mkdir();
            wirteFlie(MyPath);

        }
    }

    private static void wirteFlie(File MyPath) {
        char ch;
        File MyFile = new File(MyPath,"Data.dat");
        try{
            FileOutputStream fout = new FileOutputStream(MyFile);
            System.out.println("Input a string");
            while((ch=(char)System.in.read())!='#')
            {
                fout.write(ch);

            }
            fout.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
