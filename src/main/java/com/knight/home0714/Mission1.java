package com.knight.home0714;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Mission1 {
    public static void main(String[] args) {

        // 시스템 속성 가져오기
        Properties properties = System.getProperties();

        // HTML 파일 생성
        StringBuilder htmlBuilder = new StringBuilder();
        htmlBuilder.append("<html>");
        htmlBuilder.append("<head>");
        htmlBuilder.append("<style>");
        htmlBuilder.append("table, th, td {");
        htmlBuilder.append("border: 1px solid black;");
        htmlBuilder.append("border-collapse: collapse;");
        htmlBuilder.append("}");
        htmlBuilder.append("</style>");
        htmlBuilder.append("</head>");
        htmlBuilder.append("<body>");
        htmlBuilder.append("<h1>자바 환경 정보</h1>");
        htmlBuilder.append("<table>");
        htmlBuilder.append("<tr><th>키</th><th>밸류</th></tr>");

        for (String key : properties.stringPropertyNames()) {
            String value = properties.getProperty(key);
            htmlBuilder.append("<tr><td>").append(key).append("</td><td>").append(value).append("</td></tr>");
        }

        htmlBuilder.append("</table>");
        htmlBuilder.append("</body>");
        htmlBuilder.append("</html>");

        // HTML 파일 저장
        try (FileWriter fileWriter = new FileWriter("index1.html")) {
            fileWriter.write(htmlBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
