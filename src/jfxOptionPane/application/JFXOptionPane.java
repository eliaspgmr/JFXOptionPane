package jfxOptionPane.application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.stage.Modality;
import jfxOptionPane.model.Dados;

public class JFXOptionPane {

/*---------------header------------------------------------------*/
    //Global Variables
    private static Stage stage;
    private Parent root;

    public static Stage getStage() {
        return stage;
    }

    //Constructor
    public JFXOptionPane(Stage stageOwner) {

        stage = new Stage();
        stage.initOwner(stageOwner);
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);

    }

    //Constructor without owner
    public JFXOptionPane() {

        stage = new Stage();
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);

    }
/*---------------end-header------------------------------------------*/

    /*----------------MESSAGE------------------------------------------*/
    //method to show an message
    public void showMessageDialog(String title, String message) {

        Dados.restart();
        Dados.setMessage(message);
        try {
            root = FXMLLoader.load(getClass().getResource("../view/MessageView.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.setTitle(title);
        stage.setScene(new Scene(root));
        stage.showAndWait();

    }
    //method to show an message without title
    public void showMessageDialog(String message) {

        Dados.restart();
        Dados.setMessage(message);
        try {
            root = FXMLLoader.load(getClass().getResource("../view/MessageView.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.setTitle("Message!");
        stage.setScene(new Scene(root));
        stage.showAndWait();

    }
    /*----------------ERROR------------------------------------------*/
    //method to show an error
    public void showErrorDialog(String title, String message) {

        Dados.restart();
        Dados.setMessage(message);

        try {
            root = FXMLLoader.load(getClass().getResource("../view/ErrorView.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        stage.setTitle(title);
        stage.setScene(new Scene(root));
        stage.showAndWait();

    }
    //method to show an error without title
    public void showErrorDialog(String message) {

        Dados.restart();
        Dados.setMessage(message);

        try {
            root = FXMLLoader.load(getClass().getResource("../view/ErrorView.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        stage.setTitle("Error!");
        stage.setScene(new Scene(root));
        stage.showAndWait();

    }
    /*----------------CONFIRM------------------------------------------*/
    //method to show an confirm box
    public boolean showConfirmDialog(String title, String message) {

        Dados.restart();
        Dados.setMessage(message);

        try {
            root = FXMLLoader.load(getClass().getResource("../view/ConfirmView.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        stage.setTitle(title);
        stage.setScene(new Scene(root));
        stage.showAndWait();

        return Dados.isConfirmValue();
    }
    //method to show an confirm box without title
    public boolean showConfirmDialog(String message) {

        Dados.restart();
        Dados.setMessage(message);

        try {
            root = FXMLLoader.load(getClass().getResource("../view/ConfirmView.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        stage.setTitle("Confirm?");
        stage.setScene(new Scene(root));
        stage.showAndWait();

        return Dados.isConfirmValue();
    }

    /*----------------INPUT------------------------------------------*/
    //method to show an input box
    public String showInputDialog(String title, String message) {

        Dados.restart();
        Dados.setMessage(message);

        try {
            root = FXMLLoader.load(getClass().getResource("../view/InputView.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        stage.setTitle(title);
        stage.setScene(new Scene(root));
        stage.showAndWait();

        return Dados.getInputMessage();

    }
    //method to show an input box without title
    public String showInputDialog(String message) {

        Dados.restart();
        Dados.setMessage(message);

        try {
            root = FXMLLoader.load(getClass().getResource("../view/InputView.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        stage.setTitle("Input answer?");
        stage.setScene(new Scene(root));
        stage.showAndWait();

        return Dados.getInputMessage();

    }


}
