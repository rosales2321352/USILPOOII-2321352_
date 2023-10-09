/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package classes.db.interfaces;

import java.sql.Connection;

/**
 *
 * @author rosales1015
 */
public interface IDb {
    
    public abstract Connection getInstance();
    
}
