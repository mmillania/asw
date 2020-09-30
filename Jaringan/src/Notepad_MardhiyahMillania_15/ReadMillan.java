/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notepad_MardhiyahMillania_15;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author ASUS
 */
public class ReadMillan {
    public String read(File file) {
        String s="";
        try {
            InputStream is = new FileInputStream(file);
            int data = is.read();
            while (data != -1) {

                s += (char)data;
                data = is.read();
            }
            is.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        return s;
    }
}
