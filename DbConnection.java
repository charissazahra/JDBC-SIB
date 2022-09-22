//ini menyambungkan koneksi java ke db localhost.
//library dan di bagian services tuh database nya connect dulu.

//Bagian Database, berisi kelas yang bertugas untuk membuka koneksi dengan database tertentu dan
//memberikan objek connection ke kelas dao yang membutuhkan koneksi.

package tools;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @charissa
 */
public class DbConnection {
    private Connection con;
   
    public Connection getConnection()
    { try {
            
    
        Class.forName("com.mysql.cj.jdbc.Driver");
        this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
        
    } catch (Exception e) {
            System.out.println("Erorr + "+ e.getMessage ());
}
    return con;
    } 
}
