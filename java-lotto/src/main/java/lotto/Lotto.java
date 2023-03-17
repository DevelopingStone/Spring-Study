package lotto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

// Ctrl+Alt+L = 자동코드 정리


enum Prize {
    ZERO(0), ONE(0), TWO(0), THREE(5000), FOUR(50_000), FIVE(1_500_000), SIX(
        2_000_000_000), FIVE_AND_BONUS(
        30_000_000);

    private final int lottoPrizeValue;

    Prize(int lottoPrizeValue) {
        this.lottoPrizeValue = lottoPrizeValue;
    }

    public int getValue() {
        return lottoPrizeValue;
    }

}

class Lotto {

    int[] lottoPrize = new int[Prize.values().length]; // 초기값은 0 , Prize 의 개수만큼 배열크기를 유연하게 할당한다.
    List<List<Integer>> buyLotto = new ArrayList<>(); // 구매한 로또
    List<Integer> prizeNumber = new ArrayList<>(); // 당첨번호
    float profitRate = 0;

    public void test() {
        System.out.println(Arrays.stream(Prize.values())
            .filter(prize -> prize.ordinal() == 4).collect(Collectors.toList()).get(0).getValue());
    }

    private int getPrizeIndex(Prize prize) {
        return lottoPrize[prize.ordinal()];
    }

    public void getProfitRate(int[] lottoPrize) {
        for (int i = 0; i < lottoPrize.length; i++) {
            int finalI = i;
            profitRate += lottoPrize[i] * Arrays.stream(Prize.values())
                .filter(prize -> prize.ordinal() == finalI).collect(Collectors.toList()).get(0)
                .getValue();

        }
    }

    public void validate(List<Integer> prizeNumber) {
        if (prizeNumber.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    public void extractLottoNumbers(List<List<Integer>> buyLotto, int money) {
        for (int i = 0; i < money / 1000; i++) {
            buyLotto.add(Randoms.pickUniqueNumbersInRange(1, 45, 6));
        }
    }

    public void getLottoResult(int[] lottoPrize, List<List<Integer>> buyLotto,
        List<Integer> prizeNumber,
        int bonusNumber) {
        for (List<Integer> eachLotto : buyLotto) {
            checkCorrectLottoNumber(lottoPrize, eachLotto, prizeNumber, bonusNumber);
        }
    }

    private boolean correctFiveAndBonus(int correctNumberCount, int bonusNumber,
        List<Integer> eachLotto) {
        return correctNumberCount == 5 && eachLotto.contains(bonusNumber);
    }

    public void checkCorrectLottoNumber(int[] lottoPrize, List<Integer> eachLotto,
        List<Integer> prizeNumber,
        int bonusNumber) {
        int correctNumberCount = 0;
        for (Integer lottoNumber : eachLotto) { // 스트림
            if (prizeNumber.contains(lottoNumber)) {
                correctNumberCount++;
            }
        }

        if (correctFiveAndBonus(correctNumberCount, bonusNumber, eachLotto)) {
            lottoPrize[getPrizeIndex(Prize.FIVE_AND_BONUS)]++;
            return;
        }
        lottoPrize[correctNumberCount]++;
    }
}

class InputView {

    int money;
    int bonusNumber;

    public void buyLotto() {
        System.out.println("구입금액을 입력해 주세요.");
        money = Integer.parseInt(Console.readLine()); // 금액 입력
        System.out.printf("%d개를 구매했습니다.\n", money / 1000);

    }

    public void inputPrizeNumbers(List<Integer> prizeNumber) {
        System.out.println("당첨 번호를 입력해 주세요.");
        prizeNumber.addAll(
            Arrays.stream(Console.readLine().split(",")).map(Integer::parseInt).collect(
                Collectors.toList()));
    }

    public void inputLottoBonusNumber() {
        System.out.println("보너스 번호를 입력해 주세요.");
        bonusNumber = (Integer.parseInt(Console.readLine()));
    }
}

class OutputView {

    public void viewBuyLotto(List<List<Integer>> buyLotto) {
        for (List<Integer> lotto : buyLotto) {
            System.out.println(lotto);
        }
    }


    public void viewLottoResult(int[] lottoPrize, float profitRate, int money) {
        System.out.println("당첨 통계");
        System.out.println("---");

        System.out.printf("3개 일치 (5,000원) - %d개\n", lottoPrize[Prize.THREE.ordinal()]);
        System.out.printf("4개 일치 (50,000원) - %d개\n", lottoPrize[Prize.FOUR.ordinal()]);
        System.out.printf("5개 일치 (1,500,000원) - %d개\n", lottoPrize[Prize.FIVE.ordinal()]);
        System.out.printf("5개 일치, 보너스 볼 일치 (30,000,000원) - %d개\n",
            lottoPrize[Prize.FIVE_AND_BONUS.ordinal()]);
        System.out.printf("6개 일치 (2,000,000,000원) - %d개\n", lottoPrize[Prize.SIX.ordinal()]);
        System.out.printf("총 수익률은 %.3f", profitRate / money);
        System.out.print("%입니다.");

    }
}