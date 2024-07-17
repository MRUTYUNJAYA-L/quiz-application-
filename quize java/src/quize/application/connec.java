package quize.application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class connec {
    Connection connection;
    Statement statement;
    public connec(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nam","root","PHW#84#jeor");
            statement=connection.createStatement();

        }catch(Exception va){
            va.printStackTrace();
        }

    }
}
