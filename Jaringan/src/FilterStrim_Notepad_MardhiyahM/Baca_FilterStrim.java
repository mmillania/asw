/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FilterStrim_Notepad_MardhiyahM;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 */
public class Baca_FilterStrim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        try {
//           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//            System.out.println("Masukkan kalimat : ");
//            System.out.println("Masukan Anda adalah: " +br.readLine());
//            br.close();
//        } catch (Exception e) {
//        }
            
        try {
            String data;
            FileReader fr = new FileReader("D://nulisMillan.txt");
            BufferedReader br = new BufferedReader(fr);
//            do{
//                data=br.readLine();
//                System.out.println(data);
//            }while(!data.equals("null"));
            while((data = br.readLine()) != null){
                System.out.println(data);
            }
            fr.close();
            br.close();
        } catch (Exception e) {
        }
    }
    
}
