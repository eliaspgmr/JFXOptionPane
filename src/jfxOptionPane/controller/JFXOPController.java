package jfxOptionPane.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;
import jfxOptionPane.application.JFXOptionPane;
import jfxOptionPane.model.Dados;
import java.net.URL;
import java.util.ResourceBundle;

public class JFXOPController implements Initializable {

    //Nodes
    @FXML private Text textContent = new Text();
    @FXML private JFXButton btOkMessage = new JFXButton();
    @FXML private JFXButton btOkError = new JFXButton();
    @FXML private JFXButton btCancelInput = new JFXButton();
    @FXML private JFXButton btOkInput = new JFXButton();
    @FXML private JFXTextField inputTextField = new JFXTextField();
    @FXML private JFXButton btNoConfirm = new JFXButton();
    @FXML private JFXButton btYesConfirm = new JFXButton();


    @FXML //Function Close
    public void closeAction () {
        JFXOptionPane.getStage().close();
    }

    @FXML //Function close and Update the dados to the null value
    public void closeAndRestartAction () {
        this.closeAction();
        Dados.restart();
    }

    @FXML //Function to yes choosed option
    public void yesConfirmAction () {
        Dados.setConfirmValue(true);
        this.closeAction();
    }

    @FXML //Function to input text
    public void inputAction () {
        if((inputTextField.getText()).equals("")) {
            Dados.setInputMessage(null);
            this.closeAction();
        } else {
            Dados.setInputMessage(inputTextField.getText());
            this.closeAction();
        }

    }

    @Override //Method Start of the Controller
    public void initialize(URL location, ResourceBundle resources) {
        textContent.setText(Dados.getMessage());
    }

}
