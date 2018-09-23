/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1_aaryaman_chaudhry;

import static assignment1_aaryaman_chaudhry.FXMLFood1Controller.abc;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Aaryaman
 */
public class FXMLFood3Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    private static int calories;
        private static Milkshake b;
    static int abc = 1;
 
     @FXML
    public void show1(){
    Assignment1_Aaryaman_Chaudhry.show1();
    }
    
    @FXML
    public void show3 (){
    Assignment1_Aaryaman_Chaudhry.show3();
    }
    
    @FXML
    public void show4(){
    Assignment1_Aaryaman_Chaudhry.show2();
    }
    public void show5(){
    Assignment1_Aaryaman_Chaudhry.show5();
    }
    public double pricefood;
      @FXML
    private RadioButton small;
    @FXML
    private RadioButton medium;
    @FXML
    private RadioButton large;
    @FXML
    private RadioButton c;
    @FXML
    private RadioButton s;
    @FXML
    private CheckBox u;
     @FXML
    private CheckBox r;
      @FXML
    private CheckBox v;
       @FXML
    private CheckBox o;
       @FXML
          private Label t1;
          
          @FXML
          private Button bt1;
          @FXML
          private Button bt2;
              @FXML
          private ImageView imgchoco;
          
          @FXML
          private ImageView imgstraw;
          
          @FXML
          private ImageView imgunicorn;
          
          @FXML
          private ImageView imgrainbow;
          
              @FXML
              private Label label1;
               @FXML
       private Label label2;
       @FXML
       public void updateCaloriesLabel(){
        
     getCalories();
    label2.setText(""+calories);
    }
       
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
               @FXML
          public void chocoon(){
          if((c.isSelected())){
          imgchoco.setVisible(true);
           imgstraw.setVisible(false);
          }
          else
          {
          imgchoco.setVisible(false);
          }
          }
           @FXML
          public void strawon(){
          if((s.isSelected())){
          imgstraw.setVisible(true);
          imgchoco.setVisible(false);
          }
          else
          {
          imgstraw.setVisible(false);
          }
          }
           @FXML
          public void unicornon(){
          if((u.isSelected())){
          imgunicorn.setVisible(true);
          }
          else
          {
          imgunicorn.setVisible(false);
          }
          }
           @FXML
          public void rainbowon(){
          if((r.isSelected())){
          imgrainbow.setVisible(true);
          }
          else
          {
          imgrainbow.setVisible(false);
          }
          }
           
           public void getPrice() {
        
        
            pricefood = 0;
        
        if(small.isSelected()){
        pricefood += 10;
        }
         if(medium.isSelected()){
        pricefood += 20;
        }
          if(large.isSelected()){
        pricefood += 30;
        }
         
             
         
                if(u.isSelected()){
        pricefood += 5;
        }
                if(r.isSelected()){
        pricefood += 20;
        }
                
        
        
    }
    
     @FXML
    public void updatePriceLabel(){
        
     getPrice();
    label1.setText("$"+ " " + pricefood);
    }
                 @FXML
          public void quantityAdd(){
          if(Integer.parseInt(t1.getText())<25){
              
             abc = Integer.parseInt(t1.getText());
             
             abc++;
             
             String abcd = Integer.toString(abc);
             
             t1.setText(abcd);
             
          }
          }
    @FXML
          public void quantitySubtract(){
              
          if(Integer.parseInt(t1.getText())>1){
              
             abc = Integer.parseInt(t1.getText());
             abc--;
             
             String abcd = Integer.toString(abc);
             t1.setText(abcd);
             
          }
          }
       
    @FXML
    public void add(){
        
    Milkshake m = new Milkshake(small,medium,large,c,s,u,r,v,o);
    Logic.food.add(m);
    
           
    
    }
    
       @FXML   
       public void Checkout(){
           
           Logic.price();
        
       show5();
       }
      
       @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
