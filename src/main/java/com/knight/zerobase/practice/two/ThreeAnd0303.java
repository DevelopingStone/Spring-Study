package com.knight.zerobase.practice.two;

public class ThreeAnd0303 {

  public static void main(String[] args) {
    float a = 0;
    a = 2*3+5/6*3+15;
    System.out.println(String.format("%.2f",a));
  }

}




  class Solution0303 {
    public double solution(String s) {
      double result = evaluate(s);
      return Double.parseDouble(String.format("%.2f", result));
    }

    public static double evaluate(final String str) {
      return new Object() {
        int pos = -1, ch;

        void nextChar() {
          ch = (++pos < str.length()) ? str.charAt(pos) : -1;
        }

        boolean eat(int charToEat) {
          while (ch == ' ')
            nextChar();
          if (ch == charToEat) {
            nextChar();
            return true;
          }
          return false;
        }

        double parse() {
          nextChar();
          double x = parseExpression();
          if (pos < str.length())
            throw new RuntimeException("Unexpected: " + (char) ch);
          return x;
        }

        double parseExpression() {
          double x = parseTerm();
          for (;;) {
            if (eat('+'))
              x += parseTerm();
            else if (eat('-'))
              x -= parseTerm();
            else
              return x;
          }
        }

        double parseTerm() {
          double x = parseFactor();
          for (;;) {
            if (eat('*'))
              x *= parseFactor();
            else if (eat('/'))
              x /= parseFactor();
            else
              return x;
          }
        }

        double parseFactor() {
          if (eat('+'))
            return parseFactor();
          if (eat('-'))
            return -parseFactor();

          double x;
          int startPos = this.pos;
          if (eat('(')) {
            x = parseExpression();
            eat(')');
          } else if ((ch >= '0' && ch <= '9') || ch == '.') {
            while ((ch >= '0' && ch <= '9') || ch == '.')
              nextChar();
            x = Double.parseDouble(str.substring(startPos, this.pos));
          } else if (ch >= 'a' && ch <= 'z') {
            while (ch >= 'a' && ch <= 'z')
              nextChar();
            String func = str.substring(startPos, this.pos);
            x = parseFactor();
            if (func.equals("sqrt"))
              x = Math.sqrt(x);
            else if (func.equals("sin"))
              x = Math.sin(Math.toRadians(x));
            else if (func.equals("cos"))
              x = Math.cos(Math.toRadians(x));
            else if (func.equals("tan"))
              x = Math.tan(Math.toRadians(x));
            else
              throw new RuntimeException("Unknown function: " + func);
          } else {
            throw new RuntimeException("Unexpected: " + (char) ch);
          }

          if (eat('^'))
            x = Math.pow(x, parseFactor());

          return x;
        }
      }.parse();
    }
  }
