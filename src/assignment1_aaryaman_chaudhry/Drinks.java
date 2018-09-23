/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1_aaryaman_chaudhry;

import java.text.DecimalFormat;
import javafx.scene.control.CheckBox;

/**
 *
 * @author Aaryaman
 */

    import java.text.DecimalFormat;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;

/**
 *
 * @author Aaryaman
 */
public class Drinks implements Food{
      private static DecimalFormat two = new DecimalFormat("#.##");   
          private static String coket = "";
    private static String dietcoket= "";
    private static String cokezerot="";
    private static String spritet="";
    private static String fantat="";
   
    private double price;
    private static int calories;
    
    private String drink;
            
    private CheckBox coke;
    
    private CheckBox dietcoke;
    
    private CheckBox sprite;
    
    private CheckBox fanta;
    
    private CheckBox cokezero;
    

   

    public Drinks(CheckBox coke, CheckBox dietcoke, CheckBox sprite, CheckBox fanta, CheckBox cokezero) {
        this.coke = coke;
        this.dietcoke = dietcoke;
        this.sprite = sprite;
        this.fanta = fanta;
        this.cokezero = cokezero;
        
        
      
            
    }
    
    @Override
    public int getCalories(){

        calories=0;
        
        
        return calories;
    }

    @Override
    public double getSubTotal() {
        price = 0;
        if(coke.isSelected()){
        price += 5;
        }
         if(sprite.isSelected()){
        price += 5;
        }
          if(cokezero.isSelected()){
        price += 5;
        }
         
             if(dietcoke.isSelected()){
        price += 5;
        }
         
                if(fanta.isSelected()){
        price += 5;
        }
        
        
        return price;
    }
    @Override 
    public String toString(){
      
        
         
             if(coke.isSelected()){
        coket = "\r\n"+">"+" "+"Coke";
        }
          if(sprite.isSelected()){
        spritet = "\r\n"+">"+" "+"Sprite";
        }
           if(dietcoke.isSelected()){
        dietcoket = "\r\n"+">"+" "+"Diet Coke";
        }
            if(fanta.isSelected()){
        fantat = "\r\n"+">"+" "+"Fanta";
        }
             if(cokezero.isSelected()){
        cokezerot = "\r\n"+">"+" "+"Coke Zero";
        }
        
        drink = coket + spritet+ dietcoket+ fantat+ cokezerot+"\r\n";

     return drink;
        
        
    }
    
    

    
}


