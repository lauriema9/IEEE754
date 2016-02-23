import java.util.Scanner;


public class Dive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float degree = inputValidDegreeOfDifficulty();
        float score[] = inputAllScore();
        float sc = calculateScore(score, degree);
		System.out.println("The score is " + sc);
	}  
	
	public static float inputValidScore(){
		Scanner input = new Scanner(System.in);
		float validScore = 0;
		
		do {
			System.out
					.println("Enter score between 0 and 10");
			validScore = input.nextFloat();
		} while (!(0<= validScore && validScore <= 10)); 
		//input.close();
		return validScore;
	}
	
	public static float[] inputAllScore(){
        float score[] = new float[7];
        for(int i=0;i <score.length; i++){
              
        score[i] =inputValidScore();
        System.out.println(score[i]);
        
        }
		return score;
	}	
	public static float inputValidDegreeOfDifficulty(){
		Scanner input = new Scanner(System.in);
		float inputValidDegreeOfDifficulty= 0.0f;
		do {
			System.out.println("Enter the degree of difficulty for a dive ");
			 inputValidDegreeOfDifficulty = input.nextFloat();
		} while (!(1.2<= inputValidDegreeOfDifficulty && inputValidDegreeOfDifficulty <= 3.8)); 
	//	input.close();
		return inputValidDegreeOfDifficulty;
	} 
	public static float calculateScore(float [] score, float degree){
				//find smallest
				float smallest = score[0];
				for(int i=1; i<score.length; i++) {
					if(smallest>score[i]) {
						smallest = score[i];
					}
				}
				
				//find largest
				float largest = score[0];
				for(int i=1; i<score.length;i++){
					if (largest < score[i]) {
						largest = score[i];
					}
				}
				//
				//1to do
				
				//find sum of scores
				float sum=0.0f;
				for(int i=0; i< score.length; i++) {
						sum = sum + score[i];
				}
				//drop smallest & largest
				sum = sum -smallest - largest;
				
		float calculateScore = sum * degree * 0.6f;
		return calculateScore;
	}
}
