package com.robogenies.Week07;

import java.sql.*;

public class ReplaceCharDB {

    public static void main(String[] args) {

        Connection connection = null;
        Statement statement=null;
        ResultSet resultSet=null;

        String tmpname="";

        //1. Registering a Driver

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //2. Init Connection

        //Connection conObj=DriverManager.getConnection("url","username","password");
        try {
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/akash-test","praveen","12345");
            } catch (SQLException e) {
            e.printStackTrace();
        }

        //3. Creating Statements
        //Statement statementObj=conObj.createStatement ** refer init connection block;
        try {
            statement=connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //4. Execute the Query
        //ResultSet is nothing but a Set which can able to store the response from the db as structured array like format.

        String qry="SELECT * FROM `users` where userid=2";
        //ResultSet resObj=statementObj.executeQuery("qry")  ** refer creating statements block;

        try {
            resultSet =statement.executeQuery(qry);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //Using the response

        try {
            while (resultSet.next()) {
                System.out.println("UserID:" + resultSet.getInt(1)+"\nUserName:"+resultSet.getString(2));
                tmpname=resultSet.getString(2);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        tmpname=tmpname.replace("\""," ");
        System.out.println(tmpname);

        String qry1="UPDATE `users` SET username='"+tmpname+"' WHERE userid=2";
        //ResultSet resObj=statementObj.executeQuery("qry")  ** refer creating statements block;

        try {
             statement.execute(qry1);
        } catch (SQLException e) {
            e.printStackTrace();
        }


        /*
        {"users":3{"","","",""},{"","","",""},{"","",""}}
         */

    }

}