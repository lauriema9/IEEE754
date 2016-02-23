/**
 * 
 * @author likun Ma
 * JOptionPane-Input
 * Date:2/13/2014
 * Email: ml20130@email.vccs.edu
 */
import javax.swing.JOptionPane;
public class HeightConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String strUserHeight = 
  JOptionPane.showInputDialog("The user's height is:" + "cm");   
int userHeight = Integer.parseInt(strUserHeight);
double inches = (double)(userHeight*(0.39));
double feet = (double)(inches/(12));
char symbol = 'A';


JOptionPane.showMessageDialog(null, "The user's height is " + userHeight + "cm" +". \n and the inches is in" + inches + ". \n" + "the feet is ft"
+ feet + "." + symbol);
	}
	}
