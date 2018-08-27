package observer.multidisplay;

import java.util.List;

class DataSheetView {
    private ScoreRecord scoreRecord;

    int viewCount;


    DataSheetView(ScoreRecord scoreRecord, int viewCount) {
        this.scoreRecord = scoreRecord;
        this.viewCount = viewCount;
    }

    void update() {
        List<Integer> record = scoreRecord.getScoreRecord();
        displayScore(record, viewCount);
    }

    private void displayScore(List<Integer> record, int viewCount) {
        System.out.print("List of "+ viewCount + " entries:");
        for (int i = 0; i < record.size() && i< viewCount; i++) {
            System.out.print(record.get(i) + " ");
        }
        System.out.println();
    }
}
