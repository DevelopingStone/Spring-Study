/*
틱택톡

1. 그리드.
2. 숫자 놓기 , 예외처리
3. 한줄 체크

 */

import java.util.*;

class tic_tak_toe { // 그리드와 턴수를 저장할 틱택톡 클래스

    char[][] grid = new char[3][3];
    int time ; // 턴 체크 변수

}

public class Main {
    public static void main(String[] args)  {

        tic_tak_toe Game = new tic_tak_toe(); // Game 이라는 틱택톡 객체를 생성한다.

        Game.time = 0; // 처음 턴 수는 0 으로 초기화한다.

        set_game(Game.grid); // 그리드를 전부 '.' 으로 초기화해주는 메서드를 호출한다.

        while (End(Game.grid)==0) { // 게임이 끝날때까지 턴을 진행시킨다.

            set_turn(Game.time , Game.grid); // 틱택톡 턴을 둔다.
            Game.time++; // 턴수 1 증가

            show_grid(Game.grid); // 그리드를 출력한다.

            if (End(Game.grid)==1) { // 만약 X가 이겼다면
                System.out.println("X 가 이겼습니다!");
                break;
            }
            else if (End(Game.grid)==2) { // 만약 O가 이겼다면
                System.out.println("O 가 이겼습니다!");
                break;
            }
            else if (Game.time == 9) { // 아무도 이기지 않고 턴 수가 9 에 도달했다면
                System.out.println("비겼습니다!");
                break;
            }
        }

    }

    public static void show_grid(char[][] grid) { // 현재 그리드를 보여주는 메서드
        for (int i = 0 ; i < 3 ; i++) {
            for (int j = 0 ; j < 3 ; j++) {
                System.out.printf("%c" , grid[i][j]); // 3x3 크기의 그리드를 출력한다.
            }
            System.out.println();
        }
    }

    public static void set_game(char[][] grid) { // char[][] grid 를 통해 grid 객체의 메모리 주소를 넣으므로 반환값이 없어도됨.
        for (int i = 0 ; i < 3 ; i++) {
            for (int j = 0 ; j < 3 ; j++) {
                grid[i][j]='.'; // 그리드의 초기값을 전부 '.' 으로 설정한다.
            }
        }

    }

    public static void set_turn(int time , char[][] grid)  { // 틱택톡을 두는 경우

        Scanner scanner = new Scanner(System.in);

        int x , y; // 좌표를 저장할 변수

        while (true) {

            System.out.println("어디에 두시겠습니까? x,y 좌표값을 1~3 사이의 정수로 공백을 두고 입력해주세요.");

            x = scanner.nextInt();
            y = scanner.nextInt();
            // 좌표 입력

            if (!Can_set_turn(x, y, grid)) { // 만약 둘 수 없다면
                continue;
            }

            if (time%2==1) { // 둘수있을때 홀수번째 턴이라면
                grid[x-1][y-1]='X'; // 값을 X 로 저장한다.
            }
            else { // 둘 수 있을때 짝수번째 턴이라면
                grid[x-1][y-1]='O'; // 값을 O 로 저장한다
            }
            break; // 값을 저장하고 while 문을 빠져나온다.
        }

    }

    public static boolean Can_set_turn(int x , int y , char[][] grid) // 놓을 수 있는지 체크해주는 메서드
    {
        if (x<0 || x>3 || y<0 || y>3) { // 범위 밖이라면 false 반환
            System.out.println("해당 위치에는 놓을 수 없습니다.");
            return false;
        }

        if (grid[x-1][y-1]!='.') { // 범위 안이지만 '.' 이 아니라면 false 반환
            System.out.println("해당 위치는 이미 놓여진 상태입니다.");
            return false;
        }
        return true; // 가능하다면 true 반환
    }

    public static int End(char[][] grid) { // 게임이 끝났는지 확인해주는 메서드.

        for (int i = 0 ; i < 3 ; i++) {

            if (grid[i][0]==grid[i][1]&& grid[i][1]==grid[i][2] && grid[i][0]=='X') {
                return 1; // i 번째 가로가 모두 X 라면
            }
            if (grid[0][i]==grid[1][i]&& grid[1][i]==grid[2][i] && grid[0][i]=='X') {
                return 1; // i 번째 세로가 모두 X 라면
            }

            if (grid[i][0]==grid[i][1]&& grid[i][1]==grid[i][2] && grid[i][0]=='O') {
                return 2; // i 번째 가로가 모두 O 라면
            }
            if (grid[0][i]==grid[1][i]&& grid[1][i]==grid[2][i] && grid[0][i]=='O') {
                return 2; // i 번째 세로가 모두 O 라면
            }

        }

        return 0; // 게임이 끝났지 않았다면 0 을 반환한다.
    }


}