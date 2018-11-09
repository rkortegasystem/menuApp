package com.rkosistemas.meseroapp.connectiondb;

import java.sql.*;

public class ConnectionClass {

    private Connection cn;


    public Connection getConnection(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn = DriverManager.getConnection("jdbc:sqlserver://192.168.1.5:1433;databaseName=restoitsco",
                    "SQLSERVER", "1234567890");
        } catch (Exception e){
        }
        return cn;
    }

//    public static void main(String args[]){
//        Statement st;
//        ResultSet rs;
//        PreparedStatement pst;
//        ConnectionClass cl = new ConnectionClass();
//        System.out.print(cl.getConnection());
//        String query = "select * from usuario";
//        try{
//            pst = cl.cn.prepareStatement(query);
//            rs = pst.executeQuery();
//            while (rs.next()){
//                System.out.print(rs.getString("usuarioUsername"));
//            }
//        } catch (Exception e){
//        }
//    }
}
