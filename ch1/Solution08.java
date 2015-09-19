public class Solution08 {
	public static void setToZero(int [][]matrix) {
		int row = matrix.length;
		int column = matrix[0].length;
		boolean []markrow = new boolean[row];    //the row number contains zero
		boolean []markcolumn = new boolean[column]; //the column number contains zero
		for (int i = 0; i < row; i++) {
			for (int j = 0; j<column; j++){
				if(matrix[i][j] == 0){
					markrow[i] = true;
					markcolumn[j] = true;
				}
			}
		}
		for (int i=0;i<row;i++){
			if(markrow[i]){              //set row to zero
				for(int j = 0;j<column;j++){
					matrix[i][j] = 0;
				}
			}
		}
		for (int i=0;i<column;i++){ // set column to zero
			if(markcolumn[i]){
				for(int j = 0;j<row;j++){
					matrix[j][i] = 0;
				}
			}
		}
		for (int i = 0; i < row; i++) { //output the result
			for (int j = 0; j < column; j++){
				System.out.print(matrix[i][j] + " ");
				}
				System.out.print("\n");
		}

	}
	public static void main(String []args) {
		int [][]test = {{0,2,3,4,5},{6,7,0,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}}; //test success
		Solution08.setToZero(test);
	}
}
