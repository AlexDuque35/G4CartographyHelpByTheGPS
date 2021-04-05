package ec.edu.espe.gps.controller;

import ec.edu.espe.gps.model.GPS;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import utils.FileManager;

public class GPSController {
<<<<<<< HEAD
    public static void save(GPS gps){
        
=======

    public static void save(GPS gps) {
        String data = GPS.getLat1 + "," + GPS.getLat2 + "," + GPS.getLon1 + "," + GPS.getLong2
                fileManager.save(data, "GPS");
>>>>>>> 4b093c7ca3d43a4ff4320af2ba9d87ef681a2061
    }
    
    public static String readCsv(String direction){
        
    }
    
    
    
}
