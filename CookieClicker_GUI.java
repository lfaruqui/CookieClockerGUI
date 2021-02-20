import java.awt.event.*;                                                
import javax.swing.*;                                               
import java.awt.*;
import javax.swing.Timer;

public class CookieClicker_GUI extends JFrame
{
   private Building helper = new Building(15, 0);                      //New building object for the cursor helper
   private Building grandma = new Building(100,0);                     //New building object for grandmas
   private Building farm = new Building(1100,0);                       //New building object for farms
   private Building mine = new Building(12000,0);                      //New building object for mines
   private Player player1 = new Player();                                                  //New player object for the game
   private boolean selling= false;                                                         //Boolean for when selling helpers

   private javax.swing.JButton cookieButton;
   private javax.swing.JButton cursorButton;
   private javax.swing.JLabel minesCostLabel;
   private javax.swing.JLabel minesLabel;
   private javax.swing.JButton mineButton;
   private javax.swing.JButton farmButton;
   private javax.swing.JLabel farmsCostLabel;
   private javax.swing.JLabel farmsLabel;
   private javax.swing.JButton grandmaButton;
   private javax.swing.JLabel grandmaCostLabel;
   private javax.swing.JLabel grandmaLabel;
   private javax.swing.JLabel helperCostLabel;
   private javax.swing.JLabel helperLabel;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JLabel jLabel7;
   private javax.swing.JLabel jLabel8;
   private javax.swing.JLabel jLabel9;
   private javax.swing.JLabel numberOfCookiesLabel;
   private javax.swing.JLabel rateLabel;                                       //Label for cookies/sec
   private javax.swing.JLabel rateValue;                                       //Label to display actual cookies/sec rate
   private javax.swing.JButton noSellButton;                                   //Button to stop selling
   private javax.swing.JButton sellButton;                                     //Button to sell helpers

   public CookieClicker_GUI()
   {
       createUserInterface();
       cookieUpdater();
   }

   public void cookieUpdater()
   {
       ActionListener listener = new ActionListener()
       {
           public void actionPerformed(ActionEvent event)
           {
               player1.setTime();                                                      //Starts time for the player
               player1.setCookies(player1.getBonus());                                 //Updates cookies based on helper bonus
               numberOfCookiesLabel.setText(Integer.toString(player1.getCookies()));   //Displays number of cookies
               double bonus = player1.getBonus();                                      //Double for the cookies per sec
               rateValue.setText(String.format("%.2f",bonus));                         //Displays and formats cookies per sec
           }
       };
       Timer displayTimer = new Timer(1000, listener);
       displayTimer.start();
   }

