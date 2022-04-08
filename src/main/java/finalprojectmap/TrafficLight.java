package finalprojectmap;
import finalprojectmap.DynamicRoadItem;

public class TrafficLight extends DynamicRoadItem {
    private int redTime;
    private int yellowTime;
    private int greenTime;
    private int timeOn;

    public TrafficLight(int r, int y, int g, double mm) {
        redTime = r;
        yellowTime = y;
        greenTime = g;

        mileMarker = mm;
    }


}
