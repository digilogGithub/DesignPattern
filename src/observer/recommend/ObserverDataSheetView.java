package observer.recommend;

import java.util.List;

class ObserverDataSheetView implements Observer {

    private ScoreRecord scoreRecord;
    private int viewCount;

    ObserverDataSheetView(ScoreRecord scoreRecord, int viewCount) {
        this.scoreRecord = scoreRecord;
        this.viewCount = viewCount;
    }


    @Override
    public void update() {
        List<Integer> scores = scoreRecord.getScoreRecord();
        displayScoreRecord(scores);
    }

    void displayScoreRecord(List<Integer> scores) {
        System.out.println("List of "+viewCount);
        for (int i = 0; i < scores.size() && i < viewCount; i++) {
            System.out.print(scores.get(i)+" ");
        }
        System.out.println();
    }
}
