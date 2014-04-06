
/**
 * Write a description of class PremiumToppings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PremiumToppings extends BurgerDecorator
{
    public PremiumToppings(Burger b){
        super(b);        
    }
    
     public double getCost(){
        return super.getCost()+ 1.50;
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
