import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class AdvanceOneDay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AdvanceOneDay extends Actor
{
    
    public AdvanceOneDay()
    {
               setImage(new GreenfootImage("One Day", 36,Color.red,Color.blue)); 
    }
    
    
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            IsleRoyal theWorld = (IsleRoyal)getWorld();
            
            theWorld.advanceOneDay();
            
            
        }
        
        //setImage(new GreenfootImage("One Day", 36,Color.red,Color.blue));
    }    
}
