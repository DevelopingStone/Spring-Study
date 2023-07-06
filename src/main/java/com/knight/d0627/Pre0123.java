package com.knight.d0627;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class Pre0123 {
    public static void main(String[] args) {
        int[] cars = {4, 8, 6, 1, 2};
        Solution0123 user = new Solution0123();
        System.out.println(user.solution(cars));

    }
}

class Solution0123 {
    public int solution(int[] cards) {
        List<Integer> cardsList = Arrays.stream(cards).boxed().collect(Collectors.toList());


        while (cardsList.size() > 1) {
            cardsList.sort(Collections.reverseOrder());
            int firstCard = cardsList.remove(0);
            int secondCard = cardsList.remove(0);

            if (firstCard > secondCard) {
                cardsList.add(firstCard - secondCard);
            }
        }
        return cardsList.size() == 0 ? 0 : cardsList.get(0);

    }
}