package xss.it;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.IOException;
import java.net.URL;

/**
 * @author XDSSWAR
 * Created on 09/05/2023
 */
public class Assets {
    /**
     * Loads a resource (e.g., FXML file) from the classpath.
     *
     * @param location The location of the resource to load.
     * @return A URL object representing the resource, or null if the resource was not found.
     */
    public static URL load(String location) {
        // Use the class's getResource method to load a resource from the classpath.
        // The location is a relative path to the resource.
        // Returns a URL object that represents the resource if found, otherwise returns null.
        return Assets.class.getResource(location);
    }

    /**
     * Loads an FXML file and initializes it with a controller if provided.
     *
     * @param location   The location of the FXML file to load.
     * @param controller An optional controller object to initialize the FXML with.
     * @return The root JavaFX Parent node of the loaded FXML.
     * @throws IOException If an I/O error occurs during FXML loading.
     */
    public static Parent load(final String location, Object controller) throws IOException {
        // Create an FXMLLoader instance to load the FXML file.
        FXMLLoader loader = new FXMLLoader(load(location));

        // If a controller object is provided, set it as the controller for the FXML.
        if (controller != null) {
            loader.setController(controller);
        }

        // Load the FXML file and return the root JavaFX Parent node.
        // FXMLLoader.load() reads and initializes the FXML file.
        return loader.load();
    }
}
