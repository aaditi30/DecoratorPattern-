
/**
 * Write a description of class Topping here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Topping extends BurgerDecorator
{
    // instance variables - replace the example below with your own
    public Topping(Burger b){
        super(b);        
    }
    
    public double getCost(){
        int counter=toppingCounter();
        //counter++;
        //System.out.println("topping counter is" +counter);
        if(counter>4){          
        return super.getCost()+1;
        }else{
        return super.getCost()+0;
        }
    }
    
     public int toppingCounter(){
        return super.toppingCounter()+1;
    }
    
    public int sauceCounter(){
        return super.sauceCounter();
    }
    public int cheeseCounter(){
        return super.cheeseCounter();
    }
}
