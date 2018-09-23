/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1_aaryaman_chaudhry;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.media.AudioClip;
import javafx.scene.media.MediaPlayer;

/**
 *
 * @author Aaryaman
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
  
    
    @FXML
    public void show2(){
    Assignment1_Aaryaman_Chaudhry.show2();
    }
   
    @FXML
    public void show3(){
    Assignment1_Aaryaman_Chaudhry.show3();
    }
    
    @FXML
    public void show4(){
    Assignment1_Aaryaman_Chaudhry.show4();
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         play();
    }    
    public void play() {
  AudioClip myAudio = new AudioClip(this.getClass().getResource("saxophone.wav").toString());
  myAudio.setCycleCount(MediaPlayer.INDEFINITE);
  myAudio.play();
 }
}
