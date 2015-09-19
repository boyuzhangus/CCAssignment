// Assumption: Phrase uses character set in the extended ASCII
public class Solution04{
	public static boolean isPalin(String str) {
		int []count = new int[256];
		for(int i = 0; i < str.length(); i++) {
			if (str.charAt(i)>='A'&&str.charAt(i)<='Z') {
				char index = Character.toLowerCase(str.charAt(i)); //make it case-insensitive
				count[index]++;
			}
			else
				count[str.charAt(i)]++;
		}
		int uselength = str.length() - count[32]; //eliminate the interfere caused by count of space
		count[32] = 0; // as above
		int numofodd = 0;

		for ( int j = 0; j < 256; j++) {
				if (count[j] % 2 == 1){
					numofodd++;          //calculate the number of odd count
					if (uselength % 2 == 0)
					return false; 
					else if (numofodd > 1)
					return false;
				}
		}
		return true;
	}
	public static void main(String []args) {
		String test = "Tact  Coa"; // should be true;
		String test2 = "tactcoapapa"; 
		System.out.println(Solution04.isPalin(test2));
	}
}
