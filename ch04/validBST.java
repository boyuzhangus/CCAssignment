//In-Traversal assumes that tree dosn't have duplicate values.
int index = 0;
void copyBST(TreeNode root, int[] array) {
  if(root == null) return;
  copyBST(root.left, array);
  array[index] = root.data;
  index++;
  copyBST(root.right, array);
}

boolean checkBST(TreeNode root) {
  int[] array = new int[root.size];
  copyBST(root, array);
  for (int i = 1; i < array.length; i++) {
    if(array[i]<array[i-1]) return false;
  }
  return true;
}
//without array

Integer last_printed = null;
boolean checkBST(TreeNode n) {
  if (n == null) return true;
  
  if (!checkBST(n.left)) return false;
  
  if (last_printed != null && n.data <= last_printed) {
    return false;
  }
  last_printed = n.data;
  
  if(!checkBST(n.right)) return false;
  
  return true;
}
