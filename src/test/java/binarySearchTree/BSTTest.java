package binarySearchTree;
import org.junit.*;

import com.practice.binarysearchtree.BST;
public class BSTTest {
	@Test
	public void given3NumbersWhenAddedToBinaryTreeShouldReturnSizeThree() {
		BST binarySearchTree=new BST<>();
		binarySearchTree.add(56);
		binarySearchTree.add(30);
		binarySearchTree.add(70);
		
		int size=binarySearchTree.getSize();
		Assert.assertTrue(size==3);
	}
}
