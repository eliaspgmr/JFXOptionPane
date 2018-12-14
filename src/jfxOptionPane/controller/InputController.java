package jfxOptionPane.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;
import jfxOptionPane.application.JFXOptionPane;

import java.net.URL;
import java.util.ResourceBundle;

public class InputController implements Initializable {
    @FXML
    private Text textContent = new Text();



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        textContent.setText(JFXOptionPane.getMessage());
    }
}
