package com.knight.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

  public static void main(String[] args) throws ClassNotFoundException, SQLException {

    String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
    String sql = "SELECT * FROM member";

    Class.forName("oracle.jdbc.driver.OracleDriver");
    System.out.println("드라이브 연결완료");
    Connection con = DriverManager.getConnection(url, "KNIGHT", "0816");
    System.out.println("아이디 비번 연결완료");
    Statement st = con.createStatement();
    System.out.println("셀렉트 쿼리 조회");
    ResultSet rs = st.executeQuery(sql);
    System.out.println("결과 쿼리 리턴");

    while (rs.next()) {

      String name = rs.getString("id");
      System.out.println(name);
    }

    rs.close();
    st.close();
    con.close();
  }

}


