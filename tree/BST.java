package javaTest;

public class BST<E extends Comparable<E>>  {
	
	private class Node {
		public E e;
		public Node left;
		public Node right;
		
		public Node (E e){
			this.e = e;
			left = null;
			right = null;
			
		}
	}
	
	private Node root;
	//存储元素个数
	private int size;
	
	//初始化二分搜索树。root节点为空；不写也可以，和默认构造函数一样
	public BST() {
		root = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void add(E e) {
		root = add(root, e);
	}
	
	//使用递归添加节点
	public Node add(Node node, E e) {
		
		if (node == null) {
			size++;
			//将这个节点挂到这棵二叉树上，需要将这个节点返回给调用者
			return new Node(e);
		}
		
		if (e.compareTo(node.e) < 0) {
			node.left = add(node.left, e);
		} 
		else if (e.compareTo(node.e) > 0) {
			node.right = add(node.right, e);
		}
		
		return node;
		
		
	}
	
	//查询元素
	public boolean contains(E e) {
		return contains(root, e);
				
	}
	
	//以node为根的二分搜索树中是否包含e
	private boolean contains(Node node, E e) {
		
		if (node == null) {
			return false;
		}
		
		if (e.compareTo(node.e) == 0) {
			return true;
		} else if (e.compareTo(node.e) > 0) {
			return contains(node.right, e);
		}else { 
//		else if (e.compareTo(node.e) < 0) {
			return contains(node.left, e);
		}
	}

}
