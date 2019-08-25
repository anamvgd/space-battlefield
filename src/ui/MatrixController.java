package ui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class MatrixController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> rowA;

    @FXML
    private ComboBox<String> columnA;

    @FXML
    private ComboBox<String> rowB;

    @FXML
    private ComboBox<String> columnB;


    @FXML
    private CheckBox repeatNumbers;

    @FXML
    private Button generateMatrix;

    @FXML
    private Button genearteList;

    @FXML
    private TextField matrixList;

    @FXML
    void generateList(ActionEvent event) {

    }

    @FXML
    void generateMatrix(ActionEvent event) {

    }

    @FXML
    void initialize() {
    	rowA.getItems().addAll("1", "2", "3", "4", "5");
    	columnA.getItems().addAll("1", "2", "3", "4", "5");
    	rowB.getItems().addAll("1", "2", "3", "4", "5");
    	columnB.getItems().addAll("1", "2", "3", "4", "5");
    }
    
}

