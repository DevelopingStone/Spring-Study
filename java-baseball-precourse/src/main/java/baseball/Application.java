package baseball;
import camp.nextstep.edu.missionutils.Randoms;
import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        Baseball_Game baseballGame = new Baseball_Game();

        baseballGame.Game(); // 게임을 실행한다.
    }
}

class Baseball_Game {
    private String number; // 랜덤값.
    private String number_check; // 추출값. 만약 랜덤값과 중복되지 않을 1~9의 숫자라면 랜덤값에 추출값을 추가한다.
    private String suppose; // 입력데이터.
    private int[] correct_number; // 스트라이크와 볼의 개수를 저정하는 정수 배열

    void Extract() { // 랜덤값을 뽑는다.

        number="";

        while (number.length()!=3) { // 숫자의 길이가 3이 될때까지 반복한다.

            number_check=Integer.toString(Randoms.pickNumberInRange(1,9)); // 1에서 9까지 숫자를 추첨한다.

            if (number.contains(number_check)) { // 중복된 숫자가 포함된다면 다시 추첨한다.
                continue;
            }
            number+=number_check; // 추첨한 숫자가 중복된 숫자가 아닐경우 문자를 추가한다.
        }
    }

    void Input_suppose() { // 추측값을 입력받는다.
        System.out.print("숫자를 입력해주세요 : ");
        suppose = Console.readLine();

        if (suppose.contains("0") || Integer.parseInt(suppose)<123 || Integer.parseInt(suppose)>987) {
            System.out.println("\n잘못된 값을 입력하셨습니다.");
            throw new IllegalArgumentException();
            // 잘못된 값을 입력했다면 예외를 발생시킨다.
        }
    }

    void Initialization() { // 추측값에 대한 결과 배열을 초기화한다.
        correct_number= new int[]{0, 0};
    }

    boolean Play() {
        for (int i = 0 ; i < 3 ; i++) {
            if (number.equals(suppose)) { // 추측값이 정답이라면
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                return true;
            }
            else if (number.charAt(i)==suppose.charAt(i)) { // 똑같은 자리에 똑같은 값이라면
                correct_number[0]+=1; // 스트라이크 추가
            }
            else if (suppose.contains(String.valueOf(number.charAt(i)))) { // 다른자리에 똑같은 값이라면
                correct_number[1]+=1; // 볼 추가
            }
        }

        if (correct_number[0]>0) {
            System.out.printf("%d 스트라이크 ", correct_number[0]);
        }
        if (correct_number[1]>0) {
            System.out.printf("%d 볼 ",correct_number[1]);
        }
        if (correct_number[0]==0 && correct_number[1]==0) { // 같은게 아무것도 없다면
            System.out.print("낫싱");
        }

        System.out.println('\n');
        return false;
    }

    void Game() {
        Extract(); // 컴퓨터가 임의의 세자리 수를 고른다.

        while (true) {
            Input_suppose(); // 값을 추측한다.
            Initialization(); // 결과를 출력한다.

            if (!Play()) { // 맞출때까지 반복한다.
                continue;
            }

            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

            if (Integer.parseInt(Console.readLine()) == 2) { // 종료한다면
                break;
            }

            Extract(); // 컴퓨터가 임의의 세자리 수를 고른다.

        }
    }
}