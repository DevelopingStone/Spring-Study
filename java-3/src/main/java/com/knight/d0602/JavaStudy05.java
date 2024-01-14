package com.knight.d0602;

/*
 박강락
 */
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class JavaStudy05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[달력 출력 프로그램]");

        System.out.print("달력의 년도를 입력해 주세요.(yyyy) : ");
        int yyyy = scanner.nextInt();

        System.out.print("달력의 월을 입력해 주세요. (MM) : ");
        int mm = scanner.nextInt();

        LocalDate date = LocalDate.of(yyyy, mm, 1); // 현재 월의 첫 번째 날짜 계산
        String monthName = date.getMonth().name();
        String monthNameKr = date.format(DateTimeFormatter.ofPattern("M월"));
        int daysInMonth = date.getMonth().length(date.isLeapYear()); // 월의 총 일 수 계산
        int startDay = date.getDayOfWeek().getValue() % 7; // 현재 월의 첫 번째 날짜의 요일(0~6)


        System.out.printf("[%d년 %s]%n",yyyy,monthNameKr);
        System.out.println("일 월 화 수 목 금 토");

        for (int i = 0; i < startDay; i++) {
            System.out.print("   ");
        }

        for (int day = 1; day <= 7 - startDay; day++) {
            System.out.printf("%2s ", String.format("%02d", day));
        }
        System.out.println();

        for (int day = 8 - startDay; day <= daysInMonth; day++) {
            System.out.printf("%2s ", String.format("%02d", day));
            if (date.plusDays(day - 1).getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }
        }

        if (date.plusDays(daysInMonth - 1).getDayOfWeek() != DayOfWeek.SATURDAY) {
            System.out.println();
        }
    }
}
