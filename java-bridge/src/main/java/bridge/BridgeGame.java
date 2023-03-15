package bridge;

//다리 건너기 게임을 관리하는 클래스

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class BridgeGame {

    BridgeMaker bridgeMaker = new BridgeMaker();
    InputView inputView = new InputView();
    BridgeRandomNumberGenerator bridgeRandomNumberGenerator = new BridgeRandomNumberGenerator();
    OutputView outputView = new OutputView();

    List<List<String>> bridge;
    int bridge_size = inputView.readBridgeSize();
    int play_time = 0;
    //사용자가 칸을 이동할 때 사용하는 메서드
    //이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.

    public void play_game() {
        // 재시도를 하지 않을시 while 문 종료
        while (true) {
            boolean game_result = move();
            System.out.println("게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)");
            if (!retry()) {
                System.out.println("최종 게임 결과");
                outputView.printMap(bridge);
                outputView.printResult(play_time, game_result);
                break;
            }
        }
    }
    private boolean move() {
        int turn = 0;
        bridge = bridgeMaker.makeBridge(bridge_size); // 다리의 사이즈만큼 bridge 를 만든다.
        play_time++; // 게임 플레이 횟수 1 증가
        while (turn!=bridge_size) {
            String next_move = inputView.readMoving();
            if (bridgeRandomNumberGenerator.generate()==1 && next_move.equals("U")) { //무작위 값이 0인 경우 아래 칸, 1인 경우 위 칸이 건널 수 있는 칸이 된다.
                bridge.get(0).set(2*turn+1 , "O");
                outputView.printMap(bridge);
                turn++;
                continue;
            }
            if (bridgeRandomNumberGenerator.generate()==0 && next_move.equals("D")) {
                bridge.get(1).set(2*turn+1 , "O");
                outputView.printMap(bridge);
                turn++;
                continue;
            }
            if (next_move.equals("D")) {
                bridge.get(1).set(2*turn+1 , "X");
                outputView.printMap(bridge);
                break;
            }
            if (next_move.equals("U")) {
                bridge.get(0).set(2*turn+1 , "X");
                outputView.printMap(bridge);
                break;
            }
        }
        return turn==bridge_size; // 사다리의 길이만큼 이동했다면 true 반환.
    }

    //사용자가 게임을 다시 시도할 때 사용하는 메서드
    //재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
    private boolean retry() {
        return Console.readLine().equals("R");
    }
}
