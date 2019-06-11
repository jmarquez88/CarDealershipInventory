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
public class Interior {
    private String color1;
    private String color2;
    private boolean hasSunRoof;
    private boolean hasMoonRoof;
    private boolean hasPanoramicView;

    public Interior(String color1, String color2, boolean hasSunRoof, boolean hasMoonRoof, boolean hasPanoramicView) {
        this.color1 = color1;
        this.color2 = color2;
        this.hasSunRoof = hasSunRoof;
        this.hasMoonRoof = hasMoonRoof;
        this.hasPanoramicView = hasPanoramicView;
        
    }
    
    public String getColor1(){return color1;}
    public String getColor2(){return color2;}
    public boolean getSunRoof(){return hasSunRoof;}
    public boolean getMoonRoof(){return hasMoonRoof;}
    public boolean getPanoramicView(){return hasPanoramicView;}
    
    public String toString()
    {
        
        return "Color 1 " + color1 + " " + "Color 2 " + color2 + " " + "Has moon roof " + hasMoonRoof + " " + "Has sun roof " + hasSunRoof + " ";
    }
}

