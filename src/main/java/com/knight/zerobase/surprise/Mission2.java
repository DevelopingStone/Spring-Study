package com.knight.zerobase.surprise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//class
public class Mission2 {


  //filed
  Scanner scan = new Scanner(System.in);
  List<Integer> positionMyList;
  List<List<Integer>> positionOtherList;
  List<Integer> closestPoint;
  //filed of end

  //method
  public List<Integer> positionMy() {
    positionMyList = new ArrayList<>();
    System.out.println("나의 좌표값을 X 입력해주세요.");
    int positionX = scan.nextInt();
    positionMyList.add(positionX);
    System.out.println("나의 좌표값을 Y 입력해주세요.");
    int positionY = scan.nextInt();
    positionMyList.add(positionY);
    return positionMyList;
  }

  public List<List<Integer>> positionOther() {
    positionOtherList = new ArrayList<>();
    List<Integer> list;
    for (int i = 1; i <= 10; i++) {
      list = new ArrayList<>();
      System.out.println(i + "/10 번째 입력");
      System.out.println("임의 좌표값을 X 입력해주세요.");
      int positionX = scan.nextInt();
      list.add(positionX);
      System.out.println("임의 좌표값을 Y 입력해주세요.");
      int positionY = scan.nextInt();
      list.add(positionY);

      if (positionOtherList.contains(list)) {
        System.out.println("동일한 좌표값이 이미 존재합니다. 다시 입력해주세요.");
        i--;
      } else {
        positionOtherList.add(list);
      }
    }
    return positionOtherList;
  }

  public List<Integer> betweenSpace() {
    int myX = positionMyList.get(0);
    int myY = positionMyList.get(1);
    int minDistance = Integer.MAX_VALUE;
    List<Integer> closestPoint = new ArrayList<>();
    for (List<Integer> otherPoint : positionOtherList) {
      int otherX = otherPoint.get(0);
      int otherY = otherPoint.get(1);
      double distance = Math.sqrt(Math.pow(otherX - myX, 2) + Math.pow(otherY - myY, 2));
      if (distance < minDistance) {
        minDistance = (int) distance;
        closestPoint.clear();
        closestPoint.addAll(otherPoint);
      }
    }
    return closestPoint;
  }
  //method of end


  //main
  public static void main(String[] args) {
    Mission2 user = new Mission2();
    user.positionMy();
//    나의 좌표값 입력
    user.positionOther();
//    상대 좌표값 입력
    user.closestPoint = user.betweenSpace();
//    나와 임의좌표 거리

    System.out.println("현재 나의 위치 : " + user.positionMyList);
    System.out.println("임의의 좌표 위치 : " + user.positionOtherList);
    System.out.println("제일 가까운 좌표 : " + user.closestPoint);
  }
//main of end

}
//class of end

