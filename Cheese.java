
/**
 * Write a description of class Cheese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cheese extends BurgerDecorator
{
    // instance variables - replace the example below with your own
    public Cheese(Burger b){
        super(b);
    }
   
     public double getCost(){
         int counter=cheeseCounter();
         //counter++;
         if(counter>1){
        return super.getCost()+ 1;
        }else{
            return super.getCost()+0;
        }
    }
    
     public int toppingCounter(){
        return super.toppingCounter();
    }
    
    public int sauceCounter(){
        return super.sauceCounter();
    }
    public int cheeseCounter(){
        return super.cheeseCounter()+1;
    }
}
