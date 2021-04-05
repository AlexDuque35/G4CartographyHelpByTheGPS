package ec.edu.espe.gps.controller;

import ec.edu.espe.gps.model.GPS;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import utils.FileManager;

public class GPSController {

    public static void save(GPS gps) {
        String data = GPS.
                fileManager.save(data, "GPS");
    }

    public static String readCsv(String direction) {
        String data;
        data = fileManager.read("GPS");
        return data;
    }
}
