package DataStructures.Tree.TreeX;

public class TreeX {
	private Node root;
	
	public TreeX() {
		root = null;
	}
	
	public Node find(int key) {
		Node current = root;
		
		while(current.iData != key) {
			if(key< current.iData) current = current.leftchild;
            else current = current.rightChild;
			if(current == null) return null;
		}
		return current;
	}
	
	@SuppressWarnings("unused")
	public void insert(int id,double dData) {
		Node newNode = new Node();
		newNode.iData =  id;
		newNode.dData = dData;
	
		if(root==null) root =  newNode;
		
		else {
			Node current = root;
			Node parent;
			
			while(true) {
				parent = current;
				if(id < current.iData) {
					current =  current.leftchild;
					if(current == null) {
						parent.leftchild = newNode;
						return ;
					}
				}
				else {
					if(id > current.iData) {
						current = current.rightChild;
						if(current ==null) {
							parent.rightChild = newNode;
							return ;
						}
					}
				}
			}
		}
	}
	
	public Node minimum() {
		Node cur = root;
		while(cur.leftchild!=null) {
			cur = cur.leftchild;
		}
		
		return cur;
		
	}
	public Node maximum() {
		Node cur =root;
		while(cur.rightChild!=null) {
			cur = cur.rightChild;
		}
		
		return cur;
	}
	
	private void inOrder(Node localRoot) {
		
		if(localRoot!= null) {
			inOrder(localRoot.leftchild);
			localRoot.displayNode();
			inOrder(localRoot.rightChild);
		}
	}
	public void inOrder() {
		inOrder(root);
	}
	
	private void preOrder(Node localRoot) {
		
		if(localRoot!= null) {
			localRoot.displayNode();
			preOrder(localRoot.leftchild);
			preOrder(localRoot.rightChild);
		}
	}
	public void preOrder() {
		preOrder(root);
	}
	
	private void postOrder(Node localRoot) {
		if(localRoot!= null) {
			
			postOrder(localRoot.leftchild);
			postOrder(localRoot.rightChild);
			localRoot.displayNode();
		}
	}
	public void postOrder() {
		postOrder(root);
	}
	
}
