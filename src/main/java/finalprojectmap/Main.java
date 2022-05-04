package finalprojectmap;
import java.io.IOException;
public class Main {
    public static void main(String[ ] args) throws IOException {

        GUI simInput;
        Map map = Map.CreateFromFile("/Users/adey/Documents/School/MapProject/src/main/java/finalprojectmap/map.json");
        IPrintDriver cp = new ConsolePrint();
        simInput = new MetricGUI();

        Simulation simulator = new Simulation();
        TrafficLight light1 = simInput.CreateTrafficLight(3, 1, 2, TrafficLight.Color.Red, "Light 1", 30);
        TrafficLight light2 = simInput.CreateTrafficLight(3, 1, 2, TrafficLight.Color.Green, "Light 2", 50);
        simulator.AddDynamicRoadItem(light1);
        simulator.AddDynamicRoadItem(light2);
        for (int i = 0; i <= 20; i++) {
            simulator.Update(1);
        }


/*        Road Uptown = simInput.CreateRoad("Uptown", 0.0, -0.09, .180, Road.Heading.North);
        map.AddRoad(Uptown);
        Road Crosstown = simInput.CreateRoad("Crosstown", -0.09, 0.0, .180, Road.Heading.East);
        map.AddRoad(Crosstown);
        Road Uptown = simInput.CreateRoad("Uptown", 0.0, -0.09, .180, Road.Heading.North);
        map.AddRoad(Uptown);
        Road Crosstown = simInput.CreateRoad("Crosstown", -0.09, 0.0, .180, Road.Heading.East);
        map.AddRoad(Crosstown);
        StopSign sign = simInput.CreateStopSign(.01);
        Crosstown.AddRoadItem(sign);
        StopSign sign2 = simInput.CreateStopSign(.23);
        Uptown.AddRoadItem(sign2);
         StopSign sign3 = simInput.CreateStopSign(.32);
        Uptown.AddRoadItem(sign3);
        StopSign sign4 = simInput.CreateStopSign(.302);
        Uptown.AddRoadItem(sign4);
        SpeedLimit limit = simInput.CreateSpeedLimit(80.0, .02);
        Crosstown.AddRoadItem(limit);
        SpeedLimit limit2 = simInput.CreateSpeedLimit(50.0, .123);
        Uptown.AddRoadItem(limit2);*/

        CharMatrix cm = new CharMatrix();
        map.Print(cp, cm);
        map.SavetoFile("/Users/adey/Documents/School/MapProject/src/main/java/finalprojectmap/map-output.json");
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
        return v.getCurrentSpeed() * Constants.MpsToMph;
    }
    public void SetSpeedLimit(Vehicle v, double speed) {
        v.setDesiredSpeed(speed/Constants.MpsToMph);
    }

}

