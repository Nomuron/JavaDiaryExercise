import java.util.HashMap;
import java.util.Map;

public class DiaryNote {

    private String weather;
    private String humour;
    private int numberOfHours;

    public DiaryNote(String weather, String humour, int numberOfHours) {
        this.weather = weather;
        this.humour = humour;
        this.numberOfHours = numberOfHours;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getHumour() {
        return humour;
    }

    public void setHumour(String humour) {
        this.humour = humour;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public String toString() {
        return  "I was " + humour + ", because I played for " + numberOfHours + "h" + " and it was " + weather + ".";
    }



    public static void main(String[] args) {
        Map<Integer, DiaryNote> diaryNoteMap = new HashMap<>();
        diaryNoteMap.put(3, new DiaryNote("cloudy", "happy", 3));
        diaryNoteMap.put(4, new DiaryNote("rainy", "grumpy", 7));
        diaryNoteMap.put(7, new DiaryNote("sunny", "sad", 1));

        diaryNoteMap.forEach((k,v)-> System.out.println(k+" : "+v));
    }

}