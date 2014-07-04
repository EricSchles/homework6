package homework6;

public class testingQuestionOne {

	public static void main(String[] args){
		
		BSTree<Integer> tree = new BSTree<Integer>();
		tree.add(1);
		tree.add(2);
		tree.add(3);
		tree.add(17);
		tree.add(25);
		tree.add(-7);
		tree.add(-1);
		tree.add(-57);
		
		tree.inOrderTraversal();
		System.out.println(tree.contains(8));
	}
}
