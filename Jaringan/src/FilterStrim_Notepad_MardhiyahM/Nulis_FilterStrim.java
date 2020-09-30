/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FilterStrim_Notepad_MardhiyahM;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import jdk.jfr.events.FileWriteEvent;

/**
 *
 * @author ASUS
 */
public class Nulis_FilterStrim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("D:\\FS_Millan.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            String data = "halo guys good morning";
            bw.write(data);
            bw.flush();
            bw.close();
            fw.close();
        } catch (Exception e) {
        }
    }
    
}
