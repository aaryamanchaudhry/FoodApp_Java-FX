/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1_aaryaman_chaudhry;

import static assignment1_aaryaman_chaudhry.Logic.totalPrice;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

/**
 * FXML Controller class
 *
 * @author Aaryaman
 */
public class FXMLFood1Controller implements Initializable {

    private static Pizza b;
    static int abc = 1;
    /**
     * Initializes the controller class.
     */
   
     @FXML
    public void show1(){
    Assignment1_Aaryaman_Chaudhry.show1();
    }
    
     @FXML
    public void show3(){
    Assignment1_Aaryaman_Chaudhry.show3();
    }
    
    @FXML
    public void show4(){
    Assignment1_Aaryaman_Chaudhry.show4();
    }
    @FXML
    public void show5(){
    Assignment1_Aaryaman_Chaudhry.show5();
    }
    private static int calories;
    private double pricefood;
    @FXML
    private RadioButton small;
    @FXML
    private RadioButton medium;
    @FXML
    private RadioButton large;
    @FXML
    private RadioButton thin;
    @FXML
    private RadioButton thick;
    @FXML
    private CheckBox tomato;
     @FXML
    private CheckBox capsicum;
      @FXML
    private CheckBox mushroom;
       @FXML
    private CheckBox olives;
        @FXML
    private CheckBox meme;
         @FXML
    private CheckBox meat;
          @FXML
    private CheckBox pineapple;
          @FXML
private Label myLabel;
          @FXML
          private Label t1;
          
          @FXML
          private Button bt1;
          @FXML
          private Button bt2;

          @FXML
          private ImageView imgcapsicum;
          
          @FXML
          private ImageView imgmushroom;
          
          @FXML
          private ImageView imgtomato;
          
          @FXML
          private ImageView imgpepper;
          
          @FXML
          private ImageView imgolive;
          
          @FXML
          private ImageView imgpineapple;
          
              @FXML
              private Label label1;
              @FXML
              private Label label2;
    
              @FXML
    public void updatePriceLabel(){
        
     getPrice();
    label1.setText("$"+ " " + pricefood);
    }
    @FXML
    public void updateCaloriesLabel(){
        
     getCalories();
    label2.setText(""+calories);
    }
    
    
          
          
          @FXML
          public void capsicumon(){
          if((capsicum.isSelected())){
          imgcapsicum.setVisible(true);
          }
          else
          {
          imgcapsicum.setVisible(false);
          }
          }
           @FXML
          public void mushroomon(){
          if((mushroom.isSelected())){
          imgmushroom.setVisible(true);
          }
          else
          {
          imgmushroom.setVisible(false);
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
          public void pepperon(){
          if((meat.isSelected())){
          imgpepper.setVisible(true);
          }
          else
          {
          imgpepper.setVisible(false);
          }
          }
           @FXML
          public void oliveon(){
          if((olives.isSelected())){
          imgolive.setVisible(true);
          }
          else
          {
          imgolive.setVisible(false);
          }
          }
           @FXML
          public void pineappleon(){
          if((pineapple.isSelected())){
          imgpineapple.setVisible(true);
          }
          else
          {
          imgpineapple.setVisible(false);
          }
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

    public void add(){ 
    b = new Pizza(small,medium,large,thin,thick,tomato,capsicum,mushroom,olives,meme,meat,pineapple);
    
    Logic.food.add(b);
   
        
     
    }
    
    
    public int getCalories(){
          calories = 0;
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
         
             if(tomato.isSelected()){
        pricefood += 1;
        }
         
                if(capsicum.isSelected()){
        pricefood += 1;
        }
                if(mushroom.isSelected()){
        pricefood += 1;
        }
                if(olives.isSelected()){
        pricefood += 1;
        }
        
        
        
    }
    
       @FXML   
       public void Checkout(){
           
           Logic.price();
        show5();
        
       }
       public void piz(){
          small.setSelected(false);
    medium.setSelected(false);
    large.setSelected(false);
    thin.setSelected(false);
    thick.setSelected(false);
    tomato.setSelected(false);
    capsicum.setSelected(false);
    mushroom.setSelected(false);
    olives.setSelected(false);
    meme.setSelected(false);
    meat.setSelected(false);
    pineapple.setSelected(false);
       }
     @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        t1.setText("1");
        
       
        
    }
        
    
    
}
