package observer.recommend;

import java.util.Collections;
import java.util.List;

class ObserverMinMaxView implements Observer {

    private ScoreRecord scoreRecord;


    ObserverMinMaxView(ScoreRecord scoreRecord) {
        this.scoreRecord = scoreRecord;
    }

    void displayMinMaxView(List<Integer> scores) {
        int min = Collections.min(scores);
        int max = Collections.max(scores);

        System.out.println("Min : "+min+"  Max : "+max);
    }

    @Override
    public void update() {
        List<Integer> scores = scoreRecord.getScoreRecord();
        displayMinMaxView(scores);
    }


}
