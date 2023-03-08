/*
package com.knight.oop;

public class Refer {

  int kor;
  int eng;
  int japan;

  public Refer() {
  }

  public Refer(int kor, int eng, int japan) {
    this.kor = kor;
    this.eng = eng;
    this.japan = japan;
  }

  public int total() {
    return kor + eng + japan;
  }

  public void test(){
    System.out.println("부모출력");
  }

  public void test1(){
    System.out.println("여기출력");
  }


}

class NewRefer extends Refer {

  int sub;

  public NewRefer() {
    super();
  }

  public NewRefer(int kor, int eng, int japan, int sub) {
    super(kor, eng, japan);
    this.sub = sub;
  }

  public static void main(String[] args) {
    Refer refer = new NewRefer(1, 1, 1, 1);


    System.out.println(refer.total());
    refer.test();
    Refer a = (Refer) refer;

    NewRefer b = (NewRefer) refer;
    b.test2();



  }

  public int total() {
    return kor + eng + japan + sub;
  }

  public void test(){
    System.out.println("자식출력");
  }
  public void test2(){
    System.out.println("자식출력");
  }

}
*/
