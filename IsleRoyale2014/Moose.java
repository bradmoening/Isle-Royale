import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Moose here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Moose extends Actor
{
    int age, health, gender;    //this are global to the Moose
    boolean alive;
    GreenfootImage moose = getImage();
    GreenfootImage deadMoose = new GreenfootImage("deadmoose.png");
    
    
    public Moose(int a, int h, int g, boolean al)  //this is a constructor - this makes a moose
    {
        age = a;
        health = h;
        gender = g;
        alive = al;
        moose.scale(age*3,age*3);
        deadMoose.scale(age*3,age*3);
        
    }
    
    public void browse()
    {
        int x = getX();
        int y = getY();
        x = x + Greenfoot.getRandomNumber(25)-12;
        y = y + Greenfoot.getRandomNumber(25)-12;
        
        setLocation(x,y);
    }
    
    public void randomDisease()
    {
        int death = Greenfoot.getRandomNumber(365*15);
        if (death ==666) alive = false;
        if (death ==666) setImage(deadMoose);
    }
    
    
    public void act() 
    {
        // Add your action code here.
       // if(alive) browse();
        //randomDisease();
    }    
}
