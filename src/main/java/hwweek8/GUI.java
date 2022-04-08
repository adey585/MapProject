package hwweek8;

public abstract class GUI implements ISimInput, ISimOutput {

    public abstract Road CreateRoad(String name, double locx, double locy, double len, Road.Heading hdg);
    public abstract double GetSpeed(Vehicle v);
    public abstract void SetSpeedLimit(Vehicle v, double speed);

}