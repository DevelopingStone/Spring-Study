package com.knight.woowacourse1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NicknameChecker {
    public static List<String> solution(String[][] forms) {
        Set<String> duplicateNicknames = new HashSet<>();
        Set<String> uniqueNicknames = new HashSet<>();

        for (String[] form : forms) {
            String email = form[0];
            String nickname = form[1];

            if (isNicknameDuplicate(nickname)) {
                duplicateNicknames.add(email);
            } else {
                uniqueNicknames.add(email);
            }
        }

        List<String> result = new ArrayList<>(uniqueNicknames);
        result.sort(String::compareTo);

        return result;
    }

    private static boolean isNicknameDuplicate(String nickname) {
        for (int i = 0; i < nickname.length() - 1; i++) {
            if (nickname.charAt(i) == nickname.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[][] forms = {
                {"jm@email.com", "제이엠"},
                {"jason@email.com", "제이슨"},
                {"woniee@email.com", "워니"},
                {"mj@email.com", "엠제이"},
                {"nowm@email.com", "이제엠"}
        };

        List<String> result = solution(forms);
        for (String email : result) {
            System.out.println(email);
        }
    }
}

