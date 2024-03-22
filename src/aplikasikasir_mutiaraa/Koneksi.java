/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasikasir_mutiaraa;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Koneksi {
    Connection koneksi = null;
    
    public static Connection koneksiDB() {
        try{
           Class.forName("com.mysql.jdbc.Driver");
             Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/kasir_mutiararpl2?characterEncoding=latin1","root","");
            return koneksi;
           } catch (Exception e) {
            JOptionPane.showMessageDialog (null , e);
        }
        return null;
    }
}
 