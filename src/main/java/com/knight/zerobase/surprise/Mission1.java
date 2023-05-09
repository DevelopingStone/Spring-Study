package com.knight.zerobase.surprise;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Mission1 {
  public static void main(String[] args) {
    try {
      // 시스템 속성 가져오기
      Properties properties = System.getProperties();

      // HTML 파일 생성
      FileWriter fileWriter = new FileWriter("property.html");

      // HTML 문서 시작 태그 작성
      fileWriter.write("<!DOCTYPE html>\n<html>\n<head>\n<meta charset=\"UTF-8\">\n<title>Mission1</title>\n<style>");

      // HTML 테이블 스타일 설정
      fileWriter.write("table, th, td {\nborder: 1px solid black;\nborder-collapse: collapse;\n}\n");
      fileWriter.write("th {\nbackground-color: #B0C4DE;\ncolor: black;\npadding: 10px;\n}\n");
      fileWriter.write("caption {\nfont-size: 24px;\n}\n");

      // HTML 문서 레이아웃 작성
      fileWriter.write("</style></head>\n<body>\n<h1>자바 환경정보</h1>\n<table>");

      // HTML 테이블 헤더 작성
      fileWriter.write("<tr>\n<th> 키 </th>\n<th> 속성 </th>\n</tr>\n");

      // 시스템 속성을 HTML 테이블로 변환하여 파일에 저장
      for (String name : properties.stringPropertyNames()) {
        String value = properties.getProperty(name);
        fileWriter.write("<tr><td>" + name + "</td><td>" + value + "</td></tr>");
      }

      // HTML 문서 종료 태그 작성
      fileWriter.write("</table>\n</body>\n</html>");

      // 파일 저장 및 종료
      fileWriter.close();
      System.out.println("property.html 파일이 생성되었습니다.");

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
