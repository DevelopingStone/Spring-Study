package com.knight.oop;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiMehtod {

}



class MyFrame extends Frame implements ActionListener {

  Button button;

  public MyFrame() {
    button = new Button("Check how Kang Rak loves Mina !");
    button.addActionListener(this); // 이벤트 핸들러 등록
    add(button);
    setSize(200, 200);
    setVisible(true);
  }

  public static void main(String[] args) {
    new MyFrame();
  }

  // 이벤트 메소드 구현
  public void actionPerformed(ActionEvent e) {
    System.out.println("너무너무 사랑해 미나야");
  }
}

