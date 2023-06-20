package com.knight.oop;

public interface Barista {
    public void makingCoffee();

    public void deliveringCoffee();
}

class BaristaZero implements Barista {

    @Override
    public void makingCoffee() {
        System.out.println("제로바리스타가 커피를 만들었습니다.");
    }

    @Override
    public void deliveringCoffee() {
        System.out.println("제로바리스타가 커피를 배달하였습니다.");
    }

    public void addAbility() {
        System.out.println("휘핑크림을 토끼모양으로 만들었습니다.");
    }
}

class BaristaBase implements Barista {

    @Override
    public void makingCoffee() {
        System.out.println("베이스바리스타가 커피를 만들었습니다.");
    }

    @Override
    public void deliveringCoffee() {
        System.out.println("베이스바리스타가 커피를 배달하였습니다.");
    }

    public void addAbility() {
        System.out.println("무조건 맛능력치가 +1 됩니다.");
    }
}

class Main {
    public static void main(String[] args) {
        Barista[] people = {new BaristaZero(), new BaristaBase()};

        for (Barista word : people) {
            word.makingCoffee();
            word.deliveringCoffee();
            System.out.println();
        }

        BaristaZero zero = (BaristaZero) people[0];
        zero.addAbility();
        BaristaBase base = (BaristaBase) people[1];
        base.addAbility();


        int xInt = 10;
        int x ;
        long yLong = 100;
        long y;
        
        y = xInt;
        System.out.println("y = " + y);
        x = (int) yLong;
        System.out.println("x = " + x);


    }
}
