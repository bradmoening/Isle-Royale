import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class DisplayStats extends Actor
{
    int mooseCount=50;
    
    public DisplayStats()
    {
      setImage(new GreenfootImage("# of Moose ="+mooseCount, 36,Color.red,Color.blue)); 
    }
    
    public void act() 
    {
        mooseCount=0;
        IsleRoyal theWorld = (IsleRoyal)getWorld();
        
        for (int i=0;i<50;i++)
        {
        if (theWorld.theHerd[i].alive) mooseCount++;
        }
        
        setImage(new GreenfootImage("# of Moose ="+mooseCount, 36,Color.red,Color.blue)); 
    }    
}
