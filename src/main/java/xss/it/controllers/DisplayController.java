package xss.it.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import xss.it.entity.Person;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author XDSSWAR
 * Created on 09/05/2023
 */
public class DisplayController implements Initializable {
    /**
     * Represents a JavaFX Label element used to display the age of a person.
     * The '@FXML' annotation indicates that this field is associated with an FXML element.
     */
    @FXML
    private Label ageLabel;

    /**
     * Represents a JavaFX Label element used to display the name of a person.
     * The '@FXML' annotation indicates that this field is associated with an FXML element.
     */
    @FXML
    private Label nameLabel;

    /**
     * Represents a JavaFX Label element used to display the weight of a person.
     * The '@FXML' annotation indicates that this field is associated with an FXML element.
     */
    @FXML
    private Label weightLabel;

    /**
     * Represents a controller for displaying information about a person.
     * The information about the person is provided via the constructor.
     */
    private final Person person;

    /**
     * Initializes the DisplayController with the provided Person object.
     * This constructor is typically used to pass data to the controller.
     *
     * @param person The Person object containing information about the person to display.
     */
    public DisplayController(Person person) {
        // Initialize the DisplayController with the provided Person object.
        // This allows the controller to access and display information about the person.
        this.person = person;
    }

    /**
     * Called by the JavaFX framework after the FXML file is loaded and the controller is constructed.
     * This method is often used for performing initialization tasks.
     *
     * @param location  The URL of the FXML file.
     * @param resources A ResourceBundle containing locale-specific resources (unused in this case).
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // This method is called automatically by JavaFX after the FXML file is loaded.
        // You can use it for initializing UI components or performing other setup tasks.
        // In this case, since it's empty, no specific initialization is performed here.

        // Check if the 'person' object is not null before updating the labels.
        if (person != null) {
            // Update the 'nameLabel' with the person's name.
            nameLabel.setText(String.format("Person name: %s.", person.getName()));

            // Update the 'ageLabel' with the person's age.
            ageLabel.setText(String.format("Person age: %s year(s) old.", person.getAge()));

            // Update the 'weightLabel' with the person's weight.
            weightLabel.setText(String.format("Person weight: %s Kg", person.getWeight()));
        }

    }

}
