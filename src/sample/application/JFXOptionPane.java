package sample.application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.stage.Modality;

public class JFXOptionPane {


    //Global Variables
    private Stage stage;
    private Parent rootMessage;
    private static String message;

    //Constructor
    public JFXOptionPane(Stage stageOwner) throws IOException {
        stage = new Stage();
        stage.initOwner(stageOwner);
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);

    }

    public void showMessageDialog(String title, String message) throws IOException {
        this.message = message;
        rootMessage = FXMLLoader.load(getClass().getResource("../view/MessageView.fxml"));
        stage.setTitle(title);
        stage.setScene(new Scene(rootMessage));
        stage.show();
    }
    public static String getMessage(){
        return message;
    }


}
