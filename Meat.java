
/**
 * Write a description of class Meat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Meat extends BurgerDecorator
{
    // instance variables - replace the example below with your own
    
    public Meat(Burger b){
        super(b);
    }
    
    public double getCost()
    {
       return super.getCost()+0;
    }
    
    public int toppingCounter(){
        return super.toppingCounter();
    }
    
    public int sauceCounter(){
        return super.sauceCounter();
    }
    public int cheeseCounter(){
        return super.cheeseCounter();
    }
    
    
   
    }
