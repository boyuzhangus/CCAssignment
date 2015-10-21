//WithLinksToParents
TreeNode commonAncestor(TreeNode p, TreeNode node){
  if (p == q) return null;
  
  TreeNode ancestor = p;
  while (ancestor != null){
    if (isOnPath(ancestor, q)) {
      return ancestor;
    }
    ancestor = ancestor.parent;
  }
  return null;
}
boolean isOnPath(TreeNode ancestor, TreeNode node) {
  while (node != ancestor && node != null){
    node = node.parent;
  }
  return node == ancestor;
}
//WithLinkstoParents(Better worst-case runtime)
TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q){
	if (!covers(root, p)||!covers(root,q)){
		return null;
	} else if(covers(p, q)){
		return p;
	} else if (covers(q, p)){
		return q;
	}
	//Traverse upwards until you find a node that covers q
	TreeNode sibling = getSibling(p);
	TreeNode parent = p.parent;
	while(!cover(sibling, q)){
		sibling = getSibling(parent.sibling);
		parent = parent.parent;
	}
	return parent;
}

boolean covers(TreeNode p, TreeNode q){
	if(p == null || q == null){
		return false;
	}
	if (p == q){
		return true;
	}
	return covers(p.left, q)||covers(p.right);
}

TreeNode getSibling(TreeNode node){
	if(node == null || node.parent == null){
		return null;
	}
	TreeNode parent = node.parent;
	return parent.left == node? parent.right:parent.left;
}
//Without Links to Parents
TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	if(!covers(root, p) || !covers(root, q)) {
		return null;
	}
	return ancestorHelper(root, p, q);
}

TreeNode ancestorHelper(TreeNode root, TreeNode p, TreeNode q) {
	if(root == null){
		return null;
	} else if (root == p){
		return p;
	} else if (root == q){
		return q;
	}

	boolean pIsOnLeft = covers(root.left, p);
	boolean qIsOnRight = covers(root.right, q);
	if (pIsOnLeft != qIsOnRight) {
		return root;
	}
	TreeNode childSide = pIsOnLeft ? root.left: root.right);
	return ancestorHelper(childSide, p, q);
}

boolean covers(TreeNode p, TreeNode q){
	if (p == null || q == null){
		return false;
	}
	if (p == q){
		return true;
	}
	return covers(p.left, q)||covers(p.right, q);
}
