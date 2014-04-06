
/**
 * Write a description of class OneLb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OneLb extends BurgerDecorator
{
    // instance variables - replace the example below with your own
    public OneLb(Burger b){
        super(b);
    }
    
     public double getCost(){
        return super.getCost()+ 15.50;
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
