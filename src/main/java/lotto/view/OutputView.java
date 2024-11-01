package lotto.view;

import lotto.model.Lotto;
import lotto.model.Lottos;
import lotto.util.Parser;

import java.util.Map;

public class OutputView {
    private static final String PURCHASE_OUTPUT_MESSAGE = "개를 구매했습니다.";
    private static final String STATS_OUTPUT_MESSAGE = "당첨 통계\n---";
    private static final String THREE_MATCHING_OUTPUT_MESSAGE = "3개 일치 (5,000원) - ";
    private static final String FOUR_MATCHING_OUTPUT_MESSAGE = "4개 일치 (50,000원) - ";
    private static final String FIVE_MATCHING_OUTPUT_MESSAGE = "5개 일치 (1,500,000원) - ";
    private static final String FIVE_MATCHING_BONUS_OUTPUT_MESSAGE = "5개 일치, 보너스 볼 일치 (30,000,000원) - ";
    private static final String SIX_MATCHING_OUTPUT_MESSAGE = "6개 일치 (2,000,000,000원) - ";

    public void printIssuedLottos(Lottos lottos) {
        System.out.println();
        System.out.println(lottos.getLottos().size() + PURCHASE_OUTPUT_MESSAGE);
        for (Lotto lotto : lottos.getLottos()) {
            System.out.println(lotto.toString());
        }
    }

    public void printWinningDetail(Map<String, Integer> winningDetail) {
        System.out.println();
        System.out.println(STATS_OUTPUT_MESSAGE);
        System.out.println(THREE_MATCHING_OUTPUT_MESSAGE + winningDetail.getOrDefault("3", 0) + "개");
        System.out.println(FOUR_MATCHING_OUTPUT_MESSAGE + winningDetail.getOrDefault("4", 0) + "개");
        System.out.println(FIVE_MATCHING_OUTPUT_MESSAGE + winningDetail.getOrDefault("5", 0) + "개");
        System.out.println(FIVE_MATCHING_BONUS_OUTPUT_MESSAGE + winningDetail.getOrDefault("5+", 0) + "개");
        System.out.println(SIX_MATCHING_OUTPUT_MESSAGE + winningDetail.getOrDefault("6", 0) + "개");
    }
}
