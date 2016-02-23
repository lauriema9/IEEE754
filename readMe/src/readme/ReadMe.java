/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readme;

import java.io.*;
/**
 */
public class ReadMe  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        String myDir="";
        String fileName="Pledge.txt";
        try{
            RandomAccessFile file = new RandomAccessFile(fileName,"r");
        file.seek((long)124);
        byte buffer;

         buffer = file.readByte();
         System.out.println("The character at position 124 is "+(char)buffer);
         file.seek((long)135);
         buffer = file.readByte();
         System.out.println("The character at position 135 is "+(char)buffer);
        file.close();    
        }
        catch(FileNotFoundException e){
            
            System.out.println(" The file specified was not found");
        }
        catch(IOException e){
            
            System.out.println(" TheAn exception occured :"+ e);
        }
    }
    
}