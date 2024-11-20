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
public class AirVehicles extends Vehicle{
    String type;
    ArrayList<Vehicle> vehicles;
    
    AirVehicles(){
        type="Neprecizat";
        vehicles=null;
    }
    AirVehicles(String type, ArrayList<Vehicle> vehicles){
        this.type=type;
        this.vehicles=vehicles;
    }
    AirVehicles(AirVehicles airvehicles){
        this.type=airvehicles.type;
        this.vehicles=airvehicles.vehicles;
    }
    public String toString(){
        return "Tipul de vehicul: "+type+"\nVehicule: "+vehicles;
    }
    
    public String getType(){
        return type;
    }
    
    public ArrayList<Vehicle> getVehicles(){
        return vehicles;
    }
    
    
    public void setType(String type){
        this.type=type;
    }
    
    public void setVehicles(ArrayList<Vehicle> vehicles){
        this.vehicles=vehicles;
    }
    
    
    
    
}
