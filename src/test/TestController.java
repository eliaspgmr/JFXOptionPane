package test;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import jfxOptionPane.application.JFXOptionPane;



public class TestController {

    @FXML JFXButton buttonMessage = new JFXButton();
    @FXML JFXButton buttonError = new JFXButton();
    @FXML JFXButton buttonConfirm = new JFXButton();
    @FXML JFXButton buttonInput = new JFXButton();
    JFXOptionPane op = new JFXOptionPane(TestMain.getStage());

    @FXML
    public void buttonMessageAction() {

        op.showMessageDialog("Message", "Elias Ferreira da Silva!");

    }

    @FXML
    public void buttonErrorAction() {

        op.showErrorDialog("Error", "Elias da Silva!");

    }

    @FXML
    public void buttonConfirmAction() {

        op.showConfirmDialog("Confirm", "Elias Ferreira!");

    }

    @FXML
    public void buttonInputAction() {

        op.showInputDialog("Input", "Seu nome?");

    }
}
