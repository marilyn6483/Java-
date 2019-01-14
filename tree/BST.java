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
	//�洢Ԫ�ظ���
	private int size;
	
	//��ʼ��������������root�ڵ�Ϊ�գ���дҲ���ԣ���Ĭ�Ϲ��캯��һ��
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
	
	//ʹ�õݹ���ӽڵ�
	public Node add(Node node, E e) {
		
		if (node == null) {
			size++;
			//������ڵ�ҵ���ö������ϣ�   ��Ҫ������ڵ㷵�ظ�������
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
	
	//��ѯԪ��
	public boolean contains(E e) {
		return contains(root, e);
				
	}
	
	//��nodeΪ���Ķ������������Ƿ����e
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
	
	//������������ǰ�����
	public void preOrder() {
		preOrder(root);
	}
	
	private void preOrder(Node node) {
		if (node == null) {
			return;
		}
		
		System.out.println(node.e);
		preOrder(node.left);
		preOrder(node.right);
	}
	
	//�������
	public void inOder() {
		inOrder(root);
	}
	
	private void inOrder(Node node) {
		if (node == null) {
			return;
		}
		inOrder(node.left);
		System.out.println(node.e);
		inOrder(node.right);
	}

}
