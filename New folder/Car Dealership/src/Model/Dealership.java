/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author msalehan
 */
public class Dealership {
    private ArrayList<Car> cars;
    private Car selectedCar = null;
    
    public Dealership(){
        
    }
    
    public String ListAllCars(){
        return "";
    }
    public String SelectCar (int index){
        return "";
    }
    public String OpenTrunk(){return null;}
    public String CheckEngine(){
       return selectedCar.CheckEngine();
    }
    public String CheckInterior(){return null;}
    public String Compare (int firstCarIndex, int secondCarIndex){
        return "" ;}
    public String ShowOptions(){return null;}

    public String addCar(int year, String make, String model, int price, String color, CarType carType) {
        return "";}
}
