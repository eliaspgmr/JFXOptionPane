package sample;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import sample.application.JFXOptionPane;


public class Controller {

    @FXML
    JFXButton btOpenOne = new JFXButton();

    @FXML
    public void openOne() throws Exception {
        //System.out.println("Elias");

        JFXOptionPane op = new JFXOptionPane(Main.getStage());
        op.showMessageDialog("Message","Elias Ferreira");



    }


}
