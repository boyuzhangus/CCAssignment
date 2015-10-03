public class Solution03 {
    public boolean bst(int[]a, int low, int high, int key){ //revised binary search
        int mid;
        mid = low + (high - low)/2;
         if(high<low){
            return false;
        }
        if(a[mid]==key){ //judge condition
            return true;
        }
            if(a[low]<a[mid]){ //in this case, left side has been sorted
                if(key>=a[low]&&key<a[mid]){
                    return bst(a, low, mid-1, key);
                }
                else 
                    return bst(a, mid+1, high, key);
            }
            else if(a[low]>a[mid]){ //in this case, right side has been sorted
                if(key>a[mid]&&key<a[low]){
                    return bst(a, mid+1,high,key);
                }
                else{
                    return bst(a, low, mid-1,key);
                }
            }
            else if(a[low]==a[mid]){ //in this case, we should search two sides
                if(a[mid]!=a[high]){
                    return bst(a, mid+1,high,key);
                }
                else if(bst(a, low, mid-1,key)==false){
                    return bst(a, mid+1,high,key);
                }
                else
                    return bst(a, low, mid-1,key);
            }
            return false;
            
        }
    
    public boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        return bst(nums, low, high, target);
    }
}
