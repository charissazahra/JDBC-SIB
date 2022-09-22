//Dalam hal koneksi aplikasi ke database,
//penerapan MVC pada Java ditambahkan dengan pembuatan kelas DAO (Data  Access Object),
//yaitu kelas yang khusus menyediakan operasi Insert, Update, Delete, dan Query ke database.

//Bagian DAO (Data Access Object) merupakan kelas-kelas yang melakukan manipulasi data yang
//terdapat pada database. Manipulasi bisa berupa: Create, Read, Update, atau Delete (CRUD).
//Bagian ini terhubung ke Model (karena merupakan representasi data) dan 
//Database (untuk mendapatkan koneksi).

package daos;

import daos.interfaces.IRegionDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.Region;

/**
 *
 * @charissa
 */
public class RegionDAO implements IRegionDAO {

    private Connection connection;

    public RegionDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Region> getAll() {
        List<Region> regions = new ArrayList<>();
        String query = "SELECT * FROM REGIONS";
        try {
            ResultSet resultSet = connection
                    .prepareStatement(query)
                    .executeQuery();
            while (resultSet.next()) {
                Region region = new Region(resultSet.getInt(1), resultSet.getString(2));
                region.setRegionId(resultSet.getInt(1));
                region.setRegionName(resultSet.getString(2));
                regions.add(region);
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return regions;
    }

    @Override
    public Region getById(int region_id) {
        List<Region> regions = new ArrayList<>();
        Region region = new Region();
        String query = "SELECT * FROM `region` where 'region_id'="+region_id;
        try {
            ResultSet resultSet = connection
                    .prepareStatement(query)
                    .executeQuery();
            while (resultSet.next()) {
                region.setRegionId(resultSet.getInt(1));
                region.setRegionName(resultSet.getString(2));
                regions.add(region);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
            return region;
        

    }

    @Override
    public boolean insert(Region region) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO `regions`(`region_id`, `region_name`) VALUES (?,?)");
            preparedStatement.setInt(1, region.getRegionId());
            preparedStatement.setString(2, region.getRegionName());
            preparedStatement.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(Region region) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE `regions` SET `region_name`=?  WHERE region_id=" + region.getRegionId());
            preparedStatement.setInt(1, region.getRegionId());
            preparedStatement.setString(1, region.getRegionName());
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(int region_id) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM `regions` WHERE region_id=" + region_id);
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(Region region) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean getById(Region region) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
 
