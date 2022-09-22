//Bagian Model pada Java menggambarkan struktur data pada database. 
//Bagian ini direpresentasikan oleh POJO (Plain Old Java Object), yaitu:
//kelas Java biasa yg lengkap dengan property(atribut) dan method getter-setter terhadap atribut-atributnya. 
//Biasanya tidak memiliki method lain selain getter-setter.
//Contoh: Kelas Mahasiswa yang memiliki atribut: nip, nama, jenisKelamin, alamat. 
//Kelas Mahasiswa hanya memiliki method getter-setter yang sesuai dengan atributnya,
//contohnya: getNip, setNip, getNama, setNama, getJenisKelamin, setJenisKelamin, getAlamat, setAlamat


package models;

/**
 *
 * @author Admin
 */
public class Region {
private int region_id;
    private String region_name;
    
    public Region(){
        }
    
    public Region(int region_id, String region_name){
       this.region_id = region_id;
       this.region_name = region_name;
    }
            
    public int getRegionId(){
    return this.region_id;
    }
    public void setRegionId(int region_id){
        this.region_id = region_id;
        
    }
            
    public String getRegionName(){
    return this.region_name = region_name;
}
    public void setRegionName(String region_name){  
        this.region_name = region_name;
    }
}
