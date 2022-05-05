package finalprojectmap;

public class ImperialGUI extends GUI {
	public double GetSpeed(Vehicle v) {
		return ((v.getCurrentSpeed()) * (Constants.MpsToMph));
	}
	public void setSpeedLimit(Vehicle v, double s) {
		v.setDesiredSpeed(s/(Constants.MpsToMph));
	}
	public Road CreateRoad(String name, double locX, double locY, double len, Road.Heading hdg) {
		return new Road(name, locX/Constants.MetersToMiles, locY/Constants.MetersToMiles, len/Constants.MetersToMiles, hdg);
	}

	public SpeedLimit CreateSpeedLimit(double speed, double location) {
		return new SpeedLimit(speed/(Constants.MetersToMiles), location/Constants.MetersToMiles);
	}

	public StopSign CreateStopSign(double location) {
		return new StopSign(location/Constants.MetersToMiles);
	}
	public TrafficLight CreateTrafficLight(int rTime, int yTime, int gTime, TrafficLight.Color lit, String name, double location) {
		return new TrafficLight(rTime, yTime, gTime, lit, name, location/Constants.MetersToMiles);
	}
}
