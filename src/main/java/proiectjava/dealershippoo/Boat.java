package proiectjava.dealershippoo;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Dragos :>
 */
public class Boat {

    int id;
    String brand;
    String model;
    int year;
    Color color;
    int price;
    int weight;
    int nauticalMiles;
    // Engine engine;
    // Transmission transmission;
    ImageIcon photo;

    Boat() {
        id = 0;
        brand = "<gol>";
        model = "<gol>";
        year = 0;
        color = Color.black;
        price = 0;
        weight = 0;
        nauticalMiles = 0;
        // engine = new Engine(...);
        // transmission = new Transmission(...);
        photo = new ImageIcon("no-image.png");
    }

    Boat(int id, String brand, String model, int year, Color color, int price,
            int weight, int nauticalMiles, String photo) // Engine engine;
    // Transmission transmission;
    {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.nauticalMiles = nauticalMiles;
        // this.engine = new Engine(engine);
        // this.transmission = new Transmission(transmisson);
        this.photo = new ImageIcon(photo);
    }

    Boat(Boat boat) {
        this.id = boat.id;
        this.brand = boat.brand;
        this.model = boat.model;
        this.year = boat.year;
        this.color = boat.color;
        this.price = boat.price;
        this.weight = boat.weight;
        this.nauticalMiles = boat.nauticalMiles;
        // this.engine = new Engine(boat.engine);
        // this.transmission = new Transmission(boat.transmisson);
        this.photo = new ImageIcon(boat.photo.getImage());
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nBrand: " + brand + "\nModel: " + model + 
                "\nAn: " + year + "\nCuloare: " + color.toString() + 
                "\nPret: " + price + "\nGreutate: " + weight + 
                "\nMile Nautice: " + nauticalMiles + "\nImagine: " + photo.toString();
    }

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
    
    // Get/Set pentru Engine/Transmission << FOARTE IMPORTANT!!! NU UITA!!!

    public ImageIcon getPhoto() {
        return photo;
    }

    public void setPhoto(ImageIcon photo) {
        this.photo = photo;
    }

    public static void main(String[] args) {
        Boat b1 = new Boat(7, "Barca Sigma", "SGM-69", 2024, Color.magenta, 96, 19995, 1234, "boat.png");

        System.out.println(b1);
    }
}
