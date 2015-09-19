//Solution: transpose the matrix at first, and then, horizontal flip it.
public class Solution07 {
	public static void rotateMatrix(int [][]matrix, int n) {
		int temp = 0;
		for (int i = 0; i < n; i++) {  //transpose the matrix
			for (int j = i; j < n; j++){
				temp = matrix[i][j];
				matrix[i][j] = matrix [j][i];
				matrix[j][i] = temp;
			}
		}
		for (int i = 0;i < n; i++){ //horizontal flip it.
			for (int j = 0; j < (n/2); j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[i][n-j-1];
				matrix[i][n-j-1] = temp;
			}
		}
		for (int i = 0; i < n; i++) { //output the result
			for (int j = 0; j < n; j++){
				System.out.print(matrix[i][j] + " ");
				}
				System.out.print("\n");
		}
	}
	public static void main(String []args) {
		int [][]test = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		Solution07.rotateMatrix(test,5);

	}
}
