package finalprojectmap;

public class Car extends Vehicle {

	protected void Accelerate(int secondsDelta) {
		setCurrentSpeed(getCurrentSpeed() + Constants.AccRate * secondsDelta);
	}
	protected void Decelerate(int secondsDelta) {
		setCurrentSpeed(getCurrentSpeed() - Constants.DecRate * secondsDelta);
	}
	public void Update(int seconds) {
	}

/*	public Car() {
		super();
	}
	public Car(float speed, String direction, float location) {
		super(speed, direction, location);
	}*/
}
