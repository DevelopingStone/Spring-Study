package com.knight.june27;


import java.util.Stack;

public class Pre0113 {
    public static void main(String[] args) {
        Solution0113 user = new Solution0113();
        System.out.println(user.solution("2*3/6*3+15"));

    }


}


class Solution0113 {
    public double solution(String S) {
        Stack<String> num = new Stack<>();
        Stack<String> cal = new Stack<>();
        Stack<Double> st = new Stack<>();


        String[] parts = S.split("(?<=[-+*/])|(?=[-+*/])");
        for (String part : parts) {
            if (Character.isDigit(part.charAt(0))) {
                num.push(part);
            } else {
                if (part.equals("-") || part.equals("+")) {
                    if (cal.contains("-") || cal.contains("+")
                            || cal.contains("*") || cal.contains("/")) {
                        while (!cal.isEmpty()) {
                            num.push(cal.pop());
                        }
                        cal.push(part);
                    } else {
                        cal.push(part);
                    }
                } else {
                    if (cal.contains("*") || cal.contains("/")) {
                        while (cal.contains("*") || cal.contains("/")) {
                            num.push(cal.pop());
                        }
                        cal.push(part);
                    } else {
                        cal.push(part);
                    }
                }
            }
        }
        while (!cal.isEmpty()) {
            num.push(cal.pop());
        }
        for (String str : num) {
            double num1 = 0;
            double num2 = 0;
            if (Character.isDigit(str.charAt(0))) {
                st.push(Double.parseDouble(str));
            } else {
                num2 = st.pop();
                num1 = st.pop();

                if (str.equals("+")) {
                    st.push(num1 + num2);
                } else if (str.equals("-")) {
                    st.push(num1 - num2);
                } else if (str.equals("*")) {
                    st.push(num1 * num2);
                } else if (str.equals("/")) {
                    st.push(num1 / num2);
                }
            }
        }
        return Math.floor(st.pop() * 1000) / 1000;
    }
}



class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello");
        String str = stringBox.getContent(); // "Hello"

        Box<Integer> intBox = new Box<>();
        intBox.setContent(123);
        int num = intBox.getContent(); // 123

    }
}



