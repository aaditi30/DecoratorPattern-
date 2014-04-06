
/**
 * Write a description of class Bowl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bowl extends BurgerDecorator
{
    // instance variables - replace the example below with your own
    public Bowl(Burger b){
        super(b);
    }
        
     public double getCost(){
        return super.getCost()+ 1;
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
