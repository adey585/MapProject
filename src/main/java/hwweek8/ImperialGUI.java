package hwweek8;

public class ImperialGUI extends GUI {

    public Road CreateRoad(String name, double locx, double locy, double len, Road.Heading hdg) {
        return new Road(name, locx / Constants.MetersToMiles, locy / Constants.MetersToMiles, len / Constants.MetersToMiles, hdg);
    }

    public double GetSpeed(Vehicle v) {
        return (v.GetCurrentSpeed() * Constants.MpsToMph);
    }

    public void SetSpeedLimit(Vehicle v, double s) {
        v.SetDesiredSpeed(s/ Constants.MpsToMph);
    }
}
