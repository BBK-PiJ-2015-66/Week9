// BinaryTreeScript.java

public class IntegerBinaryTreeScript {

	public static void main(String[] args) {

		IntegerBinaryTree bTree = new IntegerBinaryTree();

		bTree.add(6);
		bTree.add(9);
		bTree.add(5);
		bTree.add(3);
		bTree.add(8);
		bTree.add(11);
		bTree.add(12);		

		System.out.println(bTree);

		
		if ((bTree.contains(8)) == true) {

			System.out.println("The int, 8, is found");
		} else {

			System.out.println("The int, 8, is not found");
		}

		if ((bTree.contains(13)) == true) {

			System.out.println("The int, 13, is found");
		} else {

			System.out.println("The int, 13, is not found");
		}

		System.out.println("The min value: " + bTree.getMin());
		
		System.out.println("The max value: " + bTree.getMax());

		System.out.println("The debth: " + bTree.getDepth());
	}
}		
