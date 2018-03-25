/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calMain;

import calorieCalMVC.CalorieController;
import calorieCalMVC.CalorieModel;
import calorieCalMVC.CalorieView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author MQ0162246
 */
public class VaqCalCla extends Application {
    
    
    @Override
    public void start(Stage primaryStage) {
	    
	// Get the Calorie Pane
        CalorieView calorieCalculator = new CalorieView();
        CalorieModel model = new CalorieModel();
        CalorieController userController = new CalorieController(model, calorieCalculator);
	
	// set the scene
        Scene scene = new Scene(calorieCalculator, 600, 800);         

	primaryStage.setTitle("VAQ: C A L O R I E  CALC");
        primaryStage.getIcons().addAll(new Image("images/vaq.png"));
        primaryStage.setScene(scene);
        primaryStage.show();
    }
            
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
