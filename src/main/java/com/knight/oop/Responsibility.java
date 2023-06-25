package com.knight.oop;

public class Responsibility{

}

interface Printer {
    void print();
}

class InkjetPrinter implements Printer {
    public void print() {
        System.out.println("Inkjet 1 printer is printing.");
        System.out.println("Inkjet 2 printer is printing.");
        System.out.println("Inkjet 3 printer is printing.");
        System.out.println("Inkjet 4 printer is printing.");
        System.out.println("Inkjet 5 printer is printing.");
        System.out.println("Inkjet 6 printer is printing.");
        System.out.println("Inkjet 7 printer is printing.");
        System.out.println("Inkjet 8 printer is printing.");
        System.out.println("Inkjet 9 printer is printing.");
        System.out.println("Inkjet 10 printer is printing.");


    }
}

class LaserPrinter implements Printer {
    public void print() {

        System.out.println("Laser 1 printer is printing.");
        System.out.println("Laser 2 printer is printing.");
        System.out.println("Laser 3 printer is printing.");
        System.out.println("Laser 4 printer is printing.");
        System.out.println("Laser 5 printer is printing.");
        System.out.println("Laser 6 printer is printing.");
        System.out.println("Laser 7 printer is printing.");
        System.out.println("Laser 8 printer is printing.");
        System.out.println("Laser 9 printer is printing.");
        System.out.println("Laser 10 printer is printing.");
    }
}

class Document {
    private Printer printer;

    public Document(Printer printer) {
        this.printer = printer;
    }

    public void printDocument() {
        printer.print();
    }
}

class MainPrinter {
    public static void main(String[] args) {
        Printer inkjetPrinter = new InkjetPrinter();
        Document document1 = new Document(inkjetPrinter);
        document1.printDocument();
//        new Document(new InkjetPrinter()).printDocument();


    }
}

