package bridge;

import java.util.List;

//사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
public class OutputView {


    //현재까지 이동한 다리의 상태를 정해진 형식에 맞춰 출력한다.
    // 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.

    public void printMap(List<List<String>> bridge) {

        for (int i = 0 ; i < bridge.get(0).size() ; i++) {
            System.out.printf(bridge.get(0).get(i));
        }
        System.out.println();
        for (int i = 0 ; i < bridge.get(1).size() ; i++) {
            System.out.printf(bridge.get(1).get(i));
        }

    }

    //게임의 최종 결과를 정해진 형식에 맞춰 출력한다.
    // 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
    public void printResult(int play_time , boolean game_result) {
        if (game_result) {
            System.out.println("\n게임 성공 여부: 성공");
            System.out.printf("총 시도한 횟수: %d" , play_time);
            return;
        }
        // 실패했을때
        System.out.println("\n게임 성공 여부: 실패");
        System.out.printf("총 시도한 횟수: %d\n" , play_time);
    }
}
