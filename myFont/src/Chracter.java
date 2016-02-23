import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Chracter extends Application {

@Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a pane and set its properties
	  Pane pane1 = new Pane();
	  javafx.scene.text.Font myFont = new javafx.scene.text.Font("Times New Roman", 25.0);
		String mySt = new String("WELCOME TO JAVA ");
		int len=mySt.length();
		//char aC='a';
		for (int i=0; i<len;i++){ //i<mySt.length()
			Text aT =new Text(100+60*Math.cos(Math.toRadians(i*360/len)), 100+60*Math.sin(Math.toRadians(i*360/len)), new java.lang.String(String.valueOf(mySt.charAt(i))));
			aT.setFont(myFont);
			aT.setRotate((i*360/len)+90);
			pane1.getChildren().add(aT);
		}
		Scene scene1 = new Scene(pane1, 350, 400);
	    primaryStage.setTitle("Characters around circle"); // Set the stage title
	    primaryStage.setScene(scene1); // Place the scene in the stage
	    primaryStage.setX(200);
	    primaryStage.setY(200);
	    
	    primaryStage.show(); // Display the stage
  }
  
  

  public static void main(String[] args) {
    launch(args);
  }
}

