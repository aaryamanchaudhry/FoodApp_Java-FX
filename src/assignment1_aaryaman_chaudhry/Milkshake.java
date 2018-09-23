/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1_aaryaman_chaudhry;
import static assignment1_aaryaman_chaudhry.FXMLFood1Controller.abc;
import java.text.DecimalFormat;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;

/**
 *
 * @author Aaryaman
 */
public class Milkshake implements Food{
      private static DecimalFormat two = new DecimalFormat("#.##");   
          private static String smat = "";
    private static String medt= "";
    private static String lart="";
    private static String thit="";
    private static String thct="";
    private static String tomt="";
    private static String capt="";
    private static String must="";
    private static String olit="";
    private double price;
    private static int calories;
    
    private String milk;
            
    private RadioButton small;
    
    private RadioButton medium;
    
    private RadioButton large;
    
    private RadioButton c;
    
    private RadioButton s;
    
    private CheckBox u;
     
    private CheckBox r;
      
    private CheckBox v;
       
    private CheckBox o;
    private int quantity = abc;

    public Milkshake(RadioButton small, RadioButton medium, RadioButton large, RadioButton c, RadioButton s, CheckBox u, CheckBox r, CheckBox v, CheckBox o) {
        this.small = small;
        this.medium = medium;
        this.large = large;
        this.c = c;
        this.s = s;
        this.u = u;
        this.r = r;
        this.v = v;
        this.o = o;
        
      
            
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
         
             if(c.isSelected()){
        calories += 20;
        }
         
                if(s.isSelected()){
        calories += 20;
        }
                if(u.isSelected()){
        calories += 40;
        }
                if(v.isSelected()){
        calories += 30;
        }
        if(r.isSelected()){
        calories += 30;
        }
        if(o.isSelected()){
        calories += 30;
        }
        
        return calories;
    }

    @Override
    public double getSubTotal() {
        price = 0;
        if(small.isSelected()){
        price += 10;
        }
         if(medium.isSelected()){
        price += 20;
        }
          if(large.isSelected()){
        price += 30;
        }
         
             if(u.isSelected()){
        price += 5;
        }
         
                if(o.isSelected()){
        price += 20;
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
         
             if(c.isSelected()){
        tomt = "\r\n"+">"+" "+"Choclate";
        }
          if(s.isSelected()){
        capt = "\r\n"+">"+" "+"Strawberry";
        }
           if(u.isSelected()){
        must = "\r\n"+">"+" "+"Unicorn ";
        }
            if(r.isSelected()){
        olit = "\r\n"+">"+" "+"Rainbow";
        }
             if(v.isSelected()){
        thit = "\r\n"+">"+" "+"Vegan Milk";
        }
              if(o.isSelected()){
        thct = "\r\n"+">"+" "+"Oreo";
        }
        getCalories();
        milk = quantity+"\t"+smat + medt + lart +"MILK"+"\t"+"$"+two.format(price)+ tomt +capt+ must + olit + thit + thct+"\r\n"+"Calories"+"\t"+calories;

     return milk;
        
        
    }
    
    

    
}
