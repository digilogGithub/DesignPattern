package observer.differentdisplay;

import java.util.ArrayList;
import java.util.List;

class ScoreRecord {
    private List<Integer> scores = new ArrayList<Integer>();
    private MinMaxView minMaxView;

    void setMinMaxView(MinMaxView minMaxView) {
        this.minMaxView = minMaxView;
    }
    void addScore(int score) {
        scores.add(score);
        minMaxView.update();
    }

    List<Integer> getScoreRecord() {
        return scores;
    }
}
