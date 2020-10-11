package binarySearchTree;

import org.junit.*;

import com.practice.binarysearchtree.BST;

public class BSTTest {
	@Test
	public void given13NumbersWhenAddedToBinaryTreeShouldReturnSize13() {
		BST binarySearchTree = new BST<>();
		binarySearchTree.add(56);
		binarySearchTree.add(30);
		binarySearchTree.add(70);
		binarySearchTree.add(22);
		binarySearchTree.add(40);
		binarySearchTree.add(60);
		binarySearchTree.add(95);
		binarySearchTree.add(11);
		binarySearchTree.add(65);
		binarySearchTree.add(3);
		binarySearchTree.add(16);
		binarySearchTree.add(63);
		binarySearchTree.add(67);

		int size = binarySearchTree.getSize();
		Assert.assertTrue(size == 13);
	}
}
