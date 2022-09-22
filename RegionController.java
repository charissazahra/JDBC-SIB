//mengatur data
//Bagian Controller merupakan kelas-kelas yang mengendalikan alur program secara keseluruhan, 
//mengandung business logic, dan sebagai penghubung antara view dengan model dan dao.
//Kelas ini akan merespon permintaan atau aksi dari view ke kelas dao yang diinginkan.

package contollers.concretes;

import daos.RegionDAO;
import daos.interfaces.IRegionDAO;
import java.sql.Connection;
import models.Region;

/**
 *
 * @author Admin
 */
public class RegionController {
    private IRegionDAO rdao;
    
    public RegionController(Connection connection) {
        rdao = new RegionDAO(connection);
    }
    
    public String insert(String region_id, String region_name) {
        int newRegionId = Integer.parseInt(region_id);
        Region region = new Region(newRegionId, region_name);
        
        if (rdao.insert(region)){
            return "Data berhasil diinput";
        } else {
            return "Data gagal diinput";
        }
    }
    
    public String update(String region_id, String region_name) {
        int newRegionId = Integer.parseInt(region_id);
        Region region = new Region(newRegionId, region_name);
        
        if (rdao.update(region)){
            return "Data berhasil diinput";
        } else {
            return "Data gagal diinput";
        }
    }
    
    public String delete(String region_id, String region_name) {
        int newRegionId = Integer.parseInt(region_id);
        Region region = new Region(newRegionId, region_name);
        
        if (rdao.delete(region)){
            return "Data berhasil diinput";
        } else {
            return "Data gagal diinput";
        }
    }
    
    public String getById(String region_id, String region_name) {
        int newRegionId = Integer.parseInt(region_id);
        Region region = new Region(newRegionId, region_name);
        
        if (rdao.getById(region)){
            return "Data berhasil diinput";
        } else {
            return "Data gagal diinput";
        }
    
    }  
    
    }
