
/**
 * Abstract class BurgerDecorator - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class BurgerDecorator implements Burger
{
    // instance variables - replace the example below with your own
    protected Burger burgerDecorator;
    
    public BurgerDecorator(Burger burger){
        this.burgerDecorator=burger;
    }
    
    
    public double getCost(){
       return burgerDecorator.getCost();
    }
    
    public int toppingCounter(){
        return burgerDecorator.toppingCounter();
    }
    public int sauceCounter(){
        return burgerDecorator.sauceCounter();
        
    }
    public int cheeseCounter(){
        return burgerDecorator.cheeseCounter();
    }
    
}
