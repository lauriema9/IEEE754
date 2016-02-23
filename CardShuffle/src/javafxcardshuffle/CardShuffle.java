
package javafxcardshuffle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Pane;
import javafx.scene.image.*;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.io.File;
import java.util.*;

/**
 *
 * @author likun ma
 */
public class JavaFXCardShuffle extends Application {
    
   // @ Override
    ImageView iv1 = new ImageView();
    ImageView iv2 = new ImageView();
    ImageView iv3 = new ImageView();
    ImageView iv4 = new ImageView();
    HBox box = new HBox();
    List <Image>arrlist = new ArrayList();
    String dir = "src/cards/";
    String ext =".png";
    Image image[] = new Image[52];
   
    
    
    public void start(Stage primaryStage) {     
        
        //String fileName[] = new String[4];
        for (int i =0; i<52; i++) {
            image[i] = new Image((new File(dir+String.valueOf(i+1)+ext)).toURI().toString());
            arrlist.add(image[i]);            
        }
        
         iv1.setFitWidth(100);
         iv2.setX(200.0);
         iv1.setPreserveRatio(true);
         iv1.setSmooth(true);
         iv1.setCache(true);

         iv2.setFitWidth(100);
         iv2.setX(iv1.getX()+5000);
         iv2.setPreserveRatio(true);
         iv2.setSmooth(true);
         iv2.setCache(true);

         iv3.setFitWidth(100);
         iv3.setPreserveRatio(true);
         iv3.setSmooth(true);
         iv3.setCache(true);

         iv4.setFitWidth(100);
         iv4.setPreserveRatio(true);
         iv4.setSmooth(true);
         iv4.setCache(true);
         
        iv1.setImage(image[0]);
        iv2.setImage(image[1]);
        iv3.setImage(image[2]);
        iv4.setImage(image[3]);
        
        
        box.getChildren().add(iv1);
        box.getChildren().add(iv2);
        box.getChildren().add(iv3);
        box.getChildren().add(iv4);
        
        Button btn = new Button();
        btn.setText("Shuffle");       
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                Shuffle();
                box.getChildren().clear();
                iv1.setImage(arrlist.get(1));
                iv2.setImage(arrlist.get(2));
                iv3.setImage(arrlist.get(3));
                iv4.setImage(arrlist.get(4));
              
                box.getChildren().add(iv1);
                box.getChildren().add(iv2);
                box.getChildren().add(iv3);
                box.getChildren().add(iv4);               
            }
        });
        
        StackPane root = new StackPane();        
        Scene scene = new Scene(root, 450, 350);
        root.getChildren().add(box);
        root.getChildren().add(btn);
        primaryStage.setTitle("Card Shuffle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    void Shuffle(){
        Collections.shuffle(arrlist);      
        //System.out.println("Final collection after shuffle: "+arrlist);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
