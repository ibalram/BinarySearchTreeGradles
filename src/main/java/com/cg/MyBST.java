package com.cg;

public class MyBST<K extends Comparable<K>> {
	private MyBinaryNode<K> root;

	public MyBST() {
		this.root = null;
	}

	public void add(K key) {
		this.root = this.addRecursive(root, key);
	}

	private MyBinaryNode<K> addRecursive(MyBinaryNode<K> root, K key) {
		if (root == null) {
			return new MyBinaryNode<K>(key);
		}
		int compared = root.key.compareTo(key);
		if (compared == 0)
			return root;
		if (compared < 0) {
			root.right = addRecursive(root.right, key);
		} else {
			root.left = addRecursive(root.left, key);
		}
		return root;

	}

	public int getSize() {
		return this.getSizeRecursive(root);
	}

	private int getSizeRecursive(MyBinaryNode<K> root) {
		return root == null ? 0 : 1 + this.getSizeRecursive(root.left) + this.getSizeRecursive(root.right);
	}

	public boolean search(K key) {
		return this.searchRecursive(root, key);
	}

	private boolean searchRecursive(MyBinaryNode<K> root, K key) {
		if (root == null) {
			return false;
		}
		int compared = root.key.compareTo(key);
		if (compared == 0)
			return true;
		else if (compared < 0)
			return searchRecursive(root.right, key);
		else
			return searchRecursive(root.left, key);
	}

}
