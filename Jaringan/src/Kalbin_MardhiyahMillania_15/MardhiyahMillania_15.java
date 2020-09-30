/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kalbin_MardhiyahMillania_15;

import java.net.InetAddress;
import java.util.Scanner;
import java.net.UnknownHostException;

/**
 *
 * @author 15-Mardhiyah Millania-1841720081
 */
public class MardhiyahMillania_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String bit="00000000";
//        System.out.print("Input nilai desimal : ");
//        Scanner sc = new Scanner(System.in);
//        String nilai = sc.nextLine();
        
        //mengubah string ke integer
//        Integer nilaiInt = Integer.valueOf(nilai);
//        String nilaiBiner=Integer.toBinaryString(nilaiInt);
//        System.out.println("Hasil nilai biner : " +nilaiBiner);
        
        //untuk menambahkan menjadi 8 bit
//        String bit="00000000";
//        String fullBiner = bit.substring(nilaiBiner.length())+nilaiBiner;
//        System.out.println("Nilai Biner sesungguhnya : " +fullBiner);
//
        try{
            System.out.print("Input Nama Domain : ");
            String domain = sc.next();
            InetAddress ip = InetAddress.getByName(domain);
            String ipAddress = ip.getHostAddress(); //untuk memanggil alamat ip
            System.out.println("IP Address : " +ipAddress);
            
            //untuk membuat format ipaddress menggunakan titik(.) pake array
            String[] separate = ipAddress.split("\\.");
            
            System.out.print("IP -> Biner : ");
            for (int i = 0; i < separate.length; i++) {
                //mengubah domain string menjadi integer
                Integer domainString = Integer.valueOf(separate[i]);
                
                //mengubah bentuk domain integer menjadi biner
                String domainBiner = Integer.toBinaryString(domainString);
                
                //menambahkan formatan jadi 8 bit 
                String domainFullBiner = bit.substring(domainBiner.length())+domainBiner;
                System.out.print(domainFullBiner+ " ");
                
            }
            
        } catch (UnknownHostException e){
            e.printStackTrace();
        }
    }
    
}