   public void createUserInterface()                                      //Method to set up user interface
   {
       setTitle("Cookie Clicker");                                        //Sets title for the content pane
       Container contentPane = getContentPane();                          //Creates new content pane for the program
       contentPane.setLayout(null);                                       //Layout is null so layout can be defined by components

       numberOfCookiesLabel = new javax.swing.JLabel();                        //Initializes label
       numberOfCookiesLabel.setBounds(70,0,500,30);        //Sets location and size
       numberOfCookiesLabel.setText("0");                                      //Sets starting text
       contentPane.add(numberOfCookiesLabel);                                  //Adds component to the content pane

       jLabel1 = new javax.swing.JLabel();                                     //Initializes label
       jLabel1.setBounds(10,10,100,10);                   //Sets location and size
       jLabel1.setText("Cookies:");
       contentPane.add(jLabel1);

       jLabel2 = new javax.swing.JLabel();                                    //Initializes label
       jLabel2.setText("Number of Helpers:");                                //Sets text
       jLabel2.setBounds(300,30,150,13);                //Sets location and size
       contentPane.add(jLabel2);                                            //Adds to content pane

       helperLabel = new javax.swing.JLabel();                                //Initializes label
       helperLabel.setText("0");                                             //Sets text
       helperLabel.setBounds(415,30,70,10);             //Sets location and size
       contentPane.add(helperLabel);                                        //Adds to content pane

       jLabel4 = new javax.swing.JLabel();                                    //Initializes label
       jLabel4.setText("Number of Grandmas:");                               //Sets text
       jLabel4.setBounds(300,100,150,10);               //Sets location and size
       contentPane.add(jLabel4);                                             //Adds to content pane

       grandmaLabel = new javax.swing.JLabel();                               //Initializes label
       grandmaLabel.setText("0");                                             //Sets text
       grandmaLabel.setBounds(430,100,100,10);           //Sets location and size
       contentPane.add(grandmaLabel);                                         //Adds to content pane

       jLabel6 = new javax.swing.JLabel();                                   //Initializes label
       jLabel6.setText("Number of Farms:");                                  //Sets text
       jLabel6.setBounds(299,169,150,15);               //Sets location and size
       contentPane.add(jLabel6);                                            //Adds to content pane

       farmsLabel = new javax.swing.JLabel();                               //Initializes label
       farmsLabel.setText("0");                                             //Sets text
       farmsLabel.setBounds(415,169,100,15);           //Sets location and size
       contentPane.add(farmsLabel);                                        //Adds to content pane

       jLabel8 = new javax.swing.JLabel();                                  //Initializes label
       jLabel8.setText("Number of Mines:");                                 //Sets text
       jLabel8.setBounds(299,240,120,10);              //Sets location and size
       contentPane.add(jLabel8);                                           //Adds to content pane

       minesLabel = new javax.swing.JLabel();                               //Initializes label
       minesLabel.setText("0");                                             //Sets text
       minesLabel.setBounds(423,240,100,10);           //Sets location and size
       contentPane.add(minesLabel);                                        //Adds to content pane

       jLabel3 = new javax.swing.JLabel();                                  //Initializes label
       jLabel3.setText("Cost:");                                            //Sets text
       jLabel3.setBounds(300,50,40,10);                //Sets location and size
       contentPane.add(jLabel3);                                           //Adds to content pane

       jLabel5 = new javax.swing.JLabel();                                 //Initializes label
       jLabel5.setText("Cost:");                                           //Sets text
       jLabel5.setBounds(300,130,40,10);              //Sets location and size
       contentPane.add(jLabel5);                                          //Adds to content pane

       jLabel7 = new javax.swing.JLabel();                                 //Initializes label
       jLabel7.setText("Cost:");                                           //Sets text
       jLabel7.setBounds(300,190,40,10);              //Sets location and size
       contentPane.add(jLabel7);                                          //Adds to content pane

       jLabel9 = new javax.swing.JLabel();                                 //Initializes label
       jLabel9.setText("Cost:");                                           //Sets text
       jLabel9.setBounds(300,259,40,15);               //Sets location and size
       contentPane.add(jLabel9);                                           //Adds to content pane

       helperCostLabel = new javax.swing.JLabel();                          //Initializes label
       helperCostLabel.setText(Integer.toString(helper.getCost()));         //Sets text to display helper's cost
       helperCostLabel.setBounds(340,50,100,10);       //Sets location and size
       contentPane.add(helperCostLabel);                                   //Adds to content pane

       grandmaCostLabel = new javax.swing.JLabel();                         //Initializes label
       grandmaCostLabel.setText(Integer.toString(grandma.getCost()));       //Sets text to display helper's cost
       grandmaCostLabel.setBounds(340,130,100,10);     //Sets location and size
       contentPane.add(grandmaCostLabel);                                  //Adds to content pane

       farmsCostLabel = new javax.swing.JLabel();                           //Initializes label
       farmsCostLabel.setText(Integer.toString(farm.getCost()));            //Sets text to display helper's cost
       farmsCostLabel.setBounds(335,190,100,10);       //Sets location and size
       contentPane.add(farmsCostLabel);                                    //Adds to content pane

       minesCostLabel = new javax.swing.JLabel();                           //Initializes label
       minesCostLabel.setText(Integer.toString(mine.getCost()));            //Sets text to display helper's cost
       minesCostLabel.setBounds(339,259,100,15);       //Sets location and size
       contentPane.add(minesCostLabel);                                    //Adds to content pane

       rateLabel= new javax.swing.JLabel();                                 //Initializes label
       rateLabel.setText("Cookies per second:");                            //Sets text
       rateLabel.setBounds(10,150,120,20);             //Sets location and size
       contentPane.add(rateLabel);                                          //Adds to content pane

       rateValue= new javax.swing.JLabel();                                 //Initializes label
       rateValue.setText(Double.toString(player1.getBonus()));              //Sets text to display cookies per sec value
       rateValue.setBounds(10,180,120,20);             //Sets location and size
       contentPane.add(rateValue);                                         //Adds to content pane

       cookieButton = new javax.swing.JButton();                            //Initializes button
       cookieButton.setText("Cookie");                                      //Sets text
       cookieButton.setBounds(10,30,100,100);          //Sets location and size
       contentPane.add(cookieButton);                                      //Adds to content pane
       cookieButton.addActionListener(new java.awt.event.ActionListener()      //New ActionListener
       {
           public void actionPerformed(java.awt.event.ActionEvent evt)       //ActionPerformed instance when clicked
           {
               cookieButtonActionPerformed(evt);                               //Calls ActionPerformed method
           }
       });

       cursorButton = new javax.swing.JButton();                            //Initializes button
       cursorButton.setText("BUY!");                                       //Sets text
       cursorButton.setBounds(200,30,90,50);           //Sets location and dimensions
       contentPane.add(cursorButton);                                      //Adds to content pane
       cursorButton.addActionListener(new java.awt.event.ActionListener()        //Adds new ActionListener
       {
           public void actionPerformed(java.awt.event.ActionEvent evt)          //ActionPerformed instance for when clicked
           {
               cursorButtonActionPerformed(evt);                               //Calls ActionPerformed method
           }
       });

       grandmaButton = new javax.swing.JButton();                          //Initializes button
       grandmaButton.setText("BUY!");                                          //Sets text
       grandmaButton.setBounds(200,100,90,50);             //Sets location and dimensions
       contentPane.add(grandmaButton);                                         //Adds to content pane
       grandmaButton.addActionListener(new java.awt.event.ActionListener()     //New ActionListener
       {
           public void actionPerformed(java.awt.event.ActionEvent evt)         //ActionPerformed instance when clicked
           {
               grandmaButtonActionPerformed(evt);                              //Calls ActionPerformed method
           }
       });

       farmButton = new javax.swing.JButton();                              //Initializes button
       farmButton.setText("BUY!");                                          //Sets text
       farmButton.setBounds(200,170,90,50);            //Sets location and dimensions
       contentPane.add(farmButton);                                        //Adds to content pane
       farmButton.addActionListener(new java.awt.event.ActionListener()            //New ActionListener
       {
           public void actionPerformed(java.awt.event.ActionEvent evt)          //ActionPerformed instance for when clicked
           {
               farmButtonActionPerformed(evt);                                 //Calls ActionPerformed method
           }
       });

       mineButton = new javax.swing.JButton();                              //Initializes label
       mineButton.setText("BUY!");                                             //Sets text
       mineButton.setBounds(200,240,90,50);                //Sets location and size
       contentPane.add(mineButton);                                            //Adds to content pane
       mineButton.addActionListener(new java.awt.event.ActionListener()        //New ActionListener
       {
           public void actionPerformed(java.awt.event.ActionEvent evt)        //ActionPerformed instance for when clicked
           {
               mineButtonActionPerformed(evt);                                //Calls ActionPerformed method
           }
       });

       noSellButton= new javax.swing.JButton();                                   //Initializes label
       noSellButton.setText("Stop selling");                                     //Sets text
       noSellButton.setBounds(10, 270, 150,20);              //Sets location and size
       contentPane.add(noSellButton);                                            //Adds to content pane
       noSellButton.addActionListener(new java.awt.event.ActionListener()        //Adds new ActionListener
       {
           public void actionPerformed(java.awt.event.ActionEvent evt)           //ActionPerformed instance for when clicked
           {
               noSellButtonActionPerformed(evt);                               //Calls ActionPerformed method
           }
       });

       sellButton= new javax.swing.JButton();                                  //Initializes button
       sellButton.setBounds(10,230,150,20);                //Sets location and size
       sellButton.setText("Sell Items");                                       //Sets text
       contentPane.add(sellButton);                                            //Adds to content pane
       sellButton.addActionListener(new java.awt.event.ActionListener()       //Adds new ActionListener
       {
           public void actionPerformed(java.awt.event.ActionEvent evt)       //ActionPerformed instance for when clicked
           {
               sellButtonActionPerformed(evt);                                 //Calls ActionPerformed method
           }
       });

       setSize(550,350);                                    //Sets dimensions of content pane
       setVisible(true);                                                  //Sets content pane to visible
   }

