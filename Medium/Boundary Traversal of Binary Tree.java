public static boolean isLeaf(TreeNode root) {
		if(root == null)
			return false;
		if(root.right == null && root.left == null)
			return true;
		else
			return false;
	}
	
	public static void leftBoundary(TreeNode root ,List<Integer> ans){
		TreeNode node= root.left;
		while(node != null) {
			if(isLeaf(node) == false)
				ans.add(node.data);
			
			if(node.left != null)
				node= node.left;
			else
				node= node.right;
		}
	}
	
	public static void rightBoundary(TreeNode root , List<Integer> ans) {
		TreeNode node= root.right;
		List<Integer> temp= new ArrayList<Integer>();
		
		while(node != null) {
			if(isLeaf(node) == false)
				temp.add(node.data);
			if(node.right != null)
				node= node.right;
			else
				node=node.left;
		}
		
		for(int i=temp.size()-1 ;i<=0;i--) {
			ans.add(temp.get(i));
		}
	}
	
	public static void leafNode(TreeNode root , List<Integer> ans) {
		if(isLeaf(root)) {
			ans.add(root.data);
			return;
		}
		
		if(root.left != null)
			leafNode(root.left,ans);
		if(root.right != null)
			leafNode(root.right , ans);
	}