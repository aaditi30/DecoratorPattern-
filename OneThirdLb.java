
/**
 * Write a description of class OneThirdLb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OneThirdLb extends BurgerDecorator
{
    // instance variables - replace the example below with your own
    public OneThirdLb(Burger b){
        super(b);
    }
    
     public double getCost(){
        return super.getCost()+ 9.50;
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
