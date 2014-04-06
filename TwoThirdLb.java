
/**
 * Write a description of class TwoThirdLb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TwoThirdLb extends BurgerDecorator
{
    // instance variables - replace the example below with your own
    public TwoThirdLb(Burger b){
        super(b);
    }
    
     public double getCost(){
        return super.getCost()+ 11.50;
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
