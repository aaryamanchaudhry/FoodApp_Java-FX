/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1_aaryaman_chaudhry;

import static assignment1_aaryaman_chaudhry.Logic.random;
import static assignment1_aaryaman_chaudhry.Logic.totalPrice;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Aaryaman
 */
public class FXMLReceiptController implements Initializable {

     @FXML
    public void show1(){
    Assignment1_Aaryaman_Chaudhry.show1();
    }
    /**
     * Initializes the controller class.
     */
    @FXML
    public CheckBox coke;
    @FXML
    public CheckBox dietcoke;
    @FXML
    public CheckBox sprite;
    @FXML
    public CheckBox fanta;
    @FXML
    public CheckBox cokezero;
    @FXML
    public Label l1;
    @FXML
    public TextField t1;
    
    public static int random1;
    
    public static  int lx = Logic.random;
    
    public void changeLabel(){
   
    try {
            //Identify the file
            File file = new File("receipt_no_"+t1.getText()+".txt");

            //Check if the file exists
            if (!file.exists()) {
               l1.setText("No such file!");
            }
            
            //Open the file to write
            FileReader fr = new FileReader(file.getAbsoluteFile());
            BufferedReader br = new BufferedReader(fr);
            String s;
            while((s=br.readLine())!=null){
                
            s+=s+"\n";
            }
            l1.setText(s);
            
             br.close();
        } 
        catch (IOException e) {
            System.out.println(e);
        }
            
    }
    
       public void Checkout(){
          
             Drinks d = new Drinks(coke,dietcoke,sprite,fanta,cokezero);
                 Logic.food.add(d);
                 
               Logic.price();
        Logic.Write(Logic.food);
        
       l1.setText("File generated = "+"receipt_no_"+lx);
    
           }
        
        
       
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
