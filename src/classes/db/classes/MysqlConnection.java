/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.db.classes;

import classes.db.interfaces.IDb;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rosales1015
 */
public class MysqlConnection implements IDb {

    private Connection instance;
    
    
    @Override
    public Connection getInstance(){
        if(instance == null){
            try {
                this.instance = connection();
            } catch (SQLException ex) {
                Logger.getLogger(MysqlConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return this.instance;
    }
    
    public Connection connection() throws SQLException{
        String user = "root";
        String pass = "Admin@1234";
        String url = "jdbc:mysql://localhost:3306/test_mysql?useTimezone=true&serverTimezone=UTC&useSSL=false";

        DriverManager.registerDriver(new Driver());
        Connection conn = DriverManager.getConnection(url,user,pass);
        return conn;
    }
    
    
    
    
}
