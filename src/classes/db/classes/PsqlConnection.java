/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.db.classes;

import classes.db.interfaces.IDb;
import org.postgresql.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rosales1015
 */
public class PsqlConnection implements IDb {

    public Connection instance ; 
   
    @Override
    public Connection getInstance(){
        if(this.instance == null){
            try {
                this.instance = connection();
            } catch (SQLException ex) {
                Logger.getLogger(PsqlConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return this.instance;
    }
    
    public Connection connection() throws SQLException{
        String url = "jdbc:postgresql://localhost:5432/bdcrud";
        String user = "postgres";
        String pass = "Rosales@1015";

        
        DriverManager.registerDriver(new Driver());
        Connection conn = DriverManager.getConnection(url,user,pass);
        return conn;
        
    }
}
