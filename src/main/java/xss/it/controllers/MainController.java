package xss.it.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import xss.it.Assets;
import xss.it.entity.Person;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author XDSSWAR
 * Created on 09/05/2023
 */
public class MainController implements Initializable {
    /**
     * Main stage
     */
    private final Stage stage;


    /**
     * Declares a private field 'showPersonBtn' of type 'Button' and associates it with a graphical element defined in an FXML file.
     * In this case, 'showPersonBtn' represents a Button element defined in the FXML file.
     */
    @FXML
    private Button showPersonBtn;

    /**
     * Initializes a new instance of the MainController with the given Stage.
     *
     * @param stage The JavaFX Stage associated with this controller.
     */
    public MainController(Stage stage) {
        // This constructor initializes a MainController instance with the provided Stage.
        this.stage = stage;
    }


    /**
     * Initializes the JavaFX controller when the associated FXML file is loaded.
     *
     * @param location   The URL of the FXML file.
     * @param resources  The ResourceBundle containing locale-specific resources.
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // This method is called by the JavaFX framework when the associated FXML file is loaded.
        // You can add initialization logic here to configure UI elements or set up event handlers.


        /*
         * Add the listener to the button to display the person
         */
        showPersonBtn.setOnAction(event -> {
            try {
                handleShowPerson();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }



    /**
     * Handles the action of showing a person's information in a new JavaFX stage.
     * This method creates a new stage and loads an FXML controller to display person information.
     *
     * @throws IOException If an I/O error occurs during FXML loading.
     */
    private void handleShowPerson() throws IOException {
        // Create a new JavaFX Stage for displaying the person's information.
        Stage childStage = new Stage();
        childStage.setTitle("Example of passing parameters to an FXML controller");

        // Set the main stage (this.stage) as the owner of the child stage.
        // This means the child stage is modal to the main stage.
        childStage.initOwner(this.stage);

        // Set the modality of the child stage to APPLICATION_MODAL.
        childStage.initModality(Modality.APPLICATION_MODAL);

        // Disable resizing of the child stage.
        childStage.setResizable(false);

        // Create a Person object to display in the child stage.
        Person person = createPerson();

        // Load the "display.fxml" FXML file with a new DisplayController, passing the Person object.
        Parent child = Assets.load("/xss/it/fxml/display.fxml", new DisplayController(person));

        // Create a new Scene for the child stage using the loaded FXML content.
        Scene scene = new Scene(child);

        // Set the created Scene as the content of the child stage.
        childStage.setScene(scene);

        // Show the child stage to display the person's information.
        childStage.show();
    }



    /**
     * Creates and returns a new DUMMY Person object with default values.
     *
     * @return A new Person object with the name "Name," age 30, and weight 80.
     */
    private Person createPerson(){
        return new Person("Name", 30, 80);
    }

}
