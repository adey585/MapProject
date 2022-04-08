package hwweek8;

public class Car extends Vehicle {

    protected void Accelerate(int secondsDelta) {
        SetCurrentSpeed(GetCurrentSpeed() + Constants.AccRate * secondsDelta);
    }

    protected void Decelerate(int secondsDelta) {
        SetCurrentSpeed(GetCurrentSpeed() - Constants.DecRate * secondsDelta);
    }

}