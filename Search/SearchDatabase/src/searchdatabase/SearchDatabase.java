/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchdatabase;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import Food.FoodController;
import Food.FoodModel;
import Food.FoodView;
import java.sql.*;

/**
 *
 * @author yessi
 */
public class SearchDatabase extends Application {
    
    private Stage primaryStage;
    private Scene scene;
    
    Connection myConn = null;
    Statement myStat = null;
    ResultSet myRs = null;
    
    @Override
    public void start(Stage primaryStage) {
        FoodView root   = new FoodView();
        FoodModel model = new FoodModel("cheerios.png", "Cheerios" ,1, 28, 100, 2, 0, 0.14, 0.18, 20, 3);
        FoodController foodController = new FoodController(model, root);
        
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setMaximized(true);
        primaryStage.setTitle("Search");
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
