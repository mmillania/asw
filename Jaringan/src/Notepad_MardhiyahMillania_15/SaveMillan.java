/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notepad_MardhiyahMillania_15;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author ASUS
 */
public class SaveMillan {
    public void save(String loc, String data) {
        try {
            OutputStream o = new FileOutputStream(loc);
            String save = data;
            o.write(save.getBytes());
            o.flush();
            o.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }       
}
