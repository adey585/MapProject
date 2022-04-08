package hwweek8;

public class MetricGUI extends GUI {

    public Road CreateRoad(String name, double locx, double locy, double len, Road.Heading hdg) {
        return new Road(name, locx / Constants.MetersToKm, locy / Constants.MetersToKm, len / Constants.MetersToKm, hdg);
    }

    public double GetSpeed(Vehicle v) {
        return (v.GetCurrentSpeed() * Constants.MpsToKph);
    }

    public void SetSpeedLimit(Vehicle v, double s) {
        v.SetDesiredSpeed(s/ Constants.MpsToKph);
    }

}

