package finalprojectmap;

public class SpeedLimit extends StaticRoadItem {
    protected double SpeedLimit;

    public SpeedLimit(double speed, double location) {
        mileMarker = location;
        SpeedLimit = speed;
    }

    public double getSpeedLimit() {
        return SpeedLimit;
    }

}
