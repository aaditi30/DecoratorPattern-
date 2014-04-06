
/**
 * Write a description of class Sauce here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sauce extends BurgerDecorator
{
    // instance variables - replace the example below with your own
    public Sauce(Burger b){
        super(b);
    }
    
    public double getCost(){
        int counter=sauceCounter();
        //counter++;
        if(counter>1){
        return super.getCost()+ 0.75;
       }else{
           return super.getCost()+0;
        }
        
    }
    
     public int toppingCounter(){
        return super.toppingCounter();
    }
    
    public int sauceCounter(){
        return super.sauceCounter()+1;
    }
    public int cheeseCounter(){
        return super.cheeseCounter();
    }
}
