package sample.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;
import sample.application.JFXOptionPane;
import java.net.URL;
import java.util.ResourceBundle;

public class MessageController implements Initializable {

    @FXML private Text textContent = new Text();



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        textContent.setText(JFXOptionPane.getMessage());
    }
}
