package com.knight.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {

  public static void main(String[] args) {

    //드라이버연결
    //커넥터
    //스테이트먼트(셀렉트쿼리)
    //리절셋(결과값반환)

    String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
    String login = "KNIGHT";
    String number = "0816";
    String query = "SELECT * FROM MEMBER";

    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      System.out.println("className 확인");
      Connection con = DriverManager.getConnection(url, login,number);
      System.out.println("Driver 연결");
      Statement st = con.createStatement();
      System.out.println("Statement 정상");
      ResultSet rs = st.executeQuery(query);
      System.out.println("ResultSet 값리턴"+"\n");
      System.out.println("ID | PWD | NAME | GENDER | BIRTHDAY | PHONE | REGDATE | EMAIL");

      while(rs.next()){
        String id = rs.getString("ID");
        String pwd = rs.getString("PWD");
        String name = rs.getString("NAME");
        String gender = rs.getString("gender");
        String birthday = rs.getString("birthday");
        String phone = rs.getString("phone");
        Date date = rs.getDate("regdate");
        String email = rs.getString("email");


        System.out.print(id+pwd+name+gender+birthday+phone+date+email+"\n");


      }


    }
    catch(ClassNotFoundException | SQLException e){

    }






  }

}
