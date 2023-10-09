/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.db;

import classes.db.classes.PsqlConnection;
import classes.db.interfaces.IDBFactory;
import classes.db.interfaces.IDb;

/**
 *
 * @author rosales1015
 */
public class DbPsql implements IDBFactory {
    @Override
    public IDb createDb() {
        return new PsqlConnection();
    }
}
