package observer.multidisplay;

import java.util.ArrayList;
import java.util.List;

class ScoreRecord {
    private List<Integer> scores = new ArrayList<>();
    private List<DataSheetView> dataSheetViews = new ArrayList<>();
    private MinMaxView minMaxView;

    void addDataSheetView(DataSheetView dataSheetView) {
        dataSheetViews.add(dataSheetView);
    }

    void setMinMaxView(MinMaxView minMaxView) {
        this.minMaxView = minMaxView;
    }

    void addScore(int score) {
        scores.add(score);
        for (DataSheetView dataSheetView : dataSheetViews) {
            dataSheetView.update();
        }
        minMaxView.update();
    }

    List<Integer> getScoreRecord() {
        return scores;
    }
}
