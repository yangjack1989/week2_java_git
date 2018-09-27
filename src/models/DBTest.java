package models;

import java.sql.SQLException;

public class DBTest {
    public static void main (String[]args){
        try{
            System.out.println(DBconnect.getPhoneManufacturers());

        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
