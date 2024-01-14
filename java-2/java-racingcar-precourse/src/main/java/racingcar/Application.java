package racingcar;
import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
Car 객체를 생성해서 메서드를 활용할려면 main 함수에서 객체에 대해 접근을 해야하나
변수들이 Private 로 인해 접근이 불가능해서 클래스 내에 Play 를 함수를 만들어서
객체의 값을 변경한다.
 */
public class Application {
    public static void main(String[] args) {
        Car car = new Car();
        car.Play();
    }
}

class Car {
    private String name;
    private int position = 0;
    private String race = "";
    private int Try; // 게임 횟수
    private final ArrayList<Car> car =  new ArrayList<>();; // 자동차 객체 배열을 생성한다.

    Car () { }

    Car(String name) {
        this.name = name;
    }

    void Input_Car() { // 자동차 입력 메서드
        System.out.println("경주할 자동차 이름을 입력하세요.이름은 쉼표(,) 기준으로 구분한다.");
        for (String i : Console.readLine().split(","))
        {
            car.add(new Car(i));
        }
    }
    void Input_Try() { // 게임 횟수 입력 메서드
        System.out.println("시도할 회수는 몇회인가요?");
        Try=Integer.parseInt(Console.readLine());
    }
    void Extract_Output() { // 추첨결과를 출력하는 메서드
        car.forEach(i -> System.out.println(i.name + " : " + i.race));
        System.out.println();
    }

    void Extract() { // 추첨을 하는 메서드
        for (int i = 0; i < car.size(); i++) {
            if (Randoms.pickNumberInRange(0, 9) >= 4) {
                car.get(i).race+="-";
                car.get(i).position+=1;
                continue;
            }
            car.get(i).race+=" ";
        }
    }

    void Winner() { // 승자를 출력하는 메서드
        int max_position= car.stream().map(i -> i.position).max(Integer :: compare).get();

        List <String> winner_name = car.stream()
                .filter(i -> i.position==max_position)
                .map(i -> i.name).collect(Collectors.toList());

        System.out.println("최종 우수자 : ");
        winner_name.forEach(System.out::println);
    }

    void Play() { // 게임을 진행하는 메서드
        Input_Car();
        Input_Try();
        for (int i = 0 ; i < Try ; i++) { // Try 의 개수만큼
            Extract(); // 추첨을 한다.
            Extract_Output(); // 매회마다 결과를 출력한다.
        }
        Winner(); // 승자를 출력한다.
    }
}



/*
FeedBack

1. enum 도 사용하능함
2. Logger를 통해 그레들에 의존성울 주입할것.
3. log 로 출력할것 , plugin 에 sonarlint 로 bad smell 코드를 체크할것.
4. https://medium.com/@jang.wangsu/%EC%84%A4%EA%B3%84-%EC%9A%A9%EC%96%B4-%EC%9D%91%EC%A7%91%EB%8F%84%EC%99%80-%EA%B2%B0%ED%95%A9%EB%8F%84-b5e2b7b210ff
5. https://catsbi.oopy.io/bf003ff6-2912-4714-8ac2-44eeb7becc93 - 객체지향 생활 체조 원칙
6. https://hckcksrl.medium.com/solid-%EC%9B%90%EC%B9%99-182f04d0d2b - SOILD 원칙
7. MVC 패턴을 적용해볼것.
8. Optional 을 사용해서 get 함수를 사용하지 않아볼것.
 */