import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;




public class Chapter18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		    
		    
		        String myDir="";
		        String fileName="Exercise 17.txt";
		        File file = new File(myDir+fileName);
		       
			try{
		            
		            if (!file.exists()) // if file doesnt exists, then create it
		            {
		                file.createNewFile();
		            }

		            FileWriter fw = new FileWriter(file.getAbsoluteFile());
		            BufferedWriter bw = new BufferedWriter(fw);
		            for(int i=0; i<100; i++){
		            	
		            bw.write((String.valueOf(Math.random()*1000)));
		          
		            bw.write("");
		            }
			}
		        catch (IOException e) {
					e.printStackTrace();
				}
		    
		    
		
			}

}
