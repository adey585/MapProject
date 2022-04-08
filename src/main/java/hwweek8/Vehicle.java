package hwweek8;

public abstract class Vehicle {

    private double currentSpeed = 0.0;
    private double desiredSpeed;

    protected abstract void Accelerate(int secondsDelta);
    protected abstract void Decelerate(int secondsDelta);

    public double GetCurrentSpeed() {
        return currentSpeed;
    }

    public void SetDesiredSpeed(double mph) {
        desiredSpeed = mph;
    }

    protected void SetCurrentSpeed(double speed) {

        if(currentSpeed <= speed) {// accelerating
            if (speed > desiredSpeed) currentSpeed = desiredSpeed;
            else currentSpeed = speed;
        }
        else {// braking
            if (speed < desiredSpeed) currentSpeed = desiredSpeed;
            else currentSpeed = speed;
        }
    }

    public void UpdateSpeed(int seconds) {
        if (currentSpeed > desiredSpeed) Decelerate(seconds);
        else if (currentSpeed < desiredSpeed) Accelerate(seconds);
    }

}
