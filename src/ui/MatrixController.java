package ui;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import model.Battlefield;
public class MatrixController {

	private ArrayList<Battlefield> fields;
	
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
    void multiplyMatrix(ActionEvent event) {
    	int fil_m1 = fields.get(0).getRows();
    	int col_m1 = fields.get(0).getColumns();
    	int[][] m1=fields.get(0).getBattlefield(); 
    	
    	int fil_m2 = fields.get(1).getRows();
    	int col_m2 = fields.get(1).getColumns();
    	int[][] m2=fields.get(1).getBattlefield(); 
    	
    	if (col_m1 != fil_m2) {
    		throw new RuntimeException("No se pueden multiplicar las matrices");
    	}
    	Battlefield matrixResultado = new Battlefield(fil_m1, col_m2);
    	int[][] multiplicacion=matrixResultado.getBattlefield();
    	for (int x=0; x < multiplicacion.length; x++) {
    		  for (int y=0; y < multiplicacion[x].length; y++) {
    		    for (int z=0; z<col_m1; z++) {
    		      multiplicacion [x][y] += m1[x][z]*m2[z][y]; 
    		    }
    		  }
    	}
    }
    
    @FXML
    void initialize() {
    	rowA.getItems().addAll("1", "2", "3", "4", "5");
    	columnA.getItems().addAll("1", "2", "3", "4", "5");
    	rowB.getItems().addAll("1", "2", "3", "4", "5");
    	columnB.getItems().addAll("1", "2", "3", "4", "5");
    }
    
}

