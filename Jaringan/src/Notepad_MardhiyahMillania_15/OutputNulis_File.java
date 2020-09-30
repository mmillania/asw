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
public class OutputNulis_File {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            OutputStream os=new
            FileOutputStream("D:\\nulisMillan.txt");
            String data="millan belum makan\n";
            os.write(data.getBytes());
            
            data="makan dulu ya guys\n";
            os.write(data.getBytes());
            os.flush();
            os.close();
                
        } catch (IOException e) {
            System.err.println("Maaf Salah ");
        }
    }
    
}
