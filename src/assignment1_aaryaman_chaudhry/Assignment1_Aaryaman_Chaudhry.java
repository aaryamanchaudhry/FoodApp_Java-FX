/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1_aaryaman_chaudhry;

import java.io.File;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.AudioClip;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author Aaryaman
 */
public class Assignment1_Aaryaman_Chaudhry extends Application {

    
   static Stage stage1 =  new Stage();
   static Stage stage2 = new Stage();
   static Stage stage3 = new Stage();
   static Stage stage4 = new Stage();
  static Stage stage5 = new Stage();
   
   
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Parent root1 = FXMLLoader.load(getClass().getResource("FXMLFood1.fxml"));
        Parent root2 = FXMLLoader.load(getClass().getResource("FXMLFood2.fxml"));
        Parent root3 = FXMLLoader.load(getClass().getResource("FXMLFood3.fxml"));
        Parent root4 = FXMLLoader.load(getClass().getResource("FXMLReceipt.fxml"));
        Scene scene = new Scene(root);
        Scene scene1 = new Scene(root1);
        Scene scene2 = new Scene(root2);
        Scene scene3 = new Scene(root3);
        Scene scene4 = new Scene(root4);
        
       
       
       stage1.setScene(scene);
       stage2.setScene(scene1);
       stage3.setScene(scene2);
       stage4.setScene(scene3);
       stage5.setScene(scene4);
       
       
        stage1.setMaxWidth(1280);
        stage1.setMaxHeight(720);
        
        
      
        stage2.setMaxWidth(1280);
        stage2.setMaxHeight(720);
        
        
        stage3.setMaxWidth(1280);
        stage3.setMaxHeight(720);
        
        
        stage4.setMaxWidth(1280);
        stage4.setMaxHeight(720);
        
        
        stage5.setMaxWidth(1280);
        stage5.setMaxHeight(720);
      // stage1.setWidth(1280);
      // stage1.setHeight(720);
      
      
      
       //stage2.show();
       //stage3.show();
       //stage4.show();
       stage1.show();
    }
    
    
   public static void show1(){
    stage1.show();
    stage2.hide();
    stage3.hide();
    stage4.hide();
    stage5.hide();
   }
   
   public static void show2(){
   stage2.show();
    stage1.hide();
    stage3.hide();
    stage4.hide();
   stage5.hide();
   }
   
   public static void show3(){
   stage3.show();
    stage1.hide();
    stage2.hide();
    stage4.hide();
   stage5.hide();
   }
   
   public static void show4(){
    stage4.show();
    stage2.hide();
    stage3.hide();
    stage1.hide();
    stage5.hide();
   }
   public static void show5(){
       stage5.show();
    stage4.hide();
    stage2.hide();
    stage3.hide();
    stage1.hide();
   }
   
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        launch(args);
        
        }
    
    


}
