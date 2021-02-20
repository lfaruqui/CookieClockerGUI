public class Player
{
   private double cookies;                                     //Double for number of cookies
   private int time;                                           //Integer for the time
   private double bonus;                                       //Double for the bonus, or cookies/sec

   public void setTime()                                       //Method to increment time
   {
       time++;
   }

   public int getCookies()                                    //Method to return number of cookies
   {
       return (int)cookies;
   }

   public void setCookies(double addition)                   //Method to increment cookies
   {
       cookies += addition;
   }

   public void buy(int cost)                               //Method for when helper is bought, subtracts from cookies
   {
       cookies -= cost;
   }

   public void sell(int cost)                            //Method for when helper is sold, adds amount to cookies
   {
       cookies+= cost;
   }

   public double getBonus()                            //Method to return bonus, or cookies/sec
   {
       return bonus;
   }

   public void setBonus(double powerUp)               //Method to increment the bonus, when new helper is bought
   {
       bonus += powerUp;
   }
}



