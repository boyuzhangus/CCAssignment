int countPathsWithSum(TreeNode root, int targetSum){
	if (root == null) return 0;
	int pathsFromRoot = countPathsWithSumFromNode(root, targetSum, 0);
	int pathsOnleft = countPathsWithSum(root.left, targetSum);
	int pathsOnRight = countPathsWithSum(root.right, targetSum);

	return pathsFromRoot + pathsOnleft + pathsOnRight;
}

int countPathsWithSumFromNode(TreeNode node, int targetSum, int currentSum){
	if (node == null) return 0;
	currentSum +=node.data;

	int totalPaths = 0;
	if (currentSum == targetSum){
		totalPaths++;
	}

	totalPaths += countPathsWithSumFromNode(node.left, targetSum, currentSum);
	totalPaths += countPathsWithSumFromNode(node.right, targetSum, currentSum);
	return totalPaths;
}
