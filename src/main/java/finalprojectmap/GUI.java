package finalprojectmap;

public abstract class GUI implements ISimInput, ISimOutput {
	public abstract double GetSpeed(Vehicle v);
	public abstract void setSpeedLimit(Vehicle v, double speed);
	public abstract Road CreateRoad(String name, double locX, double locY, double len, Road.Heading hdg);
	public abstract SpeedLimit CreateSpeedLimit(double speed, double location);
	public abstract StopSign CreateStopSign(double location);


}