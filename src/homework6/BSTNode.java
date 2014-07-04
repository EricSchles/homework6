package homework6;

public class BSTNode <T extends Comparable <T> > 
						implements Comparable < BSTNode<T> >{

		private T data;         		//the data stored in the node
		private BSTNode <T> left;       //left node of the tree
		private BSTNode <T> right;		//right node of the tree
		
		//constructor - note I set both left and right to null to be sure
		public BSTNode(T item){
			this.data = item;
			this.left = null;
			this.right = null;
		}
		
		//return the data stored in the current node
		public T getInfo(){
			return this.data;
		}
		//gets the left node
		public BSTNode<T> getLeft(){
			return this.left;
		}
		//sets the left node.
		public void setLeft(BSTNode<T> node){
			this.left = node;
		}
		//gets the right node
		public BSTNode<T> getRight(){
			return this.right;
		}
		//sets the right node.
		public void setRight(BSTNode<T> node){
			this.right = node;
		}
		//calls the compareTo method of the base type
		public int compareTo( BSTNode <T> other){
			return this.data.compareTo( other.data);
		}
}
