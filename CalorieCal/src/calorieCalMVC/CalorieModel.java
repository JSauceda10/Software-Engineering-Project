/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calorieCalMVC;

import Database.Database;
import calCalUtilities.Category;
import calCalUtilities.Nutrient;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;

/**
 *
 * @author xwc981
 */
public class CalorieModel {
    //
    //The basic food groups are:
    //breads, cereals, rice, pasta, noodles and other grains
    //vegetables and legumes
    //fruit
    //milk, yoghurt, cheese and/or alternatives
    //lean meat, fish, poultry, eggs, nuts and legumes.

    Database myDatabase = Database.getSingletonOfDatabase();
    Statement myStat = Database.getStatement();
    private ObservableList<Category> foodCategories   = FXCollections.observableArrayList();
    private ObservableList<Nutrient> foodNutrients    = FXCollections.observableArrayList();
    private ObservableList<Nutrient> userPlate        = FXCollections.observableArrayList();

    public CalorieModel() {
        // hard-coded for testing
        foodNutrients.clear();
    }

    public void addNutrientToPlate(Nutrient n) {
        // add only unique items..
        int found = getPlate().indexOf(n);
        if (getPlate().indexOf(n) != -1) 
        {
            // warn and return
            return;
        }
        else
            getPlate().add(n);
    }

