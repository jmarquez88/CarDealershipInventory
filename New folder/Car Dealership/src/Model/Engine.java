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
public class Engine {
    private FuelType fuelType;
    private int noOfCylinders;
    private int capacity;
    private int horsePower;
    private float mpg;
    public Engine (FuelType fuelType, int noOfCylinders, int capacity, int horsePower, float mpg){
        this.fuelType = fuelType;
        this.noOfCylinders = noOfCylinders;
        this.capacity = capacity;
        this.horsePower = horsePower;
        this.mpg = mpg;
        
    }
    public int getHorsePower () {return horsePower;}
    public float getMpg(){ return mpg;}
    public FuelType getFuelType(){ return fuelType;}
    public int getCapacity() {return capacity;}
    public int getNoOfCylinders(){ return noOfCylinders;}
    public String toString(){
        //TODO
        return "Uses " +  fuelType + ", " + noOfCylinders +" cylinders" + ", " + capacity + " cc" + ", " + horsePower + " hp" + ", " + mpg + " average mpg.";
    }
    
}
