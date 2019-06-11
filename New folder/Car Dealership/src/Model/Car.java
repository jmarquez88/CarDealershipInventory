/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
/**
 *
 * @author msalehan
 */
public class Car {
    private String make;
    private int year;
    private String model;
    private int price;
    private String color; 
    private CarType type;
    private Engine engine; 
    private Interior interior;
    private Trunk trunk; 
    private int miles;
    
    public Car (String make, int year, String model, int price,
            String color, CarType type){
        this.make = make;
        this.year = year;
        this.model = model;
        this.price = price;
        this.color = color;
        this.miles = miles;
        this.type = type;
        
        
    }
    public Car (String make, int year, String model, int price,
            String color, int miles, CarType type, Engine engine,
            Interior interior, Trunk trunk){
         this.make = make;
        this.year = year;
        this.model = model;
        this.price = price;
        this.color = color;
        this.miles = miles;
        this.type = type;
        this.interior = interior;
        this.engine = engine;
        this.trunk = trunk;
    }

    
    public String getMake(){
        return make;
    }
    
    public Engine getEngine(){
        return engine;
    }
    public void SetEngine(Engine engine){
        this.engine = engine;
    }
    public void SetInterior(Interior interior){
        this.interior = interior;
        
    }
    public void SetTrunk(Trunk trunk){
        this.trunk = trunk;
    }
    
    public String OpenTrunk(){return null;}
    public String CheckEngine(){
        return null;
    }
    public String CheckInterior(){return null;}
    public String ShowOptions(){return null;}
    public String toString(){
        return  color + " " + year + " " + make + " " +
                model + " " + "For " + "$" + price;
        
    }
    public String CompareTo (Car otherCar){
        return null;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public CarType getType() {
        return type;
    }
    public Interior getInterior(){
        return interior;
    }
    public Trunk getTrunk(){
        return trunk;
    }
   
}
