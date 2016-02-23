import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class ReadWrite {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		 String myDir="";
	        String fileName="Stu.dat";
	        try{
	            RandomAccessFile file = new RandomAccessFile(fileName,"rw");	  
	            Scanner input = new Scanner(System.in);
	            for(int i=0; i<5;i++){
	            	System.out.println("Enter students ID ");	
	            	file.writeInt(input.nextInt());
	            	System.out.println("Enter students GPA ");	
	            	file.writeDouble(input.nextDouble());
	            }
	            System.out.println("Enter students ID to search for gpa ");
	            int studentsID = input.nextInt();
	            
	            file.seek(0);
	            for(int i=0; i< 5;i++){
	   if(studentsID == file.readInt()){
		  // System.out.println(file.readInt());
       	System.out.println(file.readDouble());
	   }       	
	            }
	            file.close();
	        }catch (Exception e){
	        	System.out.println("The file is not found.");
	        }
	}

}
