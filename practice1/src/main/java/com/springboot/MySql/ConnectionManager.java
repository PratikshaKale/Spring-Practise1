package com.springboot.MySql;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

@Component
public class ConnectionManager {
    public static Connection getConnection(){

        String name,pass,url;
        Connection con = null;
        try {
           // Class.forName("com.mysql.jdbc.Driver");
            url="jdbc:mysql://localhost:3306/backedngfg";
            name="root";
            pass="Pratiksha@123";
            con = DriverManager.getConnection(url,name,pass);
            System.out.println("Connection created");
            Statement st=con.createStatement();
           // st.executeUpdate("Insert into student (Student_name , age ) values('Divya Patil','20'); ");
           // int result1=st.executeUpdate("update Student set address='Delhi' where studentId='4';");
            int result2=st.executeUpdate("delete from student where studentId='2';");
            con.close();
            System.out.println("Connection closed");

            return con;
        }
        catch (Exception e){
        System.out.println(e.toString());
        }
        return null ;
    }

    public static void  main(String args[]){
        getConnection();
    }
}