   private void cookieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cookieButtonActionPerformed
       player1.setCookies(1);                                                          //Increments cookies by 1 each click
       numberOfCookiesLabel.setText(Integer.toString(player1.getCookies()));           //Displays new amount
   }//GEN-LAST:event_cookieButtonActionPerformed

   private void cursorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cursorButtonActionPerformed
       if(player1.getCookies() < helper.getCost() && !selling)         //If you can't afford the cost and aren't selling, warning message
       {
           JOptionPane.showMessageDialog(null,"You don't have enough to buy!","Can't Afford!", JOptionPane.WARNING_MESSAGE);
       }
       else if(selling)                                                     //Else if you are selling
       {
           if(helper.getAmount() > 0)                                      //If there are helpers to be sold, sell them
           {
               helper.sold();                                              //Calls method to sell the helper
               player1.sell(helper.getSellVal());                          //Calls method for player to increment cookies on sell
               helperCostLabel.setText(Integer.toString(helper.getSellVal()));             //Displays current sell value
               helperLabel.setText(Integer.toString(helper.getAmount()));                  //Displays current amount
               numberOfCookiesLabel.setText(Integer.toString(player1.getCookies()));       //Displays current cookies
               player1.setBonus(-0.1);                                                    //Decrements bonus
           }
           JOptionPane.showMessageDialog(null,"There's Nothing To Sell!","No Helpers!", JOptionPane.WARNING_MESSAGE);
           //Warning message that there isn't anything to sell

       }
       else                                                                        //Else, when you're buying
       {
           player1.buy(helper.getCost());                                         //Calls method to use cookies to buy
           helper.invest();                                                       //Calls method to buy new helper
           helperCostLabel.setText(Integer.toString(helper.getCost()));           //Displays new cost
           helperLabel.setText(Integer.toString(helper.getAmount()));             //Displays new amount
           numberOfCookiesLabel.setText(Integer.toString(player1.getCookies()));  //Displays new number of cookies
           player1.setBonus(.1);                                                  //Increments bonus
       }
   }//GEN-LAST:event_cursorButtonActionPerformed

   private void grandmaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grandmaButtonActionPerformed
       if(player1.getCookies() < grandma.getCost() && !selling)              //If you can't afford the cost and aren't selling, warning message
       {
           JOptionPane.showMessageDialog(null,"You don't have enough to buy!","Can't Afford!", JOptionPane.WARNING_MESSAGE);
       }
       else if(selling)                                                      //Else if you are selling
       {
           if(grandma.getAmount() > 0)                                     //If there are helpers to be sold, sell them
           {
               grandma.sold();                                             //Calls method to sell the helper
               player1.sell(grandma.getSellVal());                          //Calls method for player to increment cookies by sale
               grandmaCostLabel.setText(Integer.toString(grandma.getSellVal()));           //Displays current sell value
               grandmaLabel.setText(Integer.toString(grandma.getAmount()));                //Displays current amount
               numberOfCookiesLabel.setText(Integer.toString(player1.getCookies()));       //Displays current cookies
               player1.setBonus(-1);                                                       //Decrements bonus
           }
           JOptionPane.showMessageDialog(null,"There's Nothing To Sell!","No Helpers!", JOptionPane.WARNING_MESSAGE);
           //Warning message for when there's nothing to sell

       }
       else                                                                         //Else, when you're buying
       {
           player1.buy(grandma.getCost());                                         //Calls method to use cookies to buy
           grandma.invest();                                                       //Calls method to buy new helper
           grandmaCostLabel.setText(Integer.toString(grandma.getCost()));          //Displays new cost
           grandmaLabel.setText(Integer.toString(grandma.getAmount()));            //Displays new amount
           numberOfCookiesLabel.setText(Integer.toString(player1.getCookies()));   //Displays current cookies
           player1.setBonus(1);                                                    //Increments cookies per sec
       }
   }//GEN-LAST:event_grandmaButtonActionPerformed

   private void farmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_farmButtonActionPerformed
       if(player1.getCookies() < farm.getCost() && !selling)                  //If you can't afford the cost and aren't selling, warning message
       {
           JOptionPane.showMessageDialog(null,"You don't have enough to buy!","Can't Afford!", JOptionPane.WARNING_MESSAGE);
       }
       else if(selling)                                                            //Else if you're selling
       {
           if(farm.getAmount() > 0)                                                //If there are farms to be sold
           {
               farm.sold();                                                        //Calls method to sell the helper
               player1.sell(farm.getSellVal());                                   //Calls method for player to increment cookies by sell value
               farmsCostLabel.setText(Integer.toString(farm.getSellVal()));        //Displays current sell value
               farmsLabel.setText(Integer.toString(farm.getAmount()));                   //Displays current helper amount
               numberOfCookiesLabel.setText(Integer.toString(player1.getCookies()));      //Displays current cookies
               player1.setBonus(-8);                                                      //Decrements cookies per sec
           }
           JOptionPane.showMessageDialog(null,"There's Nothing To Sell!","No Helpers!", JOptionPane.WARNING_MESSAGE);

       }
       else                                                                        //Else, when you're buying
       {
           player1.buy(farm.getCost());                                             //Calls method to use cookies to buy
           farm.invest();                                                           //Calls method to to buy new helper
           farmsCostLabel.setText(Integer.toString(farm.getCost()));                //Displays new cost
           farmsLabel.setText(Integer.toString(farm.getAmount()));                  //Displays new amount
           numberOfCookiesLabel.setText(Integer.toString(player1.getCookies()));    //Displays current cookies
           player1.setBonus(8);                                                     //Increments cookies per sec
       }
   }//GEN-LAST:event_farmButtonActionPerformed

   private void mineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mineButtonActionPerformed
       if(player1.getCookies() < mine.getCost() && !selling)            //If you can't afford the cost and aren't selling, warning message
       {
           JOptionPane.showMessageDialog(null,"You don't have enough to buy!","Can't Afford!", JOptionPane.WARNING_MESSAGE);
       }
       else if(selling)                                                            //Else if you're selling
       {
           if(mine.getAmount() > 0)                                                //If there are mines to be sold
           {
               mine.sold();                                                        //Calls method to sel the mine
               player1.sell(mine.getSellVal());                                    //Calls method to increment cookies by sale value
               minesCostLabel.setText(Integer.toString(mine.getSellVal()));        //Displays current sell value
               minesLabel.setText(Integer.toString(mine.getAmount()));             //Displays current amount
               numberOfCookiesLabel.setText(Integer.toString(player1.getCookies()));       //Displays current cookies
               player1.setBonus(-47);                                                      //Decrements bonus for cookies per sec
           }
           JOptionPane.showMessageDialog(null,"There's Nothing To Sell!","No Helpers!", JOptionPane.WARNING_MESSAGE);
           //Warning message if there's nothing to sell
       }
       else                                                                            //Else when buying
       {
           player1.buy(mine.getCost());                                              //Method call to increment cookies
           mine.invest();                                                            //Method call to buy a building
           minesCostLabel.setText(Integer.toString(mine.getCost()));                 //Displays current cost
           minesLabel.setText(Integer.toString(mine.getAmount()));                   //Displays current amount
           numberOfCookiesLabel.setText(Integer.toString(player1.getCookies()));     //Displays current cookies
           player1.setBonus(47);                                                     //Increments cookies per sec
       }
   }//GEN-LAST:event_mineButtonActionPerformed

   private void sellButtonActionPerformed(java.awt.event.ActionEvent evt){
       if(selling)                                                    //If already clicked button, warning message
       {
           JOptionPane.showMessageDialog(null,"You're already selling!","Already Selling", JOptionPane.WARNING_MESSAGE);
       }
       selling= true;                                               //Sets boolean to true, that player is selling

       int helperSell= (int) (helper.getCost()*0.2875);             //Changes helpers' cost to accurate sell value and text to "sell"
       cursorButton.setText("Sell!");
       jLabel3.setText("Sell:");
       helperCostLabel.setText(Integer.toString(helperSell));

       int grandSell= (int) (grandma.getCost()*0.2875);             //Changes grandmas' cost to accurate sell value and text to "sell"
       grandmaButton.setText("Sell!");
       jLabel7.setText("Sell:");
       grandmaCostLabel.setText(Integer.toString(grandSell));

       int farmSell= (int) (farm.getCost()*0.2875);                //Changes farms' cost to accurate sell value and text to "sell"
       farmButton.setText("Sell!");
       jLabel5.setText("Sell:");
       farmsCostLabel.setText(Integer.toString(farmSell));

       int mineSell= (int) (mine.getCost()*0.2875);               //Changes mines' cost to accurate sell value and text to "sell"
       mineButton.setText("Sell!");
       jLabel9.setText("Sell:");
       minesCostLabel.setText(Integer.toString(mineSell));
   }

   private void noSellButtonActionPerformed(java.awt.event.ActionEvent evt){
       if(selling)                                                             //If player is selling items
       {
           selling= false;                                                     //Resets boolean to false

           jLabel3.setText("Cost:");                                          //Sets helper price back to the current cost and resets text for buying
           cursorButton.setText("BUY!");
           helperCostLabel.setText(Integer.toString(helper.getCost()));
           helperLabel.setText(Integer.toString(helper.getAmount()));

           jLabel5.setText("Cost:");                                        //Sets grandma price back to the current cost and resets text for buying
           grandmaButton.setText("BUY!");
           grandmaCostLabel.setText(Integer.toString(grandma.getCost()));
           grandmaLabel.setText(Integer.toString(grandma.getAmount()));

           jLabel7.setText("Cost:");                                       //Sets farm price back to the current cost and resets text for buying
           farmButton.setText("BUY!");
           farmsCostLabel.setText(Integer.toString(farm.getCost()));
           farmsLabel.setText(Integer.toString(farm.getAmount()));

           jLabel9.setText("Cost:");                                      //Sets mine price back to the current cost and resets text for buying
           mineButton.setText("BUY!");
           minesCostLabel.setText(Integer.toString(mine.getCost()));
           minesLabel.setText(Integer.toString(mine.getAmount()));
       }
       else                                                       //If not selling yet, warning message
       {
           JOptionPane.showMessageDialog(null,"You're not selling yet!","Not Selling", JOptionPane.WARNING_MESSAGE);
       }
   }


   public static void main(String[] args)                                //Main method for the program
   {
       CookieClicker_GUI application= new CookieClicker_GUI();             //Creates application for the program
       application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //Sets close function to terminate process on exit
   }
}
