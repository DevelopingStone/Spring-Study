package com.knight.oop;

interface Girl {

  public void shout();
}


class hit implements Girl {

  @Override
  public void shout() {
    System.out.println("Fuck");
  }
}

class love implements Girl {

  @Override
  public void shout() {
    System.out.println("Love");
  }
}


public class Factory {

  public static void main(String[] args) {
    Factory button = new Factory();
    button.factory("Fuck").shout();
    button.factory("Love").shout();

//    Girl dongMina = button.factory("dong");
//    dongMina.shout();

  }

  public Girl factory(String pwd) {
    if (pwd.equals("Fuck")) {
      return new hit();
    } else {
      return new love();
    }
  }

}


