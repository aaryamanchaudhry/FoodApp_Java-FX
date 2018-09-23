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
public class FXMLFood2Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
        private static Burger b;
    static int abc = 1;
  
     @FXML
    public void show1(){
    Assignment1_Aaryaman_Chaudhry.show1();
    }
    
     @FXML
    public void show3(){
    Assignment1_Aaryaman_Chaudhry.show2();
    }
   
    @FXML
    public void show4(){
    Assignment1_Aaryaman_Chaudhry.show4();
   
    }
    public void show5(){
    Assignment1_Aaryaman_Chaudhry.show5();
    }
    private static int calories;
    public double pricefood;
      @FXML
    private RadioButton small;
    @FXML
    private RadioButton medium;
    @FXML
    private RadioButton large;
    @FXML
    private RadioButton potato;
    @FXML
    private RadioButton meme2;
    @FXML
    private CheckBox tomato;
     @FXML
    private CheckBox onion;
      @FXML
    private CheckBox lettuce;
       @FXML
    private CheckBox cheese;
       @FXML
          private Label t1;
       @FXML
       private Label label2;
       @FXML
       public void updateCaloriesLabel(){
        
     getCalories();
    label2.setText(""+calories);
    }
          
          @FXML
          private Button bt1;
          @FXML
          private Button bt2;
          
           @FXML
          private ImageView imgfilling;
          
          @FXML
          private ImageView imglettuce;
          
          @FXML
          private ImageView imgtomato;
          
          @FXML
          private ImageView imgonion;
          
          @FXML
          private ImageView imgcheese;
          
           @FXML
              private Label label1;
           public void getPrice() {
        
        
            pricefood = 0;
        
        if(small.isSelected()){
        pricefood += 5;
        }
         if(medium.isSelected()){
        pricefood += 10;
        }
          if(large.isSelected()){
        pricefood += 15;
        }
         
             
         
                if(potato.isSelected()){
        pricefood += 2;
        }
                if(meme2.isSelected()){
        pricefood += 6;
        }
                
        
        
    }
    
     @FXML
    public void updatePriceLabel(){
        
     getPrice();
    label1.setText("$"+ " " + pricefood);
    }
    
               @FXML
          public void fillingon(){
          if((meme2.isSelected()||potato.isSelected())){
          imgfilling.setVisible(true);
          }
          else
          {
          imgfilling.setVisible(false);
          }
          }
           @FXML
          public void lettuceon(){
          if((lettuce.isSelected())){
          imglettuce.setVisible(true);
          }
          else
          {
          imglettuce.setVisible(false);
          }
          }
           @FXML
          public void tomatoon(){
          if((tomato.isSelected())){
          imgtomato.setVisible(true);
          }
          else
          {
          imgtomato.setVisible(false);
          }
          }
           @FXML
          public void cheeseon(){
          if((cheese.isSelected())){
          imgcheese.setVisible(true);
          }
          else
          {
          imgcheese.setVisible(false);
          }
          }
           @FXML
          public void onionon(){
          if((onion.isSelected())){
          imgonion.setVisible(true);
          }
          else
          {
          imgonion.setVisible(false);
          }
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
        
    Burger b = new Burger(small,medium,large,potato,meme2,tomato,onion,lettuce,cheese);
    Logic.food.add(b);
    
    }
    
       @FXML   
       public void Checkout(){
           Logic.price();
        
        show5();
       }
       public void burg(){
       small.setSelected(false);
    medium.setSelected(false);
    large.setSelected(false);
    potato.setSelected(false);
    meme2.setSelected(false);
    tomato.setSelected(false);
    onion.setSelected(false);
    lettuce.setSelected(false);
    cheese.setSelected(false);
       }
     @Override
    public void initialize(URL url, ResourceBundle rb) {
 t1.setText("1");        
// TODO
    }    
       
    
}
