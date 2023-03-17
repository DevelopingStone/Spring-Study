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
        LottoResult result = new LottoResult();
        Extract extract = new Extract();
        Validate validate = new Validate();
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();

        inputView.buyLotto(); // 로또 구매
        validate.moneyValue(inputView.money); // 금액 입력 값이 올바른지 확인

        extract.extractLottoNumbers(lotto.myLotto, inputView.money); // 랜덤 번호 추출
        outputView.viewBuyLotto(lotto.myLotto); // 추출한 로또들을 화면에 출력

        inputView.inputPrizeNumbers(lotto.prizeNumber); // 당첨번호 입력
        inputView.inputBonusNumber(); // 보너스 번호 입력

        validate.prizeNumberSize(lotto.prizeNumber); // 번호 입력 개수가 올바른지 확인
        validate.prizeNumberValue(lotto.prizeNumber); // 번호 입력 값이 올바른지 확인

        result.getLottoResult(lotto.lottoPrize, lotto.myLotto, lotto.prizeNumber,
            inputView.bonusNumber); // 로또 결과를 얻는다.
        result.getProfitRate(lotto.lottoPrize); // 로또 수익도 얻는다

        outputView.viewLottoResult(lotto.lottoPrize, result.profitRate,
            inputView.money); // 얻는 결과와 수익을 화면에 출력

    }
}