public class Solution03 {
	public static char[] replaceSpace(char[] str, int trueLeng) {
		int fullleng = 0;
		int count = 0;
		for (int i = 0; i < trueLeng; i++) {
			if (str[i] == ' ') {
				count++; //Calculate the number of ' ' to make sure the length needed
			}
		}
			fullleng = trueLeng + count*2;
			int index = trueLeng - 1;
			for(int i = fullleng - 1; i >= 0; i--) {
				if (str[index] != ' ') {
					str[i] = str[index];
				}
				else {
					str[i] = '0'; //Do the substitution operation
					str[i -1]= '2';
					str[i -2]='%';
					i = i - 2; //Note: Because we will have a i-- in the outer loop
				}
				index--;
			}
		return str;
	}
	public static void main(String []args) {
		String test = "a b  c      ";// should be a%20b%20%20c
		char[] str = test.toCharArray();
		str = Solution03.replaceSpace(str, 6);
		System.out.println(str);
	}
}
