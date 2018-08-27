package observer.multidisplay;

import java.util.Collections;
import java.util.List;

class MinMaxView {
    private ScoreRecord scoreRecord;

    MinMaxView(ScoreRecord scoreRecord) {
        this.scoreRecord = scoreRecord;
    }

    void update() {
        List<Integer> record = scoreRecord.getScoreRecord();
        displayScore(record);
    }

    private void displayScore(List<Integer> record) {
       int min = Collections.min(record);
       int max = Collections.max(record);
        System.out.println("Min : "+min+" Max : "+max);
    }
}
