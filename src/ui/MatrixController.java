package ui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class MatrixController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField rowA;

    @FXML
    private TextField columnA;

    @FXML
    private TextField rowB;

    @FXML
    private TextField columnB;

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
    	
    }
    
}

