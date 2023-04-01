package com.knight.zerobase;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class JavaStudy05 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("[달력 출력 프로그램]");

    // 년도와 월 입력 받기
    System.out.print("달력의 년도를 입력해 주세요.(yyyy) : ");
    int year = scanner.nextInt();

    System.out.print("달력의 월을 입력해 주세요. (MM) : ");
    int month = scanner.nextInt();

    scanner.close();

    LocalDate date = LocalDate.of(year, month, 1); // 현재 월의 첫 번째 날짜 계산
    String monthName = date.getMonth().name();
    String monthNameKr = date.format(DateTimeFormatter.ofPattern("M월"));
    int daysInMonth = date.getMonth().length(date.isLeapYear()); // 월의 총 일 수 계산
    int startDay = date.getDayOfWeek().getValue(); // 현재 월의 첫 번째 날짜의 요일(1~7)

    // 첫 번째 주의 빈 칸 출력
    for (int i = 1; i < startDay; i++) {
      System.out.print("   ");
    }

    // 달력 출력
    System.out.println(monthNameKr + " " + year);
    System.out.println("일 월 화 수 목 금 토");

    // 첫 번째 주의 날짜 출력
    for (int day = 1; day <= 7 - startDay + 1; day++) {
      System.out.printf("%2s ", String.format("%02d", day));
    }
    System.out.println();

    // 나머지 주의 날짜 출력
    for (int day = 8 - startDay + 1; day <= daysInMonth; day++) {
      System.out.printf("%2s ", String.format("%02d", day));
      if (date.plusDays(day - 1).getDayOfWeek() == DayOfWeek.SATURDAY) {
        System.out.println();
      }
    }

    // 마지막 주의 빈 칸 출력
    if (date.plusDays(daysInMonth - 1).getDayOfWeek() != DayOfWeek.SATURDAY) {
      System.out.println();
    }
  }
}
