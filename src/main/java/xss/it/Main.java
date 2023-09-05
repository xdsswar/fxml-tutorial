package xss.it;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import xss.it.controllers.MainController;

import java.io.IOException;

/**
 * @author XDSSWAR
 * Created on 09/05/2023
 */
public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }



    /**
     * The main entry point of the JavaFX application.
     * This method is automatically called when the application is launched.
     *
     * @param stage The primary stage representing the main application window.
     * @throws IOException If an I/O error occurs during FXML loading.
     */
    @Override
    public void start(Stage stage) throws IOException {
        // Set the title for the JavaFX Stage.
        stage.setTitle("Loading fxml and passing controllers programmatically.");

        // Create an instance of MainController and pass the Stage as a parameter.
        //We will use that stage later from the MainController
        MainController mainController = new MainController(stage);

        // Load the main FXML file and associate it with the MainController.
        Parent parent = Assets.load("/xss/it/fxml/main.fxml", mainController);

        // Create a new Scene using the loaded FXML content.
        Scene scene = new Scene(parent);

        // Set the created Scene as the content of the Stage.
        stage.setScene(scene);

        // Show the Stage.
        stage.show();
    }

}
