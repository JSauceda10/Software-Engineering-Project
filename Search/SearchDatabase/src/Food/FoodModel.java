/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Food;

import java.sql.*;
import java.sql.ResultSet;


/**
 *
 * @author yessi
 */
public class FoodModel {


    private String imageName;
    private String foodName;
    private int foodGroup;
    private int serving;
    private int calories;
    private int totalFat;
    private int cholesterol;
    private double sodium;
    private double potassium;
    private int carbohydrates;
    private int proteins;
    
    
    public FoodModel(String imageName, String foodName, int foodGroup, int serving, int calories, int totalFat
                        , int cholesterol, double sodium, double potassium, int carbohydrates, int proteins) {
        this.imageName = imageName;
        this.foodName = foodName;
        this.foodGroup = foodGroup;
        this.serving = serving;
        this.calories = calories;
        this.totalFat = totalFat;
        this.cholesterol = cholesterol;
        this.sodium = sodium;
        this.potassium = potassium;
        this.carbohydrates = carbohydrates;
        this.proteins = proteins;
    }
    
    /**
     * @param n
     * @return the imageName
     */
    public String getImageName(String n) {
        String i = "Not in database";
        try{
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaqnutri?zeroDateTimeBehavior=convertToNull","root","Azure");
            Statement myStat = myConn.createStatement();
            ResultSet myRs = myStat.executeQuery("SELECT * FROM foods WHERE name = \"" + n + "\";");
            while(myRs.next()){
                i = (myRs.getString("image"));
            }
            myRs.close();
            myStat.close();
            myConn.close();
        }catch(SQLException e){ e.printStackTrace();};
        return i;
    }

    /**
     * @param imageName the imageName to set
     */
    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    /**
     * @return the foodName
     */
    public String getFoodName() {
        return foodName;
    }

    /**
     * @param foodName the foodName to set
     */
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    /**
     * @param n
     * @return the foodGroup
     */
    public int getFoodGroup(String n) {
        int i = 0;
        try{
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaqnutri?zeroDateTimeBehavior=convertToNull","root","Azure");
            Statement myStat = myConn.createStatement();
            ResultSet myRs = myStat.executeQuery("SELECT * FROM foods WHERE name = \"" + n + "\";");
            while(myRs.next()){
                i = (myRs.getInt("group"));
            }
            myRs.close();
            myStat.close();
            myConn.close();
        }catch(SQLException e){ e.printStackTrace();};
        return i;
    }

    /**
     * @param foodGroup the foodGroup to set
     */
    public void setFoodGroup(int foodGroup) {
        this.foodGroup = foodGroup;
    }

    /**
     * @param n
     * @return the serving
     */
    public int getServing(String n) {
        int i = 0;
        try{
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaqnutri?zeroDateTimeBehavior=convertToNull","root","Azure");
            Statement myStat = myConn.createStatement();
            ResultSet myRs = myStat.executeQuery("SELECT * FROM foods WHERE name = \"" + n + "\";");
            while(myRs.next()){
                i = (myRs.getInt("serving size"));
            }
            myRs.close();
            myStat.close();
            myConn.close();
        }catch(SQLException e){ e.printStackTrace();};
        return i;
    }

    /**
     * @param serving the serving to set
     */
    public void setServing(int serving) {
        this.serving = serving;
    }

    /**
     * @param n
     * @return the calories
     */
    public int getCalories(String n) {
        int i = 0;
        try{
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaqnutri?zeroDateTimeBehavior=convertToNull","root","Azure");
            Statement myStat = myConn.createStatement();
            ResultSet myRs = myStat.executeQuery("SELECT * FROM foods WHERE name = \"" + n + "\";");
            while(myRs.next()){
                i = (myRs.getInt("calories"));
            }
            myRs.close();
            myStat.close();
            myConn.close();
        }catch(SQLException e){ e.printStackTrace();};
        return i;
    }

    /**
     * @param calories the calories to set
     */
    public void setCalories(int calories) {
        this.calories = calories;
    }

