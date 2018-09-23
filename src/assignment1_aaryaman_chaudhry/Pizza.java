/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1_aaryaman_chaudhry;

import static assignment1_aaryaman_chaudhry.FXMLFood1Controller.abc;
import static assignment1_aaryaman_chaudhry.Logic.food;
import java.text.DecimalFormat;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

/**
 *
 * @author Aaryaman
 */
public class Pizza implements Food{
    private static DecimalFormat two = new DecimalFormat("#.##");
    private static double price = 0;
    private static String smat = "";
    private static String medt= "";
    private static String lart="";
    private static String thit="";
    private static String thct="";
    private static String tomt="";
    private static String capt="";
    private static String must="";
    private static String olit="";
    private static String memt="";
    private static String meaat="";
    private static String pint="";
    private static int calories;
    private String pizza;

    public Pizza(RadioButton small, RadioButton medium, RadioButton large, RadioButton thin, RadioButton thick, CheckBox tomato, CheckBox capsicum, CheckBox mushroom, CheckBox olives, CheckBox meme, CheckBox meat, CheckBox pineapple) {
        this.small = small;
        this.medium = medium;
        this.large = large;
        this.thin = thin;
        this.thick = thick;
        this.tomato = tomato;
        this.capsicum = capsicum;
        this.mushroom = mushroom;
        this.olives = olives;
        this.meme = meme;
        this.meat = meat;
        this.pineapple = pineapple;
    }

  
    private RadioButton small;
    
    private RadioButton medium;
    
    private RadioButton large;
    
    private RadioButton thin;
    
    private RadioButton thick;
    
    private CheckBox tomato;
     
    private CheckBox capsicum;
     
    private CheckBox mushroom;
       
    private CheckBox olives;
        
    private CheckBox meme;
         
    private CheckBox meat;
          
    private CheckBox pineapple;
    
    private int quantity = abc;
    

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
         
             if(tomato.isSelected()){
        price += 1;
        }
         
                if(capsicum.isSelected()){
        price += 1;
        }
                if(mushroom.isSelected()){
        price += 1;
        }
                if(olives.isSelected()){
        price += 1;
        }
        
        price = price*quantity;
        return price;
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
         
             if(tomato.isSelected()){
        calories += 20;
        }
         
                if(capsicum.isSelected()){
        calories += 20;
        }
                if(mushroom.isSelected()){
        calories += 40;
        }
                if(olives.isSelected()){
        calories += 30;
        }
        
        
        return calories;
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
         
             if(tomato.isSelected()){
        tomt = "\r\n"+">"+" "+"Tomato";
        }
          if(capsicum.isSelected()){
        capt = "\r\n"+">"+" "+"Capsicum";
        }
           if(mushroom.isSelected()){
        must = "\r\n"+">"+" "+"Mushroom";
        }
            if(olives.isSelected()){
        olit = "\r\n"+">"+" "+"Olives";
        }
             if(thin.isSelected()){
        thit = "\r\n"+">"+" "+"Thin";
        }
              if(thick.isSelected()){
        thct = "\r\n"+">"+" "+"Thick";
        }
              if(meme.isSelected()){
        memt = "\r\n"+">"+" "+"Extra Cheese";
        }
              if(meat.isSelected()){
        meaat = "\r\n"+">"+" "+"Meat";
        }
              if(pineapple.isSelected()){
        pint = "\r\n"+">"+" "+"Pineapple";
        }
             getCalories();
pizza = quantity+"\t"+smat + medt + lart +"PIZZA"+"\t"+"$"+two.format(price)+ tomt +capt+ must + olit + thit + thct + memt + meaat + pint +"\r\n"+"Calories"+"\t"+calories;
     return pizza;
        
        
    }
    
}
