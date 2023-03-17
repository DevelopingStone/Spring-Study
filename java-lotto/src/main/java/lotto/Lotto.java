package lotto;

import java.util.ArrayList;
import java.util.Arrays;
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
    List<List<Integer>> myLotto = new ArrayList<>(); // 구매한 로또
    List<Integer> prizeNumber = new ArrayList<>(); // 당첨번호

    public int getPrizeIndex(Prize prize) {
        return lottoPrize[prize.ordinal()];
    }
}

class Validate extends Lotto {

    public void prizeNumberSize(List<Integer> prizeNumber) {
        if (prizeNumber.size() != 6) {
            System.out.println("[ERROR] 로또 번호의 개수는 6개여야 합니다.");
            throw new IllegalArgumentException();
        }
    }

    public void prizeNumberValue(List<Integer> prizeNumber) {
        for (Integer integer : prizeNumber) {
            if (integer < 0 || integer > 45) {
                System.out.println("[ERROR] 로또 번호는 1부터 45 사이의 숫자여야 합니다.");
                throw new IllegalArgumentException();
            }
        }
    }

    public void moneyValue(int money) {
        if (money % 1000 != 0) {
            System.out.println("[ERROR] 금액은 천원 단위이어야 합니다.");
            throw new IllegalArgumentException();
        }
        System.out.printf("%d개를 구매했습니다.\n", money / 1000);
    }
}

class LottoNumber extends Lotto {

    private boolean correctFiveAndBonus(int correctNumberCount, int bonusNumber,
        List<Integer> eachLotto) {
        return correctNumberCount == 5 && eachLotto.contains(bonusNumber);
    }

    public void checkLottoNumber(int[] lottoPrize, List<Integer> eachLotto,
        List<Integer> prizeNumber, int bonusNumber) {

        int correctNumberCount = (int) eachLotto.stream().filter(prizeNumber::contains).count();

        if (correctFiveAndBonus(correctNumberCount, bonusNumber, eachLotto)) {
            lottoPrize[getPrizeIndex(Prize.FIVE_AND_BONUS)]++;
            return;
        }
        lottoPrize[correctNumberCount]++;
    }
}

class Extract extends LottoNumber {

    public void extractLottoNumbers(List<List<Integer>> myLotto, int money) {
        for (int i = 0; i < money / 1000; i++) {
            myLotto.add(Randoms.pickUniqueNumbersInRange(1, 45, 6));
        }
    }
}

class LottoResult extends LottoNumber {

    float profitRate = 0;

    public void getProfitRate(int[] lottoPrize) {
        for (int i = 0; i < lottoPrize.length; i++) {
            int finalI = i;
            profitRate += lottoPrize[i] * Arrays.stream(Prize.values())
                .filter(prize -> prize.ordinal() == finalI).collect(Collectors.toList()).get(0)
                .getValue();
        }
    }

    public void getLottoResult(int[] lottoPrize, List<List<Integer>> myLotto,
        List<Integer> prizeNumber, int bonusNumber) {
        for (List<Integer> eachLotto : myLotto) {
            checkLottoNumber(lottoPrize, eachLotto, prizeNumber, bonusNumber);
        }
    }
}


class InputView {

    int money;
    int bonusNumber;

    public void buyLotto() {
        System.out.println("구입금액을 입력해 주세요.");
        money = Integer.parseInt(Console.readLine()); // 금액 입력
    }

    public void inputPrizeNumbers(List<Integer> prizeNumber) {
        System.out.println("당첨 번호를 입력해 주세요.");
        prizeNumber.addAll(
            Arrays.stream(Console.readLine().split(",")).map(Integer::parseInt).collect(
                Collectors.toList()));
    }

    public void inputBonusNumber() {
        System.out.println("보너스 번호를 입력해 주세요.");
        bonusNumber = (Integer.parseInt(Console.readLine()));
    }
}

class OutputView {

    public void viewBuyLotto(List<List<Integer>> myLotto) {
        for (List<Integer> lotto : myLotto) {
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
        System.out.printf("총 수익률은 %.1f", profitRate / money);
        System.out.print("%입니다.");

    }
}