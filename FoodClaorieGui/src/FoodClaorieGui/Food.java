
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodClaorieGui;
/**
 *
 * @author likun Ma
 */
public class Food {
    
    private String foodName;
    private int claoriePerServing;
    private int servings;
    private int maxDailyServ;
    
    public void setFoodClaorie(int cl){
        claoriePerServing=cl;
    }
    
    public void setServings(int s){
        servings=s;
    }
     public void setMaxDailyServ(int MS){
        maxDailyServ=MS;
    }
   
    public int calcCalorieIntake(){
        return servings*claoriePerServing;
    }
    
    public boolean foodControl(){
        return servings<maxDailyServ;
    }
    
    public Food(String n ){
        foodName = n;
        claoriePerServing = 150;
        servings = 0;
        maxDailyServ = 3 ;    
    }
}