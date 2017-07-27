/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxml.let.user.ask.question;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

/**
 *
 * @author Paopao
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Text actiontarget;
    
    @FXML
    private void handleSubmitButtonAction(ActionEvent event) {
        
        int n;
        n = randomWithRange(1, 5);
        switch (n) {
            case 0:
                actiontarget.setText("You tell me!");
                break;
            case 1:
                actiontarget.setText("I don't know!");
                break;
            case 2:
                actiontarget.setText("Perhaps!");
                break;
            case 3:
                actiontarget.setText("It seems like!");
                break;
            case 4:
                actiontarget.setText("Ask again!");
                break;
        }
        //Random rand;
        //rand = new Random();
        //actiontarget.setText(String.valueOf(rand.nextInt((5-1)+1)));
              
        
    }
    
    static int randomWithRange(int min, int max) {
        Random r = new Random();
        
        return r.nextInt((5-1)+1);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
