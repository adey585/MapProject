package hwweek8;

public class Truck extends Vehicle {

    private int loadWeight;      // in tons

    public Truck(int weight) {
        loadWeight = weight;
    }

    protected void Accelerate(int secondsDelta) {
        if (loadWeight <= 5)
            SetCurrentSpeed(GetCurrentSpeed() + Constants.AccRateEmpty * secondsDelta);
        else
            SetCurrentSpeed(GetCurrentSpeed() + Constants.AccRateFull * secondsDelta);
    }

    protected void Decelerate(int secondsDelta) {
        if (loadWeight <= 5)
            SetCurrentSpeed(GetCurrentSpeed() - Constants.DecRateEmpty * secondsDelta);
        else
            SetCurrentSpeed(GetCurrentSpeed() - Constants.DecRateFull * secondsDelta);
    }

}

