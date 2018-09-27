package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import models.DBconnect;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.jar.Attributes;

public class PhonesController implements Initializable {
    @FXML
    private TextField modelTextField;

    @FXML
    private ComboBox<String> makeCombobox;

    @FXML
    private ComboBox<String> oSCombobox;

    @FXML
    private TextField screenSizeTextField;

    @FXML
    private TextField frontCameraTextField;

    @FXML
    private TextField realCameraTextField;

    @FXML
    private TextField priceTextField;

    @FXML
    private Slider memorySilder;

    @FXML
    private ImageView imageView;

    @FXML
    private Button ChooseImageButton;

    /**
     * This method will provide initial values for the view
     *
     * @param location
     * @param resources
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //preload the choice box with valid manufacuctuters
        try {
            makeCombobox.getItems().addAll(DBconnect.getPhoneManufacturers());
        } catch (SQLException e) {
            e.printStackTrace();
        }


            makeCombobox.getSelectionModel().selectedItemProperty().addListener(

                    //this is our custom listener code

                    (observable, oldValue, newValue) -> {

                        oSCombobox.setValue(DBconnect.getOSForManufacturer(newValue));

                    }

            );



    }
}
