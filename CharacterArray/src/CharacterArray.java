public class CharacterArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "6901 Sudley Road Manassas VA";
		char character[] = new char[s.length()];
		String value = "";
		for (int i = 0; i < s.length(); i++) {
			// if (){
			character[i] = s.charAt(i);
			if (character[i] == ' ') {
				value = " is neither digit or character ";
			} else {
				if (Character.isLetter(character[i])) {
					// variable to store word is digit
					value = " is character ";
					if(Character.isUpperCase(character[i])) {
						character[i] = Character.toLowerCase(character[i]);
					} else {
						character[i] = Character.toUpperCase(character[i]);
					}
				} else {
					value = " is digit ";
					character[i]= '*';
					
				}
			}
			System.out.println(character[i]+ value);
		}
	}

}
