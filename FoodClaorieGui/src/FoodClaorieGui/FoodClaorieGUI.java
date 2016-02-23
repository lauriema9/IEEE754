/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodClaorieGui;

import java.io.File;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.geometry.Insets;
import javafx.scene.control.ComboBox;

/**
 *
 * @author sal
 */
public class FoodClaorieGUI extends Application {
    
    @Override
    
    
    public void start(Stage primaryStage) {
    String dir= "src/pics/";
    String ext = ".jpg";
    final Label notification = new Label ();
    //final TextField subject = new TextField("");
    final TextField textEx = new TextField("");
    final TextField textFood = new TextField("");
    final TextArea text = new TextArea ("");
    String address = " ";
    
    ImageView iv1 = new ImageView();
    ImageView iv2 = new ImageView();
    ImageView iv3 = new ImageView();
    ImageView iv4 = new ImageView();
    ImageView iv5 = new ImageView();
    ImageView iv6 = new ImageView();
    ImageView iv7 = new ImageView();
    ImageView iv8 = new ImageView();
    ImageView iv9 = new ImageView();
    
    Image imageFood1 = new Image((new File(dir+"bread"+ext)).toURI().toString());
    Image imageFood2 = new Image((new File(dir+"pizza"+ext)).toURI().toString());
    Image imageFood3 = new Image((new File(dir+"milk"+ext)).toURI().toString());
    Image imageFood4 = new Image((new File(dir+"veg"+ext)).toURI().toString());
    Image imageFood5 = new Image((new File(dir+"eggs"+ext)).toURI().toString());
    
    Image imageExcercixe1 = new Image((new File(dir+"walking"+ext)).toURI().toString());
    Image imageExcercixe2 = new Image((new File(dir+"running"+ext)).toURI().toString());
    Image imageExcercixe3 = new Image((new File(dir+"swimming"+ext)).toURI().toString());
    Image imageExcercixe4 = new Image((new File(dir+"yoga"+ext)).toURI().toString());
    
    Excercise run=new Excercise("Running");
    Excercise walk=new Excercise("Walking");
    Excercise swim=new Excercise("Swimming");
    Excercise yoga=new Excercise("Yoga");

    Food pizza=new Food("Piza");
    Food bread=new Food("Bread");
    Food milk=new Food("Milk");
    Food veg=new Food("Vegetable");
    Food egg=new Food("Egg");

    pizza.setFoodClaorie(280);
    bread.setFoodClaorie(80);
    milk.setFoodClaorie(340);
    veg.setFoodClaorie(120);
    egg.setFoodClaorie(400);
    
   walk.setBurnRate(10);
   run.setBurnRate(18);
   swim.setBurnRate(22);
   yoga.setBurnRate(14);
   
    bread.setFoodClaorie(80);
    milk.setFoodClaorie(340);
    veg.setFoodClaorie(120);
    egg.setFoodClaorie(400);
    HBox foodBox = new HBox();
    //HBox foodOptions = new HBox();
    HBox excerciseBox = new HBox();
    
         iv1.setFitWidth(205);
         iv2.setFitHeight(200);
         iv2.setX(200.0);
         //iv1.setPreserveRatio(true);
         iv1.setSmooth(true);
         iv1.setCache(true);

         iv2.setFitWidth(205);
         iv2.setFitHeight(200);
         //iv2.setX(iv1.getX()+5000);
         //iv2.setPreserveRatio(true);
         iv2.setSmooth(true);
         iv2.setCache(true);

         iv3.setFitWidth(205);
         iv3.setFitHeight(200);
         //iv3.setPreserveRatio(true);
         iv3.setSmooth(true);
         iv3.setCache(true);

         iv4.setFitWidth(205);
         iv4.setFitHeight(200);
         //iv4.setPreserveRatio(true);
         iv4.setSmooth(true);
         iv4.setCache(true);
         
         iv5.setFitWidth(205);
         iv5.setFitHeight(200);
         //iv4.setPreserveRatio(true);
         iv5.setSmooth(true);
         iv5.setCache(true);
         
          iv6.setFitWidth(225);
         iv6.setFitHeight(150);
         //iv4.setPreserveRatio(true);
         iv6.setSmooth(true);
         iv6.setCache(true);
         
          iv7.setFitWidth(225);
         iv7.setFitHeight(150);
         //iv4.setPreserveRatio(true);
         iv7.setSmooth(true);
         iv7.setCache(true);
         
          iv8.setFitWidth(225);
         iv8.setFitHeight(150);
         //iv4.setPreserveRatio(true);
         iv8.setSmooth(true);
         iv8.setCache(true);
         
          iv9.setFitWidth(225);
         iv9.setFitHeight(150);
         //iv4.setPreserveRatio(true);
         iv9.setSmooth(true);
         iv9.setCache(true);
         
        iv1.setImage(imageFood1);    
        iv2.setImage(imageFood2);
        iv3.setImage(imageFood3);
        iv4.setImage(imageFood4);
        iv5.setImage(imageFood5);
        
        iv6.setImage(imageExcercixe1);    
        iv7.setImage(imageExcercixe2);
        iv8.setImage(imageExcercixe3);
        iv9.setImage(imageExcercixe4);
        
        
        foodBox.getChildren().add(iv1);
        foodBox.getChildren().add(iv2);
        foodBox.getChildren().add(iv3);
        foodBox.getChildren().add(iv4);
        foodBox.getChildren().add(iv5);
        
        excerciseBox.getChildren().add(iv6);
        excerciseBox.getChildren().add(iv7);
        excerciseBox.getChildren().add(iv8);
        excerciseBox.getChildren().add(iv9);
        
        Button btn = new Button();
        btn.setText("View Food Excercise Balance");
        
        final ComboBox c1ComboBox = new ComboBox();
        c1ComboBox.getItems().addAll("0","1","2","3","4","5");
        c1ComboBox.setValue("0");
        final ComboBox c2ComboBox = new ComboBox();
        c2ComboBox.getItems().addAll("1","2","3");
        c2ComboBox.setValue("0");
        final ComboBox c3ComboBox = new ComboBox();
        c3ComboBox.getItems().addAll("1","2","3","4");
        c3ComboBox.setValue("0");
        final ComboBox c4ComboBox = new ComboBox();
        c4ComboBox.getItems().addAll("1","2","3");
        c4ComboBox.setValue("0");
        final ComboBox c5ComboBox = new ComboBox();
        c5ComboBox.getItems().addAll("1","2");
        c5ComboBox.setValue("0");
        final ComboBox c6ComboBox = new ComboBox();
        c6ComboBox.getItems().addAll("15","30","45","60","90", "120");
        c6ComboBox.setValue("0");
        final ComboBox c7ComboBox = new ComboBox();
        c7ComboBox.getItems().addAll("15","30","45","60");
        c7ComboBox.setValue("0");
        final ComboBox c8ComboBox = new ComboBox();
        c8ComboBox.getItems().addAll("15","30","45");
        c8ComboBox.setValue("0");
        final ComboBox c9ComboBox = new ComboBox();
        c9ComboBox.getItems().addAll("30","60");
        c9ComboBox.setValue("0");
       // final ComboBox priorityComboBox = new ComboBox(); priorityComboBox.getItems().addAll("Highest","High", "Normal","Low","Lowest");
        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(45);
        grid.setPadding(new Insets(5, 5, 5, 5));
        grid.add(foodBox, 0, 0, 12, 3);
        grid.add(new Label("     Bread: "), 0, 4);
        grid.add(c1ComboBox, 1, 4);
        grid.add(new Label("Pizza: "), 2, 4);
        grid.add(c2ComboBox, 3, 4);
        grid.add(new Label("Milk: "), 4, 4);
        grid.add(c3ComboBox, 5, 4);
        grid.add(new Label("Vegis: "), 6, 4);
        grid.add(c4ComboBox, 7, 4);
        grid.add(new Label("Eggs: "), 8, 4);
        grid.add(c5ComboBox, 9, 4);        
        grid.add(new Label("      Servings: "), 0, 3);
        //grid.add(c2ComboBox, 2, 0);
        //grid.add(new Label("Subject: "), 0, 1);
        grid.add(new Label("Total claories intake: "), 1, 5, 1,5);
        grid.add(textFood, 2, 5, 2, 5);
       // grid.add(subject, 1, 3, 4, 1);   
       text.setMaxHeight(25);
       //text.setMaxWidth(60);
        grid.add(text, 6, 8, 7, 8);
        grid.add(btn, 4,8, 4,8);
        grid.add(new Label("Total claories consumed: "), 1, 10, 1,10);
        grid.add(textEx, 2, 10, 2, 10);
        
         grid.add(new Label("      Duration (minutes): "), 0, 20);
        grid.add(new Label("     walk: "), 0, 21);
        grid.add(c6ComboBox, 1, 21);
        grid.add(new Label("run : "), 2, 21);
        grid.add(c7ComboBox, 3, 21);
        grid.add(new Label("swim: "), 4, 21);
        grid.add(c8ComboBox, 5, 21);
        grid.add(new Label("yoga: "), 6, 21);
        grid.add(c9ComboBox, 7, 21);
                 
        grid.add(excerciseBox, 0, 22, 10, 26);
       // grid.add (notification, 1, 3, 3, 1);
        grid.setLayoutX(600);
    
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            int calBurn=0,  calIn=0;
           bread.setServings(Integer.valueOf((c1ComboBox.getValue()).toString()));
           pizza.setServings( Integer.valueOf((c2ComboBox.getValue()).toString()));
           milk.setServings(Integer.valueOf((c3ComboBox.getValue()).toString()));
           veg.setServings( Integer.valueOf((c4ComboBox.getValue()).toString()));
           egg.setServings( Integer.valueOf((c5ComboBox.getValue()).toString()));
           
           calIn = bread.calcCalorieIntake()+
                           pizza.calcCalorieIntake()+
                           milk.calcCalorieIntake()+
                           veg.calcCalorieIntake()+
                           egg.calcCalorieIntake();
           System.out.println(" you have accumalted " +calIn+ " Calories" );
           textFood.setText(calIn+ " Calories");
                 
           walk.duration= (Integer.valueOf((c6ComboBox.getValue()).toString()));
           run.duration= (Integer.valueOf((c7ComboBox.getValue()).toString()));          
           swim.duration= (Integer.valueOf((c8ComboBox.getValue()).toString()));
           yoga.duration= (Integer.valueOf((c9ComboBox.getValue()).toString()));        
           calBurn =  walk.calcCalorieBurn()+run.calcCalorieBurn()+swim.calcCalorieBurn()+yoga.calcCalorieBurn();
           System.out.println(" you have burnt "+ calBurn + " Calories");
           textEx.setText(calBurn+ " Calories");
           if ( calBurn  ==0 || calIn ==0)  {  System.out.println("You did not add food and excercise");
            text.setText("Did you forget to add Food or an Excercixe?");}
           else if ( calBurn  > 0.9* calIn)  {  System.out.println("You are balancing food and excercise");
            text.setText("WellDone! You are balancing food and excercise");}
           else {
               System.out.println("You are  NOT balancing food and excercise");
               text.setText("WARNING  , You are NOT balancing food and excercise");
           }               
            }
        });
        
        StackPane root = new StackPane();
               
        //root.getChildren().add(foodBox);
        ///root.getChildren().add(comboBox);
        root.getChildren().add(grid);
        //root.getChildren().add(btn);
        primaryStage.setTitle("Food Balance view");
        Scene scene = new Scene(root, 750, 500);

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