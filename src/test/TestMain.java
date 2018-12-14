package test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestMain extends Application {

    private static Stage stage;
    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("TestView.fxml"));
        stage.setTitle("test");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public static Stage getStage() {
        return stage;
    }
    public static void main(String[] args) {
        launch(args);
    }
}
