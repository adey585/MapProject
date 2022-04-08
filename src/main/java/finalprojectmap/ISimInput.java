package finalprojectmap;

public interface ISimInput {
	void setSpeedLimit(Vehicle v, double speed);
	public Road CreateRoad(String name, double locX, double locY, double len, Road.Heading hdg);
	public SpeedLimit CreateSpeedLimit(double speed, double location);
	public StopSign CreateStopSign(double location);
}