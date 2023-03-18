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
    String query = "SELECT * FROM NOTICE WHERE ID>=2";

    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      System.out.println("className 확인");
      Connection con = DriverManager.getConnection(url, login, number);
      System.out.println("Driver 연결");
      Statement st = con.createStatement();
      System.out.println("Statement 정상");
      ResultSet rs = st.executeQuery(query);
      System.out.println("ResultSet 값리턴" + "\n");
      System.out.println("ID | TITLE | WRITER_ID | CONTENT | REGDATE | HIT | FILES");

      while (rs.next()) {
        int id = rs.getInt("ID");
        String title = rs.getString("TITLE");
        String name = rs.getString("WRITER_ID");
        String gender = rs.getString("CONTENT");
        Date birthday = rs.getDate("REGDATE");
        int phone = rs.getInt("HIT");
        String date = rs.getString("FILES");
        System.out.println(id + title + name + gender + birthday + phone + date);


      }


    } catch (ClassNotFoundException | SQLException e) {

    }


  }

}
