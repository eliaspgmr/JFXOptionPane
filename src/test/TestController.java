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

        boolean value = op.showConfirmDialog("Elias Ferreira!");
        System.out.println(value);
    }

    @FXML
    public void buttonInputAction() {

         String name = op.showInputDialog("Seu nome?");
         System.out.println(name);

    }
}
