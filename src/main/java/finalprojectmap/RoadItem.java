package finalprojectmap;

public class RoadItem {
    protected RoadItem previousItem;
    protected RoadItem nextItem;
    protected double mileMarker = 0.0;
    private Road currentRoad;

    public double GetMileMarker() {
        return mileMarker;
    }
    public void SetMileMarker(double distance) {
        mileMarker = distance;
    }
    public Road GetCurrentRoad() {
        return currentRoad;
    }
    public void SetCurrentRoad(Road road) {
        currentRoad = road;
    }
    public RoadItem GetPrevious() {
        return previousItem;
    }
    public RoadItem GetNext() {
        return nextItem;
    }
    public void SetPrevious(RoadItem item) {
        previousItem = item;
    }
    public void SetNext(RoadItem item) {
        nextItem = item;
    }

}
