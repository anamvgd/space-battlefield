package ui;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
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
    private GridPane oldMatrix;

    @FXML
    private GridPane encriptMatrix;

    @FXML
    private GridPane newMatrix;

    @FXML
    void generateList(ActionEvent event) {

    }

    @FXML
    void generateMatrix(ActionEvent event) {
    	
    	
    	
    	Battlefield matrixA = new Battlefield(Integer.parseInt(rowA.getValue()), Integer.parseInt(columnA.getValue()));
    	matrixA.setBattlefield(matrixA.fillPositions(Integer.parseInt(rowA.getValue()),Integer.parseInt(columnA.getValue())));
    	fields.add(matrixA);
    	
    	Battlefield matrixB = new Battlefield(Integer.parseInt(rowB.getValue()), Integer.parseInt(columnB.getValue()));
    	matrixB.setBattlefield(matrixB.fillCoefficients(Integer.parseInt(rowB.getValue()),Integer.parseInt(columnB.getValue())));
    	fields.add(matrixB);
    	oldMatrix.getChildren().clear();
    	
    	multiplyMatrix();
    	

    		oldMatrix.getChildren().clear();
    		oldMatrix.setAlignment(Pos.CENTER);
    		printOld();
    		encriptMatrix.getChildren().clear();
    		encriptMatrix.setAlignment(Pos.CENTER);
    		printEncript();
    		newMatrix.getChildren().clear();
    		newMatrix.setAlignment(Pos.CENTER);
    		printNew();
        	
    	}
    
    @FXML
    public void printOld() {
    	for(int i=0; i<fields.get(0).getRows(); i++) {
			
			for(int j=0; j<fields.get(0).getColumns(); j++) {
				Button numbers = new Button(Integer.toString(fields.get(0).getBattlefield()[i][j]));
				numbers.setVisible(true);
				numbers.setMinWidth(oldMatrix.getPrefWidth()); //-
				numbers.setMinWidth(oldMatrix.getPrefWidth());
				numbers.setBackground(new Background(new BackgroundImage(new Image("ui/nave.png"),BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.DEFAULT,new BackgroundSize(numbers.getWidth(), numbers.getHeight(), true, true, true, true))));

				oldMatrix.add(numbers, j, i);
				numbers.addEventHandler(MouseEvent.MOUSE_ENTERED, 
				new EventHandler<MouseEvent>() {
					@Override public void handle(MouseEvent e) {
						numbers.setStyle("-fx-font: 22 arial; -fx-base: #b6e7c9;");
		    	   	}
		    	});
			}
		}
    }
    
    @FXML
    public void printEncript() {
    	for(int i=0; i<fields.get(1).getRows(); i++) {
			
			for(int j=0; j<fields.get(1).getColumns(); j++) {
				Button numbers = new Button(Integer.toString(fields.get(1).getBattlefield()[i][j]));
				numbers.setVisible(true);
				numbers.setMinWidth(encriptMatrix.getPrefWidth()); //-
				numbers.setMinWidth(encriptMatrix.getPrefWidth()); //
				encriptMatrix.add(numbers, j, i);
				numbers.addEventHandler(MouseEvent.MOUSE_ENTERED, 
				new EventHandler<MouseEvent>() {
					@Override public void handle(MouseEvent e) {
						numbers.setStyle("-fx-font: 22 arial; -fx-base: #b6e7c9;");
		    	   	}
		    	});
			}
		}
    }
    
    void printNew() {
    	for(int i=0; i<fields.get(2).getRows(); i++) {
			
			for(int j=0; j<fields.get(2).getColumns(); j++) {
				Button numbers = new Button(Integer.toString(fields.get(2).getBattlefield()[i][j]));
				numbers.setVisible(true);
				numbers.setMinWidth(newMatrix.getPrefWidth()); //-
				numbers.setMinHeight(newMatrix.getPrefHeight()); //
				newMatrix.add(numbers, j, i);
				numbers.addEventHandler(MouseEvent.MOUSE_ENTERED, 
				new EventHandler<MouseEvent>() {
					@Override public void handle(MouseEvent e) {
						numbers.setStyle("-fx-font: 22 arial; -fx-base: #b6e7c9;");
		    	   	}
		    	});
			}
		}
    }

    @FXML
    void multiplyMatrix() {
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
    	 matrixResultado.setBattlefield(multiplicacion);
    	 fields.add(matrixResultado);
    }
    
    @FXML
    void initialize() {
    	rowA.getItems().addAll("1", "2", "3", "4", "5");
    	columnA.getItems().addAll("1", "2", "3", "4", "5");
    	rowB.getItems().addAll("1", "2", "3", "4", "5");
    	columnB.getItems().addAll("1", "2", "3", "4", "5");
    	
    	fields = new ArrayList<Battlefield>();
    	oldMatrix.setVisible(true);
    }
    
}
