/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cycle3;

import java.util.*;
import java.io.*;
/**
 
 */
public class Cycle3 {
     private int weight;
    private int noOfWheels;
    public int getWeight(){return weight;}
    public int getNoOfWheels() {return noOfWheels;}
    public void setWeight(int w){weight=w;}
    public void setNoOfWheels(int n) {noOfWheels=n;}
    
    public Cycle3(int w, int n){
        weight=w;
        noOfWheels=n;
    }
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        String myDir="";
        String fileName="cycle.txt";
        File file = new File(myDir+fileName);
        Scanner in = new  Scanner(System.in);
        System.out.println("Let us build the cycle\n ");
        int numWheels=0;
		int weight=0;
        System.out.println("We will read the weight of the cycle and Number of wheels from the file Cycle.txt");
       
        String token;
        boolean found =false;
	try{
            FileInputStream fIn =new FileInputStream(fileName);
            Scanner fr = new Scanner(fIn);
            while (!found) {
                token =  fr.next();
                //System.out.println(token);
                if (token.equals("Weight")){
                    found=true;
                    token =  fr.next();
               weight = Integer.valueOf(fr.next());
                }                 
            }
            System.out.println("The weight read from file is : " +weight);
            found = false;
            while (!found) {
                token =  fr.next();
                //System.out.println(token);
                if (token.equals("Wheels")){
                    found=true;
                    token =  fr.next();
                    numWheels = Integer.valueOf(fr.next());
                }                 
            }
            System.out.println("The number of wheels read from file are : " +numWheels);
            
            fr.close();
           // c.setWeight(w);
        //c.setNoOfWheels(n);
        } catch (IOException e) {
			e.printStackTrace();
	}
        System.out.println("Now creating cycles with the values readr from the file" );
        Cycle3 c= new Cycle3(weight,numWheels);
        System.out.println("Cycle created - cycle weight is : " +c.getWeight()+ "lbs annd the cycle has "+c.getNoOfWheels()+" wheels");
    }
    
}