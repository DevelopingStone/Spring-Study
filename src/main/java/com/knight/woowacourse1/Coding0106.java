package com.knight.woowacourse1;

import java.util.*;

public class Coding0106 {

    public static void main(String[] args) {

        String forms[][] = {{"jm@email.com", "제이엠"}, {"jason@email.com", "제이슨"}, {"woniee@email.com", "워니"}, {"mj@email.com", "엠제이"}, {"nowm@email.com", "이제엠"}};

        System.out.println(new Solution0106().name(forms));

    }
}

class Solution0106 {


    public List<String> name(String[][] forms) {
        List<String> result = new ArrayList<>();
        Set<String> invalidEmails = new HashSet<>();

        for (String[] form : forms) {
            String email = form[0];
            String nickname = form[1];

            if (isInvalidNickname(nickname)) {
                invalidEmails.add(email);
            }
        }

        result.addAll(invalidEmails);
        result.sort(String::compareTo);
        return result;
    }

    private boolean isInvalidNickname(String nickname) {
        int length = nickname.length();

        for (int i = 0; i < length - 1; i++) {
            if (nickname.charAt(i) == nickname.charAt(i + 1)) {
                return true;
            }
        }

        return false;
    }
}






