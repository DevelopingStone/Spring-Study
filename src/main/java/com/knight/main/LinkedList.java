package com.knight.main;

class Node {
    int value;
    Node next;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}


public class LinkedList {
    Node head;

    public LinkedList(Node head) {
        this.head = head;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }


    }


    public void append(int value) {
        if (head == null) {
            head = new Node(value, null);
            return;
        }
        Node tmp = head.next;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp = new Node(value, null);


    }


    public void remove(int value) {
        if (isEmpty()) {
            return;
        }
        if (head.value == value) {
            head = head.next;
            return;
        }


        Node cur = head;
        Node prev = null;


        while (cur.value != value && cur.next != null) {
            prev = cur;
            cur = cur.next;
        }


        if (cur.next == null) {
            System.out.println("존재하지 않는 값입니다.");
            return;
        }
        prev.next = cur.next;


    }

}

