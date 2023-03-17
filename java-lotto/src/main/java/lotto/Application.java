package lotto;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

public class Application {

    public static void main(String[] args) {
        Lotto lotto = new Lotto();


        InputView inputView = new InputView();

        OutputView outputView = new OutputView();

        inputView.buyLotto();
        lotto.extractLottoNumbers(lotto.buyLotto , inputView.money);
        outputView.viewBuyLotto(lotto.buyLotto);

        inputView.inputPrizeNumbers(lotto.prizeNumber);
        inputView.inputLottoBonusNumber();

        lotto.getLottoResult(lotto.lottoPrize, lotto.buyLotto , lotto.prizeNumber , inputView.bonusNumber);
        lotto.getProfitRate(lotto.lottoPrize );
        System.out.println(Arrays.toString(lotto.lottoPrize));
        outputView.viewLottoResult(lotto.lottoPrize, lotto.profitRate, inputView.money);


    }

}