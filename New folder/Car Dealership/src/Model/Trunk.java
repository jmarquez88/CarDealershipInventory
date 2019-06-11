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
public class Trunk {
    private boolean hasSpareTire;
    private boolean hasFirstAidKit;
    private boolean hasCarpet;
    private boolean hasJack;
    
    public Trunk (boolean hasSpareTire, boolean hasFirstAidKit, boolean hasCarpet, boolean hasJack){
        this.hasSpareTire = hasSpareTire;
        this.hasFirstAidKit = hasFirstAidKit;
        this.hasCarpet = hasCarpet;
        this.hasJack = hasJack;
    }
    
    public boolean getSpareTire(){return hasSpareTire;}
    public boolean getFirstAidKit(){return hasFirstAidKit;}
    public boolean getCarpet(){return hasCarpet;}
    public boolean getJack(){return hasJack;}
}
