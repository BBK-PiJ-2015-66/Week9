// IntegerBinaryTree.java

public class IntegerBinaryTree { 
  
	/* 
	 * Root node pointer. Will be null for an empty tree.
	 */  
  	private IntegerTreeNode root;

  	/* 
   	 * --Node-- 
  	 */  
	public class IntegerTreeNode {

		int value;
	
		IntegerTreeNode left;
		IntegerTreeNode right;

		// IntegerTreeNode constructor
    		IntegerTreeNode (int newValue) { 
      
      			value = newValue;

			left = null; 
      			right = null;
 
    		}
  	} 
 
  	/* 
   	 * Creates an empty binary tree -- a null root pointer. 
  	 */ 
	public void IntegerBinaryTree() {
	  

		root = null;    
	}

  
  	public boolean contains(int value) { 
    
		return(contains(root, value)); 
  	} 
  
  	private boolean contains(IntegerTreeNode node, int value) {
 
    		if (node==null) { 
      
			return(false); 
    		}

    		if (value==node.value) { 
      
			return(true); 
    		} else if (value<node.value) { 
      
			return(contains(node.left, value)); 
    		} else { 
      
			return(contains(node.right, value)); 
    		} 
	} 
 

  	public void add(int value) { 
    		
		root = add(root, value); 
  	} 
 
  	private IntegerTreeNode add(IntegerTreeNode node, int value) {
 
    		if (node==null) { 
      		
			node = new IntegerTreeNode(value); 
    		} else {
 
      			if (value <= node.value) {
 
        			node.left = add(node.left, value); 
      			} else {
 
        			node.right = add(node.right, value); 
      			} 
    		}

    		return(node); 
  	}

	public int getMin() {

		return (getMin(root).value);
	}

	public IntegerTreeNode getMin(IntegerTreeNode node) {

		if (node.left == null) {

			return node;
		} else {

			return getMin(node.left);
		}

	}

	public int getMax() {

		return (getMax(root).value);
	}

	public IntegerTreeNode getMax(IntegerTreeNode node) {

		if (node.right == null) {

			return node;
		} else {

			return getMax(node.right);
		}

	}

	public int getDepth() {

		return (getDepth(root));
	}

	public int getDepth(IntegerTreeNode node) {

		int leftDepth = 0;

		if(node.left != null) {

			leftDepth = getDepth(node.left);
		}

		int rightDepth = 0;

		if(node.right != null) {

			rightDepth = getDepth(node.right);
		}

		if (leftDepth > rightDepth) {

			return (1 + leftDepth);
		} else {

			return (1 + rightDepth);
		}
	}

  	public String toString() {
    
		return toString(root);
  	}

  	private String toString(IntegerTreeNode node) {
    
		if (node == null) {

      			return "";
    		}else {
      			String result = "[";
      			result += node.value;
      			result += toString(node.left) + "";
      			result += toString(node.right);
      			result += "]";
     			 return result;
    		}
  	}

		
}