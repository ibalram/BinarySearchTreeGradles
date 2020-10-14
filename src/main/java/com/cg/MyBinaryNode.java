package com.cg;

public class MyBinaryNode<K extends Comparable<K>> {
	K key;
	MyBinaryNode<K> left;
	MyBinaryNode<K> right;

	public MyBinaryNode(K key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public K getKey() {
		return key;
	}

	public void setLeft(MyBinaryNode<K> left) {
		this.left = left;
	}

	public MyBinaryNode<K> getLeft() {
		return left;
	}

	public void setRight(MyBinaryNode<K> right) {
		this.right = right;
	}

	public MyBinaryNode<K> getRight() {
		return right;
	}

}
