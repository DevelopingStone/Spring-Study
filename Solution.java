package problem5;

import java.util.Arrays;
import java.util.Set;

class Solution {
    Set<String> MUSIC_EXT = Set.of("mp3", "aac", "flac");
    Set<String> IMAGE_EXT = Set.of("jpg", "bmp", "gif");
    Set<String> MOVIE_EXT = Set.of("mp4", "avi", "mkv");

    public int[] solution(String[] strings) {
        int[] answer = {0, 0, 0, 0};

        for (String line: strings) {
            String[] sSplit = line.split(" ");
            String ext = sSplit[0];

            int lastDot = -1;
            for (int i = 0; i < ext.length(); i++) {
                if (ext.charAt(i) == '.') {
                    lastDot = i;
                }
            }
            ext = ext.substring(lastDot+1);
            int size = Integer.valueOf(sSplit[1].substring(0, sSplit[1].length() - 1));

            if (MUSIC_EXT.contains(ext)) {
                answer[0] += size;
            } else if (IMAGE_EXT.contains(ext)) {
                answer[1] += size;
            } else if (MOVIE_EXT.contains(ext)) {
                answer[2] += size;
            } else {
                answer[3] += size;
            }
        }

        return answer;
    }

}


class Test {
    public static void main(String[] args) {
        String[] strings = "mv.song.mp3 11b\ngreatSong.flac 1000b\nnot3.txt 5b\nvideo.mp4 200b\ngame.exe 100b\nmov1e.mkv 10000b".split("\n");
        System.out.println(Arrays.toString(new Solution().solution(strings)));
    }
}