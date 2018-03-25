/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Food;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author yessi
 */
public class FoodController {
    FoodModel foodModel; 
    FoodView foodView;

    public FoodController(FoodModel foodModel, FoodView foodView) 
    {
        this.foodModel = foodModel;
        this.foodView = foodView;
        setupHandlers();
    }
    
    public void setupHandlers()
    {
       foodView.getUpdateButton().setOnAction(new EventHandler<ActionEvent> ()
       {
           @Override
           public void handle(ActionEvent event) {
           //
           //view gave me name
           String name = getsearchname();
           
           //name gave me data
           String ImageName = getsearchimagename(name);
           int group = getsearchfoodgroup(name);
           int serving = getsearchserving(name);
           int calories = getsearchcalories(name);
           int totalFat = getsearchtotalfat(name);
           int cholesterol = getsearchcholesterol(name);
           double sodium = getsearchsodium(name);
           double potassium = getsearchpotassium(name);
           int carbohydrates = getsearchcarbohydrates(name);
           int proteins = getsearchproteins(name);
           
           
           /*
           foodGroup;
           */
           
           //data updates the view
            //foodView.setImageName(ImageName);
            try{
                Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","1398");
                Statement myStat = myConn.createStatement();
                ResultSet myRs = myStat.executeQuery("SELECT * FROM vaqnutri.food_groups WHERE id = " + group + ";");
                while(myRs.next()){
                    foodView.getGroupText().setText(myRs.getString("name"));
                }
                myRs.close();
                myStat.close();
                myConn.close();
            }catch(SQLException e){ e.printStackTrace();};
            foodView.getServingText().setText(Integer.toString(serving));
            foodView.getCaloriesText().setText(Integer.toString(calories));
            foodView.getTotalFatText().setText(Integer.toString(totalFat));
            foodView.getCholesterolText().setText(Integer.toString(cholesterol));
            foodView.getSodiumText().setText(Double.toString(sodium));
            foodView.getPotassiumText().setText(Double.toString(potassium));
            foodView.getCarbohydratesText().setText(Integer.toString(carbohydrates));
            foodView.getProteinsText().setText(Integer.toString(proteins));
            //
            foodView.updateFoodView();
           }
       });
        
    }
    
    public String getsearchname()
    {
       String name = foodView.getNameText().getText();
       return name;
    }
    
    public String getsearchimagename(String name)
    {
       String ImageName = foodModel.getImageName(name);
       return ImageName;
    }
    
    public int getsearchfoodgroup(String name)
    {
       int group = foodModel.getFoodGroup(name);
       return group;
    }
    
    public int getsearchserving(String name)
    {
       int serving = foodModel.getServing(name);
       return serving;
    }
    
    public int getsearchcalories(String name)
    {
       int calories = foodModel.getCalories(name);
       return calories;
    }
    
    public int getsearchtotalfat(String name)
    {
       int totalFat = foodModel.getTotalFat(name);
       return totalFat;
    }
    
    public int getsearchcholesterol(String name)
    {
       int cholesterol = foodModel.getCholesterol(name);
       return cholesterol;
    }
    
    public double getsearchsodium(String name)
    {
       double sodium = foodModel.getSodium(name);
       return sodium;
    }
    
    public double getsearchpotassium(String name)
    {
       double potassium = foodModel.getPotassium(name);
       return potassium;
    }
    
    public int getsearchcarbohydrates(String name)
    {
       int carbohydrates = foodModel.getCarbohydrates(name);
       return carbohydrates;
    }
    
    public int getsearchproteins(String name)
    {
       int proteins = foodModel.getProteins(name);
       return proteins;
    }
    
}
