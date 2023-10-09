/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.db;

import classes.db.interfaces.IDBFactory;
import entities.Parameter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author rosales1015
 */
public class Db {
    final static String ConnectionType = "Mysql";
    
    
    public static Connection getInstance() throws SQLException {
        IDBFactory factory = null;
        if("Mysql".equals(ConnectionType)){
            factory = new DbMysql();
        }
        if("Psql".equals(ConnectionType)){
            factory = new DbPsql();
        }

        
        if(factory.createDb() != null){    
            Connection conn = factory.createDb().getInstance();    
            return conn;
        } 
        return null;
    }
    
    /**
     *
     * @param sql
     * @param params
     * @return ResultSet
     */
    public static ResultSet executeQuery(String sql, Parameter[] params ) throws SQLException{
        PreparedStatement preparedStatement = Db.getInstance().prepareStatement(sql);
        if(params.length > 0){
            for (Parameter param : params) {
                preparedStatement.setString(param.key_, param.value_);
            }
        }
        return preparedStatement.executeQuery();
    }

    /**              
     * @param sql
     * @return ResultSet
     * @throws SQLException 
     */
    public static ResultSet executeQuery(String sql) throws SQLException {
        return executeQuery(sql, new Parameter[0]);
    }

    
    
}


