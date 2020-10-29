package MyBinaryTree;

import org.junit.Assert;
import org.junit.Test;

public class MyBinaryTreeTest {

	@Test
	public void given3NumbersWhenAddedToBinaryTreeShouldReturnSizeThree() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		Assert.assertEquals(3, myBinaryTree.size());
	}

}