    ObservableList<Nutrient> getCategoryChoices(Category selectedCat) {
        // get the nutrients from database based on the cat selected
        //GRAINS
        if (selectedCat.getName().equalsIgnoreCase("Grains-Breads")) {
            getMyNutrients().clear();
            try{
                ResultSet myRs = myStat.executeQuery("SELECT * FROM vaqnutri.foods_data WHERE category = 2;");
                    while(myRs.next()){
                        getMyNutrients().add(new Nutrient(myRs.getString("image"), myRs.getString("food"), "Grains-Breads", myRs.getString("category"),
                                          "grams", Double.parseDouble(myRs.getString("calories")),
                                          Double.parseDouble(myRs.getString("serving size")), Double.parseDouble(myRs.getString("fats")), Double.parseDouble(myRs.getString("cholesterol")), 
                                          Double.parseDouble(myRs.getString("sodium")), Double.parseDouble(myRs.getString("potassium")), Double.parseDouble(myRs.getString("carbohydrates")), 
                                          Double.parseDouble(myRs.getString("proteins"))));
                    }
                    myRs.close();
            } catch (SQLException exc) {
                    exc.printStackTrace();
            }
            System.out.println("Uploaded Grains-Breads Category");
        //VEGTABLES       
        } else if (selectedCat.getName().equalsIgnoreCase("Vegetables")) {
            getMyNutrients().clear();
            try{
                ResultSet myRs = myStat.executeQuery("SELECT * FROM vaqnutri.foods_data WHERE category = 1;");
                    while(myRs.next()){
                        getMyNutrients().add(new Nutrient(myRs.getString("image"), myRs.getString("food"), "Vegetables", myRs.getString("category"),
                                          "grams", Double.parseDouble(myRs.getString("calories")),
                                          Double.parseDouble(myRs.getString("serving size")), Double.parseDouble(myRs.getString("fats")), Double.parseDouble(myRs.getString("cholesterol")), 
                                          Double.parseDouble(myRs.getString("sodium")), Double.parseDouble(myRs.getString("potassium")), Double.parseDouble(myRs.getString("carbohydrates")), 
                                          Double.parseDouble(myRs.getString("proteins"))));
                    }
                    myRs.close();
            } catch (SQLException exc) {
                    exc.printStackTrace();
            }
            System.out.println("Uploaded Vegetables Category");
        //FRUITS    
        } else if (selectedCat.getName().equalsIgnoreCase("Fruits")) {
            getMyNutrients().clear();
            try{
                ResultSet myRs = myStat.executeQuery("SELECT * FROM vaqnutri.foods_data WHERE category = 3;");
                    while(myRs.next()){
                        getMyNutrients().add(new Nutrient(myRs.getString("image"), myRs.getString("food"), "Fruits", myRs.getString("category"),
                                          "grams", Double.parseDouble(myRs.getString("calories")),
                                          Double.parseDouble(myRs.getString("serving size")), Double.parseDouble(myRs.getString("fats")), Double.parseDouble(myRs.getString("cholesterol")), 
                                          Double.parseDouble(myRs.getString("sodium")), Double.parseDouble(myRs.getString("potassium")), Double.parseDouble(myRs.getString("carbohydrates")), 
                                          Double.parseDouble(myRs.getString("proteins"))));
                    }
                    myRs.close();
            } catch (SQLException exc) {
                    exc.printStackTrace();
            }
            System.out.println("Uploaded Fruits Category");
        //OIL AND SWEETS
        } else if (selectedCat.getName().equalsIgnoreCase("Oils and Sweets")){
            getMyNutrients().clear();
            try{
                ResultSet myRs = myStat.executeQuery("SELECT * FROM vaqnutri.foods_data WHERE category = 4;");
                    while(myRs.next()){
                        getMyNutrients().add(new Nutrient(myRs.getString("image"), myRs.getString("food"), "Oils and Sweets", myRs.getString("category"),
                                          "grams", Double.parseDouble(myRs.getString("calories")),
                                          Double.parseDouble(myRs.getString("serving size")), Double.parseDouble(myRs.getString("fats")), Double.parseDouble(myRs.getString("cholesterol")), 
                                          Double.parseDouble(myRs.getString("sodium")), Double.parseDouble(myRs.getString("potassium")), Double.parseDouble(myRs.getString("carbohydrates")), 
                                          Double.parseDouble(myRs.getString("proteins"))));
                    }
                    myRs.close();
            } catch (SQLException exc) {
                    exc.printStackTrace();
            }
            System.out.println("Uploaded Oils and Sweets Category");
        //DAIRY    
        } else if (selectedCat.getName().equalsIgnoreCase("Dairy")) {
            getMyNutrients().clear();
            try{
                ResultSet myRs = myStat.executeQuery("SELECT * FROM vaqnutri.foods_data WHERE category = 5;");
                    while(myRs.next()){
                        getMyNutrients().add(new Nutrient(myRs.getString("image"), myRs.getString("food"), "Dairy", myRs.getString("category"),
                                          "grams", Double.parseDouble(myRs.getString("calories")),
                                          Double.parseDouble(myRs.getString("serving size")), Double.parseDouble(myRs.getString("fats")), Double.parseDouble(myRs.getString("cholesterol")), 
                                          Double.parseDouble(myRs.getString("sodium")), Double.parseDouble(myRs.getString("potassium")), Double.parseDouble(myRs.getString("carbohydrates")), 
                                          Double.parseDouble(myRs.getString("proteins"))));
                    }
                    myRs.close();
            } catch (SQLException exc) {
                    exc.printStackTrace();
            }
            System.out.println("Uploaded Dairy Category");
        //MEATS    
        } else if (selectedCat.getName().equalsIgnoreCase("Meats")) {
            getMyNutrients().clear();
            try{
                ResultSet myRs = myStat.executeQuery("SELECT * FROM vaqnutri.foods_data WHERE category = 6;");
                    while(myRs.next()){
                        getMyNutrients().add(new Nutrient(myRs.getString("image"), myRs.getString("food"), "Meats", myRs.getString("category"),
                                          "grams", Double.parseDouble(myRs.getString("calories")),
                                          Double.parseDouble(myRs.getString("serving size")), Double.parseDouble(myRs.getString("fats")), Double.parseDouble(myRs.getString("cholesterol")), 
                                          Double.parseDouble(myRs.getString("sodium")), Double.parseDouble(myRs.getString("potassium")), Double.parseDouble(myRs.getString("carbohydrates")), 
                                          Double.parseDouble(myRs.getString("proteins"))));
                    }
                    myRs.close();
            } catch (SQLException exc) {
                    exc.printStackTrace();
            }
            System.out.println("Uploaded Meats Category");
        //VITAMINS    
        }
        return (this.getMyNutrients());
    }

