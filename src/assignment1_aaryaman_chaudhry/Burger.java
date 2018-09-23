/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1_aaryaman_chaudhry;

import static assignment1_aaryaman_chaudhry.FXMLFood1Controller.abc;
import java.text.DecimalFormat;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;

/**
 *
 * @author Aaryaman
 */
public class Burger implements Food{
    private int quantity = abc;
    private static DecimalFormat two = new DecimalFormat("#.##");
    private String burgerr;
    private static String smat = "";
    private static String medt= "";
    private static String lart="";
    private static String thit="";
    private static String thct="";
    private static String tomt="";
    private static String capt="";
    private static String must="";
    private static String olit="";
  private static int calories;
    
    private double price;

    public double getPrice() {
        return price;
    }
     
    private RadioButton small;
    
    private RadioButton medium;
   
    private RadioButton large;
    
    private RadioButton potato;
    
    private RadioButton meme2;
   
    private CheckBox tomato;
     
    private CheckBox onion;
      
    private CheckBox lettuce;
       
    private CheckBox cheese;

    
    public Burger(RadioButton small, RadioButton medium, RadioButton large, RadioButton potato, RadioButton meme2, CheckBox tomato, CheckBox onion, CheckBox lettuce, CheckBox cheese) {
        this.small = small;
        this.medium = medium;
        this.large = large;
        this.potato = potato;
        this.meme2 = meme2;
        this.tomato = tomato;
        this.onion = onion;
        this.lettuce = lettuce;
        this.cheese = cheese;
    }
     @Override
    public int getCalories(){
calories=0;
        if(small.isSelected()){
        calories += 150;
        }
         if(medium.isSelected()){
        calories += 300;
        }
          if(large.isSelected()){
        calories += 450;
        }
         
             if(potato.isSelected()){
        calories += 20;
        }
         
                if(meme2.isSelected()){
        calories += 20;
        }
                if(tomato.isSelected()){
        calories += 40;
        }
                if(onion.isSelected()){
        calories += 30;
        }
        if(lettuce.isSelected()){
        calories += 30;
        }
        if(cheese.isSelected()){
        calories += 30;
        }
        
        return calories;
    }
    @Override
    public double getSubTotal() {
        price=0;
        if(small.isSelected()){
        price += 5;
        }
         if(medium.isSelected()){
        price += 10;
        }
          if(large.isSelected()){
        price += 15;
        }
         
             if(potato.isSelected()){
        price += 2;
        }
         
                if(meme2.isSelected()){
        price += 6;
        }
        
        price = price*quantity;
        return price;
    }
    
    
    
    @Override 
    public String toString(){
        if(small.isSelected()){
       smat = "Small"+"  ";
        }
         if(medium.isSelected()){
        medt ="Medium"+"  ";
        }
          if(large.isSelected()){
       lart ="Large"+"  ";
        }
         
             if(potato.isSelected()){
        tomt = "\r\n"+">"+" "+"Potato Fill";
        }
          if(meme2.isSelected()){
        capt = "\r\n"+">"+" "+"Meat Fill";
        }
           if(tomato.isSelected()){
        must = "\r\n"+">"+" "+"Tomato  ";
        }
            if(onion.isSelected()){
        olit = "\r\n"+">"+" "+"Onions";
        }
             if(lettuce.isSelected()){
        thit = "\r\n"+">"+" "+"Lettuce";
        }
              if(cheese.isSelected()){
        thct = "\r\n"+">"+" "+"Cheese";
        }
             
              getCalories();
             
burgerr = quantity+"\t"+smat + medt + lart +"BURGER"+"\t"+"$"+two.format(price)+ tomt +capt+ must + olit + thit + thct+"\r\n"+"Calories"+"\t"+calories;
     return burgerr;
        
        
    }

    
    
}
