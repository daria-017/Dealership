
package proiectjava.dealershippoo;

/**
 *
 * @author Raul
 */

import javax.swing.ImageIcon;
import java.awt.Color;

public class Jetski extends WaterVehicles{
    int id;
    String brand;
    String model;
    int year;
    Color color;
    int price;
    int weight;
    int nauticalMiles;
    Engine engine;
    //Transmission transmission;
    ImageIcon photo;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getNauticalMiles() {
        return nauticalMiles;
    }

    public void setNauticalMiles(int nauticalMiles) {
        this.nauticalMiles = nauticalMiles;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public ImageIcon getPhoto() {
        return photo;
    }

    public void setPhoto(ImageIcon photo) {
        this.photo = photo;
    }
    
    

    Jetski(int id,String brand,String model,int year,Color color,int price,int weight,int nauticalMiles,Engine engine,ImageIcon photo){
        //trans needed
        this.id=id;
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.color=color;
        this.price=price;
        this.weight=weight;
        this.nauticalMiles=nauticalMiles;
        this.engine=engine;
        
        this.photo=photo;
    }
    
        Jetski(){
        this(0,"","",0,null,0,0,0,new Engine("",0,0,""),new ImageIcon());//tansmission needed
    }
        
        
    Jetski(Jetski copy){
        this.id=copy.id;
        this.brand=copy.brand;
        this.model=copy.model;
        this.year=copy.year;
        this.color=copy.color;
        this.price=copy.price;
        this.weight=copy.weight;
        this.nauticalMiles=copy.nauticalMiles;
        this.engine=copy.engine;
        
        this.photo=copy.photo;
    }

    @Override
    public String toString() {
        return "Jetski{" + "id=" + id + ", brand=" + brand + ", model=" + model + ", year=" + year + ", color=" + color + ", price=" + price + ", weight=" + weight + ", nauticalMiles=" + nauticalMiles + ", engine=" + engine + ", photo=" + photo + '}';
    }
    
}
