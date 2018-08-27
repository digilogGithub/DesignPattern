package observer.recommend;

import java.util.ArrayList;
import java.util.List;

class ScoreRecord extends Subject {

    private List<Integer> scores = new ArrayList<Integer>();

    ScoreRecord(List<Observer> observers) {
        super(observers);
    }
    void addScore(int score) {
        scores.add(score);
        notifyObserver();
    }
    List<Integer> getScoreRecord() {
        return scores;
    }
}