    /**
     * @param n
     * @return the totalFat
     */
    public int getTotalFat(String n) {
        int i = 0;
        try{
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaqnutri?zeroDateTimeBehavior=convertToNull","root","Azure");
            Statement myStat = myConn.createStatement();
            ResultSet myRs = myStat.executeQuery("SELECT * FROM foods WHERE name = \"" + n + "\";");
            while(myRs.next()){
                i = (myRs.getInt("fats"));
            }
            myRs.close();
            myStat.close();
            myConn.close();
        }catch(SQLException e){ e.printStackTrace();};
        return i;
    }

    /**
     * @param totalFat the totalFat to set
     */
    public void setTotalFat(int totalFat) {
        this.totalFat = totalFat;
    }

    /**
     * @param n
     * @return the cholesterol
     */
    public int getCholesterol(String n) {
        int i = 0;
        try{
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaqnutri?zeroDateTimeBehavior=convertToNull","root","Azure");
            Statement myStat = myConn.createStatement();
            ResultSet myRs = myStat.executeQuery("SELECT * FROM foods WHERE name = \"" + n + "\";");
            while(myRs.next()){
                i = (myRs.getInt("cholesterol"));
            }
            myRs.close();
            myStat.close();
            myConn.close();
        }catch(SQLException e){ e.printStackTrace();};
        return i;
    }

    /**
     * @param cholesterol the cholesterol to set
     */
    public void setCholesterol(int cholesterol) {
        this.cholesterol = cholesterol;
    }

    /**
     * @param n
     * @return the sodium
     */
    public double getSodium(String n) {
        int i = 0;
        try{
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaqnutri?zeroDateTimeBehavior=convertToNull","root","Azure");
            Statement myStat = myConn.createStatement();
            ResultSet myRs = myStat.executeQuery("SELECT * FROM foods WHERE name = \"" + n + "\";");
            while(myRs.next()){
                i = (myRs.getInt("sodium"));
            }
            myRs.close();
            myStat.close();
            myConn.close();
        }catch(SQLException e){ e.printStackTrace();};
        return i;
    }

    /**
     * @param sodium the sodium to set
     */
    public void setSodium(double sodium) {
        this.sodium = sodium;
    }
    
    /**
     * @param n
     * @return the potassium
     */
    public double getPotassium(String n) {
        int i = 0;
        try{
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaqnutri?zeroDateTimeBehavior=convertToNull","root","Azure");
            Statement myStat = myConn.createStatement();
            ResultSet myRs = myStat.executeQuery("SELECT * FROM foods WHERE name = \"" + n + "\";");
            while(myRs.next()){
                i = (myRs.getInt("potassium"));
            }
            myRs.close();
            myStat.close();
            myConn.close();
        }catch(SQLException e){ e.printStackTrace();};
        return i;
    }

    /**
     * @param potassium the potassium to set
     */
    public void setPotassium(double potassium) {
        this.potassium = potassium;
    }

    /**
     * @param n
     * @return the carbohydrates
     */
    public int getCarbohydrates(String n) {
        int i = 0;
        try{
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaqnutri?zeroDateTimeBehavior=convertToNull","root","Azure");
            Statement myStat = myConn.createStatement();
            ResultSet myRs = myStat.executeQuery("SELECT * FROM foods WHERE name = \"" + n + "\";");
            while(myRs.next()){
                i = (myRs.getInt("carbohydrates"));
            }
            myRs.close();
            myStat.close();
            myConn.close();
        }catch(SQLException e){ e.printStackTrace();};
        return i;
    }

    /**
     * @param carbohydrates the carbohydrates to set
     */
    public void setCarbohydrates(int carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    /**
     * @param n
     * @return the proteins
     */
    public int getProteins(String n) {
        int i = 0;
        try{
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaqnutri?zeroDateTimeBehavior=convertToNull","root","Azure");
            Statement myStat = myConn.createStatement();
            ResultSet myRs = myStat.executeQuery("SELECT * FROM foods WHERE name = \"" + n + "\";");
            while(myRs.next()){
                i = (myRs.getInt("proteins"));
            }
            myRs.close();
            myStat.close();
            myConn.close();
        }catch(SQLException e){ e.printStackTrace();};
        return i;
    }

    /**
     * @param proteins the proteins to set
     */
    public void setProteins(int proteins) {
        this.proteins = proteins;
    }
    
}