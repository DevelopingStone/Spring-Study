package com.knight.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QuerySelect {

  public static void main(String[] args) {

    // JDBC driver 이름과 데이터베이스 URL
    String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
    String DB_URL = "jdbc:oracle:thin:@localhost:1521/XEPDB1";


    // 데이터베이스 계정 정보
    String USER = "KNIGHT";
    String PASS = "0816";

    // JDBC 객체
    Connection conn = null;
    Statement stmt = null;

    try {
      // JDBC 드라이버 로드
      Class.forName(JDBC_DRIVER);

      // 데이터베이스 연결
      System.out.println("데이터베이스에 연결 중입니다...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);

      // SQL 쿼리 실행
      System.out.println("쿼리를 실행합니다...");
      stmt = conn.createStatement();
      String sql = "SELECT * FROM MEMBER";
      ResultSet rs = stmt.executeQuery(sql);

      // 쿼리 결과 출력
      while (rs.next()) {
        String col1 = rs.getString("COL1");
        String col2 = rs.getString("COL2");
        System.out.println("COL1 : " + col1 + ", COL2 : " + col2);
      }

      // JDBC 객체 닫기
      rs.close();
      stmt.close();
      conn.close();
    } catch (SQLException se) {
      // JDBC 관련 예외 처리
      se.printStackTrace();
    } catch (Exception e) {
      // Class.forName() 예외 처리
      e.printStackTrace();
    } finally {
      // 사용한 JDBC 객체 닫기
      try {
        if (stmt != null) {
          stmt.close();
        }
      } catch (SQLException se2) {
      }
      try {
        if (conn != null) {
          conn.close();
        }
      } catch (SQLException se) {
        se.printStackTrace();
      }
    }
  }
}
