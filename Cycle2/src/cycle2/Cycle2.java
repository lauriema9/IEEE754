/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cycle2;

import java.util.*;
import java.io.*;
/**
 *

 */
public class Cycle2 {
     private int weight;
    private int noOfWheels;
    public int getWeight(){return weight;}
    public int getNoOfWheels() {return noOfWheels;}
    public void setWeight(int w){weight=w;}
    public void setNoOfWheels(int n) {noOfWheels=n;}
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String myDir="";
        String fileName="cycle.txt";
        File file = new File(myDir+fileName);
        Scanner in = new  Scanner(System.in);
        System.out.println("Let us build the cycle\n ");
        Cycle2 c= new Cycle2();
        int n,w;
        System.out.println("what is the weight of the cycle ? ");
        w= in.nextInt();
        System.out.println("How many wheels does the cycle has ? ");
        n= in.nextInt();
        c.setWeight(w);
        c.setNoOfWheels(n);
	try{
            
            if (!file.exists()) // if file doesnt exists, then create it
            {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("cycle: \n");
            bw.newLine();
            bw.write("Weight : " + c.getWeight() + " lbs");
            bw.newLine();
            bw.write ("Wheels : " + c.getNoOfWheels());
            bw.close();
        } catch (IOException e) {
			e.printStackTrace();
		}
    }
    
}