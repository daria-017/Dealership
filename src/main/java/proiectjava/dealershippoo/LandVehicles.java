/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proiectjava.dealershippoo;
import java.util.ArrayList;
/**
 *
 * @author Daria
 */
public class LandVehicles extends Vehicle{
    String type;
    ArrayList<Object> vehicles;
    
    LandVehicles()
    {
        type="Nu se cunoaste tipul";
        vehicles=null;
    }
    
     LandVehicles(String type,ArrayList<Object> vehicles)
    {
        this.type=type;
        this.vehicles=new ArrayList<>(vehicles);
    }
     
     
     

    LandVehicles(LandVehicles copy)
    {
        this.type=copy.type;
        this.vehicles=new ArrayList<>(copy.vehicles);
    }
         
    public String toString()
    {
     return "Tipul vehicului:"+type+"Vehicule:"+vehicles;
    }
    // Getter pentru 'type'
    public String getType() { return type; } 
    public void setType(String type) { this.type = type; } 
    public ArrayList<Object> getVehicles() { return vehicles; } 
    public void setVehicles(ArrayList<Object> vehicles) { this.vehicles = vehicles;

    }
}
