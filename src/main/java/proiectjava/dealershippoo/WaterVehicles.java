package proiectjava.dealershippoo;

import java.util.ArrayList;

/**
 *
 * @author Dragos :>
 */
public class WaterVehicles extends Vehicle {

    String type;
    ArrayList<Vehicle> vehicles;

    WaterVehicles() {
        type = "<gol>";
        vehicles = null;
    }

    WaterVehicles(String type, ArrayList<Vehicle> vehicles) {
        this.type = type;
        this.vehicles = vehicles;
    }

    WaterVehicles(WaterVehicles wv) {
        this.type = wv.type;
        this.vehicles = wv.vehicles;
    }

    @Override
    public String toString() {
        return "Tip: " + type + "\nVehicule: " + vehicles;
    }
    
    public String getType()
    {
        return type;
    }
    
    public void setType(String type)
    {
        this.type = type;
    }
    
    public ArrayList<Vehicle> getVehicles()
    {
        return vehicles;
    }
    
    public void setVehicles(ArrayList<Vehicle> vehicles)
    {
        this.vehicles = vehicles;
    }
}
