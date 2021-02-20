public class Building
{
   private double cost;                                               //Double for cost of each building
   private int amount;                                                //Integer for number of buildings owned
   private final int BASECOST;                                        //Constant integer for base cost of each building
   private int sellVal;                                               //Integer for the selling value of each building

   public Building(int newCost, int newAmount) {                     //Filled constructor for a new building
       cost = newCost;
       amount = newAmount;
       BASECOST = newCost;
   }

   public int getCost() {                                           //Method to return the cost
       return (int) cost;
   }

   public int getAmount() {                                        //Method to return the amount
       return amount;
   }

   public int getSellVal() {                                      //Method to return the selling value
       return sellVal;
   }

   public void invest() {                                        //Method for when a building is bought, counts amount and calculates new price
       amount++;
       cost = BASECOST * Math.pow(1.15, amount);
   }

   public void sold() {                                        //Method for when helper/building is sold
       if (sellVal >= 1)                                       //If the value drops below 1, keep it at 1
       {
           sellVal = 1;
       }
       sellVal = (int) (cost * 0.2875);                        //Calculates current sell value
       cost = cost - sellVal;                                  //Calculates current cost by subtracting sell value
       amount--;                                               //Decrements amount
   }
}


