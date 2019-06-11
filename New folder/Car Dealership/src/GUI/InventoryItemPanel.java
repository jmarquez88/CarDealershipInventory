/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Model.Car;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author msalehan
 */
public class InventoryItemPanel extends JPanel{
    
     JLabel label = new JLabel("Lexus");
        Button button = new Button("View More Details");
    
    Car car;
    ArrayList<Car> cars;
    
    public InventoryItemPanel(ArrayList<Car> cars, Car car, MainFormWithPanel mPanel) throws IOException{
       
        
        button.addActionListener(new java.awt.event.ActionListener()                                                                    {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewCarForm Cform = new ViewCarForm(cars, car);
                mPanel.setVisible(false);
                Cform.setVisible(true);
                
            }
        });
        
        BufferedImage myPicture;
        
        try {
                     myPicture = ImageIO.read(new File(".\\src\\images\\" + car.getMake() + car.getModel() + ".jpg"));

        } catch (Exception e) {
                     myPicture = ImageIO.read(new File(".\\src\\images\\" + "notfound.jpg"));

        }
        
        ImageIcon imageIcon = new ImageIcon(myPicture.getScaledInstance(100, 100, java.awt.Image.SCALE_DEFAULT));
        JLabel picLabel = new JLabel(imageIcon);
        add(picLabel);
        setLayout(new GridLayout(3,1));
        label.setText("<html>" + car.getYear() + " " + car.getMake() + " " + car.getModel()  + "<br/>100 miles" + "<br/>$" + car.getPrice() + "</html>");
        this.cars = cars;
        this.car = car;
        
        
        
        add(label);
        add(button);
        
     
    }
}
