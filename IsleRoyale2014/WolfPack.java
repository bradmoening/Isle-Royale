import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WolfPack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WolfPack extends Actor
{
    int number,health;
    
    public WolfPack(int n, int h)
    {
        number = n;
        health = h;
    }
    
    public void hunt()
    {
      int x = getX();
        int y = getY();
        x = x + Greenfoot.getRandomNumber(125)-62;
        y = y + Greenfoot.getRandomNumber(125)-62;
        
        setLocation(x,y);  
    }
    
    public void act() 
    {
        hunt();
    }    
}
