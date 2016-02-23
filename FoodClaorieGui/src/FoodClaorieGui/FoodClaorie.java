
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodClaorieGui;
import java.io.*;
import java.util.*;
/**
 *
 * @author likun Ma
 */
public class FoodClaorie {
	
}

    /**
     * @param args the command line arguments
     */
    
    /*public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("well come to food claorie prog");
        System.out.println("Let us build our food intake");
        
        boolean done= false;
        int numFoods=1;
        Scanner in = new  Scanner(System.in);
        //System.out.println("Let us build our food\n ");
                //+ "enter choice 1=pizza, 2= bread, 3= meat, 4=milk, 5= veg");
       /* while (done == false){
            numFoods++;
            System.out.println("food no : "+numFoods);
            
            if (numFoods >2) done = true;
        } 
*/
    /*
        // craete excercises
            Excercise run=new Excercise("Running");
            Excercise walk=new Excercise("Walking");
            Excercise swim=new Excercise("Swimming");
            Excercise yoga=new Excercise("Yoga");
            
            Food pizza=new Food("Piza");
            Food bread=new Food("Bread");
            Food milk=new Food("Milk");
            Food veg=new Food("Vegetable");
            Food egg=new Food("Egg");
            
            pizza.setFoodClaorie(220);
            bread.setFoodClaorie(80);
            milk.setFoodClaorie(400);
            veg.setFoodClaorie(110);
            egg.setFoodClaorie(400);
            
           System.out.println("Given Two slices = one serving; How many serving of Bread did you eat?");
           bread.setServings(Integer.valueOf(in.nextLine()));
           System.out.println("Given 1 peice pizza = one serving; How many serving of Pizza did you eat?");
           pizza.setServings( Integer.valueOf(in.nextLine()));
           System.out.println("Given 1 cup of milk = one serving; How many serving of Milk did you take?");
           milk.setServings(Integer.valueOf(in.nextLine()));
           System.out.println("Given 1 plate of raw or fried vegatable = one serving; How many serving of Vegitable did you take?");
           veg.setServings( Integer.valueOf(in.nextLine()));
           System.out.println("Given 2 eggs = one serving; How many serving of Eggs did you take?");
           egg.setServings( Integer.valueOf(in.nextLine()));
           int calIn = bread.calcCalorieIntake()+
                           pizza.calcCalorieIntake()+
                           milk.calcCalorieIntake()+
                           veg.calcCalorieIntake()+
                           egg.calcCalorieIntake();
           System.out.println(" you have accumalted " +calIn+ " Calories" );
         
           System.out.println("\nLet us observe our excercise :");
           
           System.out.println(" How many minutes did you walk ?");
           walk.duration= Integer.valueOf(in.nextLine());
           System.out.println("How many minutes did you run?");
           run.duration= Integer.valueOf(in.nextLine());
           System.out.println("How many minutes did you swimm?");
           swim.duration= Integer.valueOf(in.nextLine());
           System.out.println("How many minutes you spent doing yoga?");
           yoga.duration= Integer.valueOf(in.nextLine());           
           int calBurn =  walk.calcCalorieBurn()+run.calcCalorieBurn()+swim.calcCalorieBurn()+yoga.calcCalorieBurn();
           System.out.println(" you have burnt "+ calBurn + " Calories");
           
           if ( calBurn  > 0.9* calIn)    System.out.println("You are balancing food and excercise");
           else System.out.println("You are  NOT balancing food and excercise");
           //System.out.println(swim.getClass().getName());
    }
    
   */