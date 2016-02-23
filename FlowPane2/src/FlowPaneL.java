import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public class FlowPaneL extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a pane and set its properties
    FlowPane pane1 = new FlowPane();
    pane1.setPadding(new Insets(11, 12, 13, 14));
    pane1.setHgap(5);
    pane1.setVgap(5);
    
    // Place nodes in the pane
   //pane.getChildren().addAll(new Label("First Name:"),new TextField(), new Label("MI:"));
   for (int i=0;i<3 ;i++)pane1.getChildren().add(new Button("Button "+(i+1)));
    
   
    
    //pane.getChildren().add(paneInset);
    // Create a scene and place it in the stage
    Scene scene1 = new Scene(pane1, 350, 400);
    primaryStage.setTitle("ShowFlowPane"); // Set the stage title
    primaryStage.setScene(scene1); // Place the scene in the stage
    primaryStage.setX(200);
    primaryStage.setY(200);
    
    primaryStage.show(); // Display the stage
          
    new SecondStage();
  }
  
  
  
	  public class SecondStage extends Stage {
	  Label x = new Label("Second stage");
	  VBox y = new VBox();
	  FlowPane pane2 = new FlowPane();  
	  
	  SecondStage(){
		  	
		    for (int i=0;i<3 ;i++)pane2.getChildren().add(new Button("Button "+(i+4)));Scene scene2 = new Scene(pane2, 150, 180);
		    pane2.setPadding(new Insets(6, 7, 8, 9));
		    pane2.setHgap(5);
		    pane2.setVgap(5);
		    this.setTitle("FlowPane2"); // Set the stage title
		    this.setScene(scene2); // Place the scene in the stage		    
	      //y.getChildren().add(x);
	      this.setScene(scene2);
	      this.setX(210);
	      this.setY(270);
	      this.show(); // Display the stage
	     }    
	  }

	//  @Override
	//  public void start(Stage primaryStage){
	      
	 // }
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}

/*public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
            new FirstStage();
    }
    public void main(String[] args) {
        launch(args);
    }
}
}

public class FirstStage extends Stage{
	  Button openOther = new Button("Open other Stage");
	  HBox x = new HBox();

	  FirstStage(){
	      x.getChildren().add(openOther);
	      this.setScene(new Scene(x, 300, 300));
	      this.show();

	      //openOther.setOnAction(new EventHandler<ActionEvent>() {
	         // @Override
	        //  public void handle(ActionEvent t) {
	              new SecondStage();
	         // }//end action
	      //});
	      }
	  }
*/
