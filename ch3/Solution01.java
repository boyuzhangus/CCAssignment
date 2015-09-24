public class Solution01 {
	public int overalllength; // for the purpose of initialize an array
	public int lengthofstack;
	public int[] overall;  // the array store the stack
	public int[] eachIndex;
	public int index; // index of insert

	public Solution01(int stackleng)
	{
		lengthofstack = stackleng;
		overalllength = 3 * stackleng;
		overall = new int[overalllength];
		eachIndex = new int[3];
	}

	public void push(int stack_index, int value) {
		index = (stack_index - 1) * lengthofstack + eachIndex[stack_index-1];
		overall[index] = value;
		eachIndex[stack_index-1]++;
	}
	public int pop(int stack_index){
		int temp;
		index = (stack_index - 1) * lengthofstack + eachIndex[stack_index-1];
		temp = overall[index];
		eachIndex[stack_index - 1]--;
		return temp;
	}
}
