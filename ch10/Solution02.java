import java.util.Collections;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
public class Solution02 {
    public void groupAnagrams(String[] strs) {
        HashMap<String, List<String>> result= new HashMap<String, List<String>>();//store the HashMap structure
        String sortedStr;
        ArrayList<String> output = new ArrayList();
        for(String a: strs){
            char[] charOfstr = a.toCharArray();
            Arrays.sort(charOfstr); 
            //sortedStr = Arrays.toString(charOfstr); 
            sortedStr = new String(charOfstr); 
            if(!result.containsKey(sortedStr)){ //add new String into HashMap
                List<String> temp = new ArrayList<String>();
                temp.add(a);
                result.put(sortedStr, temp);
            }
            else {
                result.get(sortedStr).add(a); //map the anagram string to one list in Hashmap
            }
        }
        for(List<String> b: result.values()){
        	output.addAll(b);
        }
        String[] temp = output.toArray(new String[output.size()]);
        strs = temp;
        for(String a: strs){
        System.out.println(a);
    }
    }
    public static void main(String[] args) {
        String []a = {"eat", "tea", "tan", "ate", "nat", "bat"}; //testcase from leetcode; success
        Solution02 testcase = new Solution02();
        testcase.groupAnagrams(a);
    }
}
