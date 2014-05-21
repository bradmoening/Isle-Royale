import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class IsleRoyal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IsleRoyal extends World
{

    Moose[] theHerd = new Moose[50];
    
    
    /**
     * Constructor for objects of class IsleRoyal.
     * 
     */
    public IsleRoyal()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 572, 1); 
        
        addObject(new AdvanceOneDay(),100,50);
        
        for (int i = 0; i<50; i++)
        {
            int x = Greenfoot.getRandomNumber(800);
            int y = Greenfoot.getRandomNumber(300)+150;
            int age = Greenfoot.getRandomNumber(21)+1;
            int health = Greenfoot.getRandomNumber(10);
     
            Moose aMoose = new Moose(age,health,1,true);
            theHerd[i] = aMoose;
            addObject(aMoose,x,y);
            
        }
        for (int i = 0; i<2; i++)
        {
            int x = Greenfoot.getRandomNumber(800);
            int y = Greenfoot.getRandomNumber(300)+150;
            int number = Greenfoot.getRandomNumber(8)+3;
            int health = Greenfoot.getRandomNumber(10);
     
            WolfPack aPack = new WolfPack(number,health);
            addObject(aPack,x,y);
            
        }
        
        
        
    }
    
    public void advanceOneDay()
    {
        for (int i=0;i<50;i++)
        {
            if (theHerd[i].alive)    theHerd[i].browse();
            if (theHerd[i].alive)    theHerd[i].randomDisease();
        }
        
        
        
    }
    
    public int distanceBetweenMooseAndPack(Moose m, WolfPack w)
    {
       int wolfX = w.getX();
       int wolfY = w.getY();
       int mooseX = m.getX();
       int mooseY = m.getY();
       //finish next time
     return 5;   
    }
    
    
    
    
    
    
    
    
    
}
