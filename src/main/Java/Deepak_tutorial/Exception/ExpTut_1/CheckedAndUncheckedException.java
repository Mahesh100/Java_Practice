package Deepak_tutorial.Exception.ExpTut_1;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedAndUncheckedException {
    public static  void main(String [] args){

        try {
            FileInputStream fis = new FileInputStream("D:\\abc.txt");
        }catch (IOException e)
        {
            System.out.println(e);
        }


    }
}
