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

}
