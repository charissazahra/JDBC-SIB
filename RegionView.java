//menu nya atau user interface nya dari codingan ini/mengatur tampilan program
//Bagian View merupakan kelas-kelas yang mengimplementasikan user interface dari program yang dibangun. 
//Bagian inilah yang dilihat oleh user dan menjadi media user untuk berinteraksi. 
//Setiap ada request atau aksi yang diminta oleh user yang berhubungan 
//dengan data akan diteruskan ke bagian controller yang sesuai.


package views;

import java.util.Scanner;

/**
 *
 * @charissa
 */
public class RegionView {
private static String region_id;
private static String region_name;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           
        System.out.println("SELAMAT DATANG DI PROGRAM JAVA DATABASE CONNECTIVITY");
        System.out.println("Masukan Region ID");
        region_id = sc.next();
        System.out.println("Masukan Region Name");
        region_name = sc.next();
    }
    
}
