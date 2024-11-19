/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proiectjava.dealershippoo;

// Import packages:
import java.awt.Color;
import javax.swing.ImageIcon;

public class Motorcycle extends LandVehicles{
	// Parameters:
	int id, year, price, weight, mileage;
	String brand, model;
	Color color;
	Engine engine;
	Transmission transmission;
	ImageIcon photo;
	
	// Implicit constructor:
	public Motorcycle() {
		this(0, 0, 0, 0, 0, "", "", null, null, null, null);
	}
	
	// Explicit constructor:
	public Motorcycle(int id, int year, int price, int weight, int mileage, String brand, String model, Color color, Engine engine, Transmission transmission, ImageIcon photo) {
	this.id = id;
	this.year = year;
	this.price = price;
	this.weight = weight;
	this.mileage = mileage;
	this.brand = brand;
	this.model = model;
	this.color = color;
	this.engine = engine;
	this.transmission = transmission;
	this.photo = photo;
	}
	
	// Copying constructor:
	public Motorcycle(Motorcycle motorcycle) {
		this(motorcycle.id, motorcycle.year, motorcycle.price, motorcycle.weight, motorcycle.mileage, motorcycle.brand, motorcycle.model, motorcycle.color, motorcycle.engine, motorcycle.transmission, motorcycle.photo);
	}
	
	// Setters:
	void setId(int id) {
		this.id = id;
	}
	
	void setYear(int year) {
		this.year = year;
	}
	
	void setPrice(int price) {
		this.price = price;
	}
	
	void setWeight(int weight) {
		this.weight = weight;
	}
	
	void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	void setBrand(String brand) {
		this.brand = brand;
	}
	
	void setModel(String model) {
		this.model = model;
	}
	
	void setColor(Color color) {
		this.color = color;
	}
	
	void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}
	
	void setPhoto(ImageIcon photo) {
		this.photo = photo;
	}
	
	// Getters:
	int getId() {
		return this.id;
	}
	
	int getYear() {
		return this.year;
	}
	
	int getPrice() {
		return this.price;
	}
	
	int getWeight() {
		return this.weight;
	}
	
	int getMileage() {
		return this.mileage;
	}
	
	String getBrand() {
		return this.brand;
	}
	
	String getModel() {
		return this.model;
	}
	
	Color getColor() {
		return this.color;
	}
	
	Engine getEngine() {
		return this.engine;
	}
	
	Transmission getTransmission() {
		return this.transmission;
	}
	
	ImageIcon getPhoto() {
		return this.photo;
	}
	
	// toString() method:
	public String toString() {
		return "Id: " + this.id + ", Year: " + this.year + ", Price: " + this.price + ", Weight: " + this.weight + ", Mileage: " + this.mileage + ", Brand: " + this.brand + ", Model: " + this.model + " Color: " + this.color + ", Engine: " + this.engine + ", Transmission: " + this.transmission + ", Photo: " + this.photo;
	}
}