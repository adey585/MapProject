package finalprojectmap;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

public class Road {
    public enum Heading {
        @SerializedName("0")
        North,
        @SerializedName("1")
        South,
        @SerializedName("2")
        East,
        @SerializedName("3")
        West
    }

    private String Name;
    private double Length;
    private double XLocation;
    private double YLocation;
    private Heading Heading;
    private List<Object> RoadItems;
    public static int NumOfRoads = 0;

    public Road(String streetName, double locX, double locY, double len, Heading hdg) {
        Name = streetName;
        Length = len;
        XLocation = locX;
        YLocation = locY;
        Heading = hdg;
        RoadItems = new ArrayList<Object>();
        NumOfRoads++;
    }

    public double GetLength() {
        return Length;
    }

    public double GetXLocation() {
        return XLocation;
    }

    public double GetYLocation() {
        return YLocation;
    }


    public Heading GetHeading() {
        return Heading;
    }


/*    public String GetRoadName() {
        return Name;
    }

    public void AddRoadItem(Object roadItem) {
        RoadItems.add(roadItem);
    }*/

    public void Print(IPrintDriver print, Object o) {
        print.PrintRoad(this, o);
    }

/*    private void InsertNewItemBefore(RoadItem current, RoadItem newItem) {
        newItem.SetPrevious(current.GetPrevious());
        newItem.SetNext(current);
        current.SetPrevious(newItem);
        newItem.GetPrevious().SetNext(newItem);
    }

    private void InsertNewItemAfter(RoadItem current, RoadItem newItem) {
        newItem.SetNext(current.GetNext());
        current.SetNext(newItem);
        newItem.SetPrevious(current);
        if (newItem.GetNext() != null) newItem.GetNext().SetPrevious(newItem);
    }*/
}

