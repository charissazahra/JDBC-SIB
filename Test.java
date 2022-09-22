//ini main method, buat nge running file codingannya//

package tools;

import contollers.concretes.RegionController;
import tools.DbConnection;

import daos.RegionDAO;
import models.Region;

/**
 
 * @charissa
 */
public class Test {
public static void main(String[] args) {
        DbConnection connection = new DbConnection();
        System.out.println(connection.getConnection());
  
  
    // ini untuk test RegionController, tinggal pilih salah satu aja yg mau di running apaan (insert, update, delete, getById) dan ilangin tanda komen nya biar bisa ke run 
    RegionController rc = new RegionController (connection.getConnection());
    System.out.println(rc.insert("10", "nan jauh dimato" ));
    
    //RegionController rc = new RegionController (connection.getConnection());
    //System.out.println(rc.update("12", "nan jauh disana" ));
    
    //RegionController rc = new RegionController (connection.getConnection());
    //System.out.println(rc.delete("10", "nan jauh dimato" ));
    
    //RegionController rc = new RegionController (connection.getConnection());
    //System.out.println(rc.getById("10", "nan jauh dimato" ));
    
    
    
    // ini untuk test RegionDAO, tinggal pilih salah satu aja yg mau di running apaan (insert, update, delete, getById) dan ilangin tanda komen nya biar bisa ke run   
    RegionDAO rdao = new RegionDAO(connection.getConnection());
    Region region = new Region (0, "nan jauh dimato");
    System.out.println(rdao.insert(region));
    
   //RegionDAO rdao = new RegionDAO(connection.getConnection());
    //Region region = new Region (5, "Pasifik");
    //System.out.println(rdao.update(region));

    //RegionDAO rdao = new RegionDAO(connection.getConnection());
   //Region region = new Region(); //(0, "nan jauh dimato");
    //System.out.println(rdao.delete(5));
    
    //RegionDAO rdao = new RegionDAO(connection.getConnection());
   //Region region = new Region(); //(0, "nan jauh dimato");
   // System.out.println(rdao.getById(5));

   
