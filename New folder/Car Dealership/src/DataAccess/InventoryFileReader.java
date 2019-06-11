/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import Model.Car;
import Model.CarType;
import Model.Engine;
import Model.FuelType;
import Model.Interior;
import Model.Trunk;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.paint.Color;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;
import org.w3c.dom.*;

/**
 *
 * @author msalehan
 */
public class InventoryFileReader {

    XMLStreamWriter writer;
    public InventoryFileReader() {
        //getAllCars();
    }

    public void addCar(ArrayList<Car> cars, Car car) {
        //get list of all cars
        //add car to the list
        cars.add(car);
        //rewrite the file using the list
        saveInventory(cars);

    }

    public void removeCar(ArrayList<Car> cars, Car car) {
         //get list of all cars
        //remove car from the list
        cars.remove(car);
        //rewrite the file using the list
        saveInventory(cars);
    }
    public void saveInventory(ArrayList<Car> cars) {
        try {
            FileWriter fileWriter = new FileWriter("Inventory.xml");
            XMLOutputFactory factory = XMLOutputFactory.newInstance();

            writer = factory.createXMLStreamWriter(fileWriter);

            writer.writeStartDocument("1.0");
            writer.writeComment("Car inventory");
            writer.writeStartElement("Inventory");
            for (Car car: cars) {
                writer.writeStartElement("Car");
                
                writeElement("make", car.getMake());
                writeElement("model", car.getModel());
                writeElement("year", car.getYear()+"");
                writeElement("price", car.getPrice()+"");
                writeElement("color", car.getColor());
                writeElement("type", car.getType()+"");
                
                //Write Engine
                writeEngine(car.getEngine());
                writeInterior(car.getInterior());
                writeTrunk(car.getTrunk());
                
               
                writer.writeEndElement(); // for the Car element
            }
            writer.writeEndElement();     // for the Inventory element
            //writer.flush();
            writer.close();
        } catch (XMLStreamException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void writeElement(String name, String innerText) throws XMLStreamException {
        writer.writeStartElement(name);
        writer.writeCharacters(innerText);
        writer.writeEndElement();
    }
    
    private void writeIntElement(String name, int value) throws XMLStreamException{
        writeElement(name, value+"");
    }
    private void writeFuelTypeElement(String name, FuelType type)throws XMLStreamException{
        writeElement(name, type+"");
    }
    private void writeFloatElement(String name, Float MPG)throws XMLStreamException{
        writeElement(name, MPG+"");
    }
    private void writeBooleanElement(String name, Boolean value)throws XMLStreamException{
        writeElement(name, value+"");
    }

    public ArrayList<Car> getAllCars() {
        ArrayList<Car> cars = new ArrayList<>();
        Document docsDoc = null;
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            File file = new File("Inventory.xml");
            docsDoc = db.parse(file);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.xml.sax.SAXException ex) {
            ex.printStackTrace();
        }
//retrieve document elements
        NodeList carNodes = docsDoc.getElementsByTagName("Car");
        for (int i = 0; i < carNodes.getLength(); i++) {
            {
                Element CarElement = (Element) carNodes.item(i);
                String make = getSubElementText(CarElement, "make");
                String model = getSubElementText(CarElement, "model");
                int year = Integer.parseInt(getSubElementText(CarElement, "year"));
                int price = Integer.parseInt(getSubElementText(CarElement, "price"));
                String color = getSubElementText(CarElement, "color");
                String type = getSubElementText(CarElement, "type");
                String typeString
                        = getSubElementText(CarElement, "type");
                
                CarType cartype = CarType.valueOf(typeString);
                //TODO: read the rest of car attributes
                Car car = new Car(make, year, model, price, color, CarType.valueOf(type));
                Engine engine = getEngine(
                        getSubElement(CarElement, "Engine"));
                car.SetEngine(engine);
                
                
                Interior interior = getInterior(getSubElement(CarElement, "Interior"));
                car.SetInterior(interior);
                
                Trunk trunk = getTrunk(getSubElement(CarElement, "Trunk"));
                car.SetTrunk(trunk);
                //TODO: load engine, interior and trunk attributes, 
                //create the corresponding objects, and add them to the car object
                cars.add(car);
            }
        }
        return cars;
    }

    private String getSubElementText(Element parent, String subElementName) {
        Element subElement = getSubElement(parent, subElementName);
        return subElement.getTextContent();
    }

    private Element getSubElement(Element parent, String subElementName) {
        return (Element) parent.getElementsByTagName(subElementName).item(0);
    }

    private Engine getEngine(Element engineElement) {
        String engineString = getSubElementText(engineElement, "FuelType");
        FuelType fuelType = FuelType.valueOf( engineString);
        String cylindersText = getSubElementText(engineElement, "Cylinders");
        int cylinders = Integer.parseInt(cylindersText);
        String capacityText = getSubElementText(engineElement, "Capacity");
        int capacity = Integer.parseInt(capacityText);
        String horsePowerText = getSubElementText(engineElement, "HorsePower");
        int horsePower = Integer.parseInt(horsePowerText); 
        String mpgText = getSubElementText(engineElement, "MPG");
        float mpg = Float.parseFloat(mpgText);
        return new Engine(fuelType, cylinders, capacity, horsePower, mpg);
    }
    private Interior getInterior(Element interiorElement){
        String interiorString = getSubElementText(interiorElement, "Color1");
        String color1 = interiorString;
        interiorString = getSubElementText(interiorElement, "Color2");
        String color2 = interiorString;
        interiorString = getSubElementText(interiorElement, "SunRoof");
        boolean hasSunRoof = Boolean.valueOf(interiorString);
        interiorString = getSubElementText(interiorElement, "MoonRoof");
        boolean hasMoonRoof = Boolean.valueOf(interiorString);
        interiorString = getSubElementText(interiorElement, "PanoramicView");
        boolean hasPanoramicView = Boolean.valueOf(interiorString);
        return new Interior(color1, color2, hasSunRoof, hasMoonRoof, hasPanoramicView);
    }
    private Trunk getTrunk(Element trunkElement){
        String trunkString = getSubElementText(trunkElement, "SpareTire");
        String hasSpareTire = trunkString;
        trunkString = getSubElementText(trunkElement, "FirstAidKit");
        String hasFirstAidKit = trunkString;
        trunkString = getSubElementText(trunkElement, "Carpet");
        String hasCarpet = trunkString;
        trunkString = getSubElementText(trunkElement, "Jack");
        String hasJack = trunkString;
        return new Trunk(Boolean.valueOf(hasSpareTire), Boolean.valueOf(hasFirstAidKit), Boolean.valueOf(hasCarpet), Boolean.valueOf(hasJack));
        
    }

    private void writeEngine(Engine engine) throws XMLStreamException {
        writer.writeStartElement("Engine");
        writeFuelTypeElement("FuelType", engine.getFuelType());
        writeIntElement("Cylinders", engine.getNoOfCylinders());
        writeIntElement("Capacity", engine.getCapacity());
        writeIntElement("HorsePower", engine.getHorsePower());
        writeFloatElement("MPG", engine.getMpg());
        
        writer.writeEndElement();
    }
    private void writeInterior(Interior interior)throws XMLStreamException{
        writer.writeStartElement("Interior");
        writeElement("Color1", interior.getColor1());
        writeElement("Color2", interior.getColor2());
        writeBooleanElement("SunRoof", interior.getSunRoof());
        writeBooleanElement("MoonRoof", interior.getMoonRoof());
        writeBooleanElement("PanoramicView", interior.getPanoramicView());
        writer.writeEndElement();
        
    }
    private void writeTrunk(Trunk trunk)throws XMLStreamException{
        writer.writeStartElement("Trunk");
        writeBooleanElement("SpareTire", trunk.getSpareTire());
        writeBooleanElement("FirstAidKit", trunk.getFirstAidKit());
        writeBooleanElement("Carpet", trunk.getCarpet());
        writeBooleanElement("Jack", trunk.getJack());
        writer.writeEndElement();
    }

}
