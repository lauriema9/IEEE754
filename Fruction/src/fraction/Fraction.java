/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fraction;
import java.util.*;
import java.io.*;
/**
 *

 */

class ValueNotDefinedException extends Exception{
    ValueNotDefinedException() {
       System.out.println(" An attempt to define an undefined values has been made ");
    }
}
public  class Fraction implements java.io.Serializable{
        private int numerator;
        private int denominator;
        private static char slash = '/'; 
        public void setNumerator(int n){numerator=n;}
        public void setDnominator(int n){denominator=n;}
        public int getNumerator(int n){return numerator;}
        public int getDnominator(int n){return denominator;} 
        public double value(){return numerator/denominator;}
        public void writeToFile(File f){ 
        
        try{
         FileOutputStream fileOut =  new FileOutputStream(f);
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(this);
         out.close();
         fileOut.close();
         //System.out.printf("Serialized data is saved in external file"+f.toString());
        }
        catch(NotSerializableException e){
            System.out.println(" Can not serialize object");
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
        }
        
        public static Fraction readFromFile(File f){
         Fraction fracOut= new Fraction();
         int i=0;
        try{
         FileInputStream fileIn =  new FileInputStream(f);        
            ObjectInputStream in = new ObjectInputStream(fileIn);
            fracOut = (Fraction) in.readObject();       
         in.close();
         fileIn.close();
         //System.out.printf("Serialized data is read from external file"+f.toString());
        }
        catch(IOException e){
            e.printStackTrace();
        }
        catch (ClassNotFoundException e){
            System.out.println("Appropriate casting class not found");
            e.printStackTrace();
        }
          return fracOut;
       } 
        public String toString(){
            return new String(" "+numerator+slash+denominator);
        }
        
        public void printFraction(){
            System.out.println(" "+numerator+slash+denominator);
        }
        
       public Fraction(){
           numerator=1;
           denominator=1;
       }
       public Fraction(int n, int d){
           try{
                numerator=n;
                denominator=d;
                if(d == 0 )  throw new ValueNotDefinedException();
           }
           catch (ValueNotDefinedException v){ 
                System.out.println(v);
            }
       }
       public Fraction(int n){
           numerator=n;
           denominator=1;
       }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fraction fr[] = new Fraction[3];
        for (int i=0; i<fr.length;i++) fr[i] = new Fraction(i+3, (i+2)*(i+2));
        String myDir="";
        String fileName="SerialF.dat";
        File file = new File(myDir+fileName);
        try{
            
            if (!file.exists()) // if file doesnt exists, then create it
            {
                file.createNewFile();
            }
        }
        catch (IOException e) {
			e.printStackTrace();
        }
        System.out.println("Writing objects to file");
        try{
             ObjectOutputStream fst = new ObjectOutputStream(new FileOutputStream(file));
             for (int i=0; i<fr.length;i++) {
                 fst.writeObject(fr[i]);
                 System.out.print("Wrote : "+fr[i].toString()+ "  ");
             }
             System.out.println();
             fst.close();
        }
       catch(IOException e){
           System.out.println(" IO excdeption occured");
       }
        Fraction fo;
        System.out.println("Now reading the objects from the file");
       try{
           ObjectInputStream oin = new ObjectInputStream(new FileInputStream(file));
           for (int i=0; i<fr.length;i++){
               fo= (Fraction) oin.readObject();
               fo.printFraction();            
           }
             oin.close();
        } 
        catch(IOException e){
           System.out.println(" IO excdeption occured while reading the fraction objects");
        }       
        catch(ClassNotFoundException e){
           System.out.println(" No appropriate class found");
        }

    } 
    
    
}