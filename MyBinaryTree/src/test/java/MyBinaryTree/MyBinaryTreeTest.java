package MyBinaryTree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyBinaryTreeTest {

	private MyBinaryTree<Integer> myBinaryTree;

	@Before
	public void createAndAddElemenets() {
		myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		myBinaryTree.add(22);
		myBinaryTree.add(40);
		myBinaryTree.add(60);
		myBinaryTree.add(95);
		myBinaryTree.add(11);
		myBinaryTree.add(3);
		myBinaryTree.add(16);
		myBinaryTree.add(65);
		myBinaryTree.add(63);
		myBinaryTree.add(67);
	}

	@Test
	public void given3NumbersToAdd_WhenAnalysed_ShouldReturnSize13() {
		Assert.assertEquals(13, myBinaryTree.size());
	}

	@Test
	public void givenExistingElementToSearch_WhenAnalysed_ShouldReturnTheNumber() {
		Assert.assertEquals((Integer) 16, myBinaryTree.search(16));
	}

	@Test
	public void givenNonExistingElementToSearch_WhenAnalysed_ShouldReturnNull() {
		Assert.assertEquals(null, myBinaryTree.search(100));
	}

}
