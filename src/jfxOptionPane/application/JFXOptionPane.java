package jfxOptionPane.application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.stage.Modality;

public class JFXOptionPane {


    //Global Variables
    private Stage stage;
    private Parent root;
    private static String message;

    //Constructor
    public JFXOptionPane(Stage stageOwner) {

        stage = new Stage();
        stage.initOwner(stageOwner);
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);

    }

    //method to show an message
    public void showMessageDialog(String title, String message) {

        this.message = message;
        try {
            root = FXMLLoader.load(getClass().getResource("../view/MessageView.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.setTitle(title);
        stage.setScene(new Scene(root));
        stage.show();

    }

    //method to show an error
    public void showErrorDialog(String title, String message) {

        this.message = message;
        try {
            root = FXMLLoader.load(getClass().getResource("../view/ErrorView.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.setTitle(title);
        stage.setScene(new Scene(root));
        stage.show();

    }

    //method to show an confirm box
    public void showConfirmDialog(String title, String message) {

        this.message = message;
        try {
            root = FXMLLoader.load(getClass().getResource("../view/ConfirmView.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.setTitle(title);
        stage.setScene(new Scene(root));
        stage.show();

    }

    //method to show an input box
    public void showInputDialog(String title, String message) {

        this.message = message;
        try {
            root = FXMLLoader.load(getClass().getResource("../view/InputView.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.setTitle(title);
        stage.setScene(new Scene(root));
        stage.show();

    }

    //returns a message variable
    public static String getMessage(){
        return message;
    }


}
