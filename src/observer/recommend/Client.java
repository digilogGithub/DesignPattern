package observer.recommend;

import java.util.ArrayList;
import java.util.List;

class Client {
    public static void main(String[] args) {
        List<Observer> observers = new ArrayList<>();
        ScoreRecord scroreRecord = new ScoreRecord(observers);

        Observer dataSheetView3 = new ObserverDataSheetView(scroreRecord,3);
        Observer dataSheetView5 = new ObserverDataSheetView(scroreRecord,5);
        Observer minMaxView = new ObserverMinMaxView(scroreRecord);

        scroreRecord.attach(dataSheetView3);
        scroreRecord.attach(dataSheetView5);
        scroreRecord.attach(minMaxView);

        for (int index = 1; index <= 5; index++) {
            int score = index * 10;
            System.out.println("Adding : "+score);
            scroreRecord.addScore(score);
            System.out.println();
        }
    }
}
