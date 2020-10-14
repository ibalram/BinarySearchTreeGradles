package com.cg;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinarySearchTreeTest {

	@Test
	public void testAddIntoBinarySearchTree() {
		MyBST bst = new MyBST<Integer>();
		bst.add(30);
		bst.add(56);
		bst.add(70);
	}
	
}
