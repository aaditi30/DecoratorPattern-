
/**
 * Write a description of class Order here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Order
{
    // instance variables - replace the example below with your own
    public static void main(String args[])
    {
 
        Burger burger=new BurgerBun();
        System.out.println("Cost is" +burger.getCost());
        
        burger=new Meat(burger);
        System.out.println("Cost is" +burger.getCost());
        
        burger=new OneLb(burger);
        System.out.println("Cost is" +burger.getCost());
                        
        burger=new PremiumToppings(burger);
        System.out.println("Cost is" +burger.getCost());
        
        burger=new Topping(burger);
        System.out.println("Cost is" +burger.getCost());

        burger=new Topping(burger);
        System.out.println("Cost is" +burger.getCost());
        
        burger=new Topping(burger);
        System.out.println("Cost is" +burger.getCost());
        
        burger=new Topping(burger);
        System.out.println("Cost is" +burger.getCost());
        
        burger=new Topping(burger);
        System.out.println("Cost is" +burger.getCost());
        
        burger=new Sauce(burger);
        System.out.println("Cost is" +burger.getCost());

        burger=new Sauce(burger);
        System.out.println("Cost is" +burger.getCost());
        
        burger= new Cheese(burger);
        System.out.println("Cost is" +burger.getCost());
        
         burger= new Cheese(burger);
        System.out.println("Cost is" +burger.getCost());
        
        
      
        //iburger burger=new iburger(new ToppingsDecorator(new CheeseDecorator(onbun)));
    }
}
