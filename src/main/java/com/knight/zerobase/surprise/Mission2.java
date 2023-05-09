package com.knight.zerobase.surprise;

import java.io.FileWriter;
import java.io.IOException;

public class Mission2 {

  public static void main(String[] args) {
    int totalPosts = 127; // 전체 글의 개수
    int postsPerPage = 10; // 한 페이지당 보여지는 글의 수
    int blocksPerPageNav = 10; // 페이지네비게이션에서 보여주는 블록수
    int currentPage = 5; // 현재 페이지번호

    int totalPages = (int) Math.ceil((double) totalPosts / postsPerPage); // 전체 페이지 수 계산
    int currentBlock = (int) Math.ceil((double) currentPage / blocksPerPageNav); // 현재 블록 계산
    int startPage = (currentBlock - 1) * blocksPerPageNav + 1; // 시작 페이지 계산
    int endPage = Math.min(startPage + blocksPerPageNav - 1, totalPages); // 끝 페이지 계산

    StringBuilder paginationBuilder = new StringBuilder();
    paginationBuilder.append("<html>");
    paginationBuilder.append("<head>");
    paginationBuilder.append("<meta charset=\"utf-8\">");
    paginationBuilder.append("<title>Mission2</title>");
    paginationBuilder.append("</head>");
    paginationBuilder.append("<body>");
    paginationBuilder.append("<div class=\"pagination\">");

    if (currentBlock > 1) {
      int previousBlockPage = (currentBlock - 2) * blocksPerPageNav + 1;
      paginationBuilder.append("<a href=\"/posts?page=").append(previousBlockPage)
          .append("\">Prev</a>");
    }

    for (int i = startPage; i <= endPage; i++) {
      if (i == currentPage) {
        paginationBuilder.append("<span class=\"current\">").append(i).append("</span>");
      } else {
        paginationBuilder.append("<a href=\"/posts?page=").append(i).append("\">").append(i)
            .append("</a>");
      }
    }

    if (currentBlock < (int) Math.ceil((double) totalPages / blocksPerPageNav)) {
      int nextBlockPage = currentBlock * blocksPerPageNav + 1;
      if (nextBlockPage > totalPages) {
        nextBlockPage = totalPages;
      }
      paginationBuilder.append("<a href=\"/posts?page=").append(nextBlockPage)
          .append("\">Next</a>");
    }

    paginationBuilder.append("</div>");
    paginationBuilder.append("</body>");
    paginationBuilder.append("</html>");

    String paginationHtml = paginationBuilder.toString();
    System.out.println(paginationHtml);

    try {
      // HTML 파일 생성
      FileWriter fileWriter = new FileWriter("pagination.html");
      fileWriter.write(paginationHtml);
      fileWriter.close();
      System.out.println("pagination.html 파일이 생성되었습니다.");

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
