package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Main extends Application{
	
       public void start(Stage stage) throws Exception{
       	Parent root= FXMLLoader.load(getClass().getResource("MatrixController.fxml"));
       	
       	Scene scene= new Scene(root);
       	stage.setTitle("Space War");
       	stage.getIcons().add(new Image("ui/spacejet.jpg"));
       	stage.setScene(scene);
       	stage.show();
       }
       public static void main(String [] args) {
       	launch(args);
       }
}

