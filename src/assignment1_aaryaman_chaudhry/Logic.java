/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1_aaryaman_chaudhry;

import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author Aaryaman
 */
public class Logic {
    
    public static int random=1000000 + (int)(Math.random() * ((9999999 - 1000000) + 1));
static ArrayList<Food> food = new ArrayList<Food>();
    static double discount;
   static double discounted;
static double totalPrice;
static double tax;
static double total;
static boolean discountt ;

private static DecimalFormat two = new DecimalFormat("#.##");




public static void price(){
    total=0;
for(Food s : food){
totalPrice+= s.getSubTotal();

}
tax = (0.14)*(totalPrice);
total = totalPrice + tax;
}
   
      public static void Write(ArrayList<Food> food) {
          
         
          
          
        try {
            //Identify the file
            File file = new File("receipt_no_"+random+".txt");

            //Check if the file exists
            if (!file.exists()) {
                //If the file doesn't exist, create it.
                file.createNewFile();
            }
            
            //Open the file to write
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.newLine();
            bw.newLine();
            bw.write("            Order No -"+""+random);
            bw.newLine();
            //Write to the file
            bw.write("            Ramsay's Kitchen            ");
            bw.newLine();
            bw.write("            69,Heaven Road            ");
            bw.newLine();
             bw.write("                  MARS                   ");
             bw.newLine();
            bw.write("**************************************");
            bw.newLine();
            bw.newLine();
            bw.write("Order No            ");
            for (Food s : food){
                bw.write(s.toString());
                bw.newLine();
               
            }
             bw.newLine();
             bw.newLine();
            bw.write("**************************************"); 
            bw.newLine();
            bw.write("Subtotal                      "+"$"+two.format(totalPrice));
            bw.newLine();
            bw.write("Tax                             "+"$"+two.format(tax));
             bw.newLine();
            bw.write("Grand Total                "+"$"+two.format(total));
              bw.newLine();

            
            //Close
            bw.close();
        } 
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
