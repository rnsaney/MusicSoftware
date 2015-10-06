package richcode.music.counterpoint.ui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.*;

public class CounterpointTeacher extends Application
{
    @Override
    public void start(Stage primaryStage) 
    {
        primaryStage.setTitle("JavaFX Counterpoint Application");
        
        /*
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        */
        
        Parent root = FXMLLoader.load(getClass().getResource("fxml-Counterpoint.fxml"));
        
        Scene scene = new Scene(root, 300, 275);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) 
    {
        Application.launch(args);
    }
}