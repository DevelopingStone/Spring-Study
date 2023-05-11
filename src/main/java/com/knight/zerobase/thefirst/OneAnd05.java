package com.knight.zerobase.thefirst;

public class OneAnd05 {
  public static void main(String[] args) {
    int[] capacity = {5, 3, 4};
    int N = 10;
    int M = 3;
    int K = 4;
    System.out.println(solution(N, M, K, capacity));
  }

  public static long solution(int N, int M, int K, int[] capacity) {
    long answer = 1;
    int position = 0;
    long numerator = 1;

    while (N > 0) {
      if (capacity[position] >= N) {
        numerator = divideAndMultiply(numerator, combination(capacity[position], N));
        N = 0;
      } else {
        numerator = divideAndMultiply(numerator, combination(capacity[position], capacity[position]));
        N -= capacity[position];
        position++;
      }
    }

    answer = combination(M, K) * numerator;

    return answer;
  }

  public static long combination(int n, int r) {
    long result = 1;
    for (int i = 1; i <= r; i++) {
      result = divideAndMultiply(result, n - i + 1);
      result /= i;
    }
    return result;
  }

  public static long divideAndMultiply(long numerator, long factor) {
    long gcd = gcd(numerator, factor);
    return (numerator / gcd) * (factor / gcd);
  }

  public static long gcd(long a, long b) {
    if (b == 0) {
      return a;
    } else {
      return gcd(b, a % b);
    }
  }
}