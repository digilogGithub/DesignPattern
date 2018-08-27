package observer.init;

import java.util.ArrayList;
import java.util.List;

class ScoreRecord {
    private List<Integer> scores = new ArrayList<Integer>();
    private DataSheetView dataSheetView;

    void setDataSheetView(DataSheetView dataSheetView) {
        this.dataSheetView = dataSheetView;
    }

    void addScore(int score) {
        scores.add(score);
        dataSheetView.update();
    }

    List<Integer> getScoreRecord() {
        return scores;
    }
}
