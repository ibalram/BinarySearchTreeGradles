package com.cg;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class BinarySearchTreeTest {

	@Test
	public void testAddIntoBinarySearchTreeAndGetSize() {
		MyBST bst = new MyBST<Integer>();
		int[] list = {56,30,70, 22,40,11,3,16,60,95,65, 63, 67};
		
		for(int i = 0; i<list.length; ++i)
			bst.add(list[i]);
		assertEquals(13, bst.getSize());
	}
	
}
