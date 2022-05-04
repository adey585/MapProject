package finalprojectmap;
import com.google.gson.annotations.SerializedName;

public class TrafficLight extends DynamicRoadItem {
    public enum Color {
        @SerializedName("0")
        Red,
        @SerializedName("1")
        Yellow,
        @SerializedName("2")
        Green
    }

    private int redTime;
    private int yellowTime;
    private int greenTime;
    private int timeOn;
    private Color lit;
    private String name;

    public TrafficLight(int r, int y, int g, Color c, String n, double mm) {
        redTime = r;
        yellowTime = y;
        greenTime = g;
        lit = c;
        name = n;
        mileMarker = mm;
    }

    public void Update(int seconds) {
        timeOn += seconds;
        System.out.println("-> " + name + " Color: " + lit);
        if ((lit == Color.Red) && (timeOn >= redTime)) {
            lit = Color.Green;
            timeOn = 0;
            return;
        }
        else if ((lit == Color.Yellow) && (timeOn >= yellowTime)) {
            lit = Color.Red;
            timeOn = 0;
            return;
        }
        else if ((lit == Color.Green) && (timeOn >= greenTime)) {
            lit = Color.Yellow;
            timeOn = 0;
            return;
        }
    }
}
