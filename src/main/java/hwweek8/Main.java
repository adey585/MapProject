package hwweek8;

import java.io.IOException;

public class Main {

    public static void main(String[ ] args) throws IOException {

        GUI simInput;
        Map map = Map.CreateFromFile("/Users/adey/Documents/School/MapProject/src/main/java/hwweek8/map.json");
        IPrintDriver cp = new ConsolePrint();

        simInput = new MetricGUI();

//        Road Uptown = simInput.CreateRoad("Uptown", 0.0, -0.09, .180, Road.Heading.North);
//        map.AddRoad(Uptown);
//        Road Crosstown = simInput.CreateRoad("Crosstown", -0.09, 0.0, .180, Road.Heading.East);
//        map.AddRoad(Crosstown);

        CharMatrix cm = new CharMatrix();
        map.Print(cp, cm);
        map.SavetoFile("/Users/adey/Documents/School/MapProject/src/main/java/hwweek8/map-output.json");
        for (int i = 0; i < Constants.CharMapSize; i++) {
            String s = new String(cm.map[i]);
                System.out.println(s);
        }

/*        GUI gui;
        gui = null;
        char choice = ' ';
        double enterSpeedLimit = 0;

        Scanner sc = new Scanner(System.in);

        if(choice != 'I' && choice != 'M') {

            System.out.print("Enter 'I' for imperial or 'M' for metric: ");
            choice = sc.next().charAt(0);

            if(choice == 'I') {
                gui = new ImperialGUI();

            } else if(choice =='M') {
                gui = new MetricGUI();

            } else
                System.out.println("Incorrect Input!");
        }

        System.out.print("Enter speed limit: ");
        enterSpeedLimit = sc.nextDouble();

        Car car = new Car();
        gui.SetSpeedLimit(car, enterSpeedLimit);
        Truck truck1 = new Truck(4);
        gui.SetSpeedLimit(truck1, enterSpeedLimit);
        Truck truck2 = new Truck(8);
        gui.SetSpeedLimit(truck2, enterSpeedLimit);

        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(car);
        vehicles.add(truck1);
        vehicles.add(truck2);

        for (int i = 0; i < 11; i++) {

            for (Vehicle v : vehicles) {
                v.UpdateSpeed(1);
                String s = v.getClass().toString();
                System.out.println(s + " speed:" + String.format(" %.2f", gui.GetSpeed(v)));
            }
        }*/
    }

    public double GetSpeed(Vehicle v) {
        return v.GetCurrentSpeed() * Constants.MpsToMph;
    }

    public void SetSpeedLimit(Vehicle v, double speed) {
        v.SetDesiredSpeed(speed / Constants.MpsToMph);
    }

}

