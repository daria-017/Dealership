//JetPlane, Airplane, Helicopter
//Vehicle, Customer, VehicleShop
package proiectjava.dealershippoo;
//

import java.awt.Color;
import javax.swing.ImageIcon;

public class Airplane extends AirVehicles {
    int id;
    String brand;
    String model;
    int year;
    Color color;
    double price;
    short weight;
    int engineCycles;
    Engine engine;
    Transmission transmission;
    ImageIcon photo;
    
    Airplane(){
        id=0;
        brand="Marca avion necunoscuta";
        model="Model avion necunoscut";
        year=0;
        color=null;
        price=0;
        weight=0;
        engineCycles=0;
        engine=new Engine();
        transmission=new Transmission();
        photo=new ImageIcon();
    }
    Airplane(int id, String brand, String model, int year, Color color, double price, short weight, int engineCycles, Engine engine,Transmission transmission, ImageIcon photo){
        this.id=id;
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.color=color;
        this.price=price;
        this.weight=weight;
        this.engineCycles=engineCycles;
        this.engine=engine;
        this.transmission=transmission;
        this.photo=photo;
        
    }
    
    Airplane(Airplane airplane){
        this.id=airplane.id;
        this.brand=airplane.brand;
        this.model=airplane.model;
        this.year=airplane.year;
        this.color=airplane.color;
        this.price=airplane.price;
        this.weight=airplane.weight;
        this.engineCycles=airplane.engineCycles;
        this.engine=new Engine(airplane.engine);
        this.transmission=new Transmission(airplane.transmission);
        this.photo=airplane.photo;
        
    }
    public String toString(){
        return "Avion\nId: "+id+" Brand: "+" Model: "+model+" An de fabricatie: "+year+" Culoare: "+color+" Pret: "+price+" Greutate(in tone): "+weight+" Cicluri de motor: "+engineCycles+" Motor: "+engine+" Detalii de Transmisie: "+transmission+" Poza: "+(photo!=null? " Imagine Disponibila":" Nu exista imagine");
    }
    public int getId() { 
        return id; 
    }
    
    public String getBrand() { 
        return brand; 
    }
    public String getModel() { 
        return model; 
    }
    
    public int getYear() { 
        return year; 
    }
    
    public Color getColor() { 
        return color; 
    }
    
    public int getPrice() { 
        return (int) price; 
    }
    
    public int getWeight() { 
        return weight; 
    }
    
     public int getEngineCycles() { 
         return engineCycles; 
     }
     
    public Engine getEngine() {
        return engine;
    }
    
    public Transmission getTransmission() {
        return transmission;
    }
    
   
    public void setId(int id) { 
        this.id = id; 
    }

    public void setBrand(String brand) { 
        this.brand = brand; 
    }     
    
    public void setModel(String model) { 
        this.model = model; 
    }
    
    public void setYear(int year) { 
        this.year = year; 
    }
    
    public void setColor(Color color) { 
        this.color = color; 
    }
    
    public void setPrice(double price) { 
        this.price = price; 
    } 
    
    public void setWeight(short weight) { 
        this.weight = weight; 
    }
    
    public void setEngineCycles(int engineCycles) { 
        this.engineCycles = engineCycles; 
    }
 
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    
    public Transmission getTransmission(Transmission transmission) {
        this.transmission = transmission;
    }   
    
}
