/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notepad_MardhiyahMillania_15;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
/**
 *
 * @author ASUS
 */
public class InputBaca_File {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            InputStream is=new
            FileInputStream("D:\\bacaMillan.txt");
            int data=is.read();
            while(data!=-1){
                System.out.write(data);
                data=is.read();
            }
            is.close();
        } catch (IOException e) {
            System.err.println("Maaf Salah ");
        }
        
    }
    
}