    public void removeNutrientFromPlate(Nutrient n) {
        int found = getPlate().indexOf(n);
        if (getPlate().indexOf(n) != -1) {
            getPlate().remove(found);
        }
        for (int i = 0; i < getPlate().size(); i++) 
        {
            if (n.getName().compareToIgnoreCase(getPlate().get(i).getName())==0)
            {
                getPlate().remove(i);
            }    
        }
    }

    public void removeAllNutrientsFromPlate() {
        getPlate().clear();
    }

    public ObservableList<PieChart.Data> getPlateData(boolean catFlag) {
        //
        //cat flag arraanges nutrients by categories
        ObservableList<PieChart.Data> pieChartData1  = FXCollections.observableArrayList();
        ObservableList<PieChart.Data> pieChartData2  = FXCollections.observableArrayList();
        
        ObservableList<Category> foodCategories  = RetrieveFoodCategories();
        
        if(getPlate() != null && getPlate().size()!=0)
        {
            FXCollections.sort(getPlate());
            if (catFlag ==false)
            {
                for (int i = 0; i < getPlate().size(); i++) {
                    pieChartData1.add(new PieChart.Data(getPlate().get(i).getName(), getPlate().get(i).getActualCalories()));
                }
                return pieChartData1;
            }
            else
            {
                // inefficient..switch to hashing once working...
                for (int i = 0; i < getPlate().size(); i++) 
                {
                    String cat = getPlate().get(i).getCategory();
                    for (int j = 0; j < foodCategories.size(); j++) {
                        if(foodCategories.get(j).getName().compareTo(cat)==0)
                        {
                            foodCategories.get(j).setCategoriyCalories
                                    ((int) (foodCategories.get(j).getCategoriyCalories()+getPlate().get(i).getActualCalories()));
                        }
                             
                    }
                       
                }
                //
                for (int i = 0; i < foodCategories.size(); i++) 
               {  
                   pieChartData2.add(new PieChart.Data(foodCategories.get(i).getName(), foodCategories.get(i).getCategoriyCalories()));
               }  
                return pieChartData2;
            }
            
        }
        return null;
    }

    public ObservableList<Category> RetrieveFoodCategories() {
        foodCategories.clear();

        // Get & populate from database
        foodCategories.add(new Category("2", "Grains-Breads",0));
        foodCategories.add(new Category("1", "Vegetables",0));
        foodCategories.add(new Category("3", "Fruits",0));
        foodCategories.add( new Category("4","Oils and Sweets",0));
        foodCategories.add(new Category("5", "Dairy",0));
        foodCategories.add(new Category("6", "Meats",0));
        foodCategories.add(new Category("7", "Vitamins",0));
        return foodCategories;
    }

    /**
     * @return the myCategories
     */
    public ObservableList<Category> getMyCategories() {
        return RetrieveFoodCategories();
    }

    /**
     * @param myCategories the myCategories to set
     */
    public void setMyCategories(ObservableList<Category> myCategories) {
        this.foodCategories = myCategories;
    }

    Nutrient gerNutrientChoices(Nutrient n1) {
        return n1;
    }

    /**
     * @return the plate
     */
    public ObservableList<Nutrient> getPlate() {
        return userPlate;
    }

    /**
     * @param plate the plate to set
     */
    public void setPlate(ObservableList<Nutrient> plate) {
        this.userPlate = plate;
    }

    /**
     * @return the myNutrients
     */
    public ObservableList<Nutrient> getMyNutrients() {
        return foodNutrients;
    }

    /**
     * @param myNutrients the myNutrients to set
     */
    public void setMyNutrients(ObservableList<Nutrient> myNutrients) {
        this.foodNutrients = myNutrients;
    }

}
