package lab7;
//*******************************************************************
//LinkedBinaryTree.java       Java Foundations
//
//Implements a binary tree using a linked representation.
//*******************************************************************
import java.util.Iterator;


public class LinkedBinaryTree<T> implements BinaryTreeADT<T>, Iterable<T>
{
	protected BTNode<T> root;
	
	//-----------------------------------------------------------------
	//  Creates an empty binary tree.
	//-----------------------------------------------------------------
	public LinkedBinaryTree()
	{
	  root = null;
	}
	
	//-----------------------------------------------------------------
	//  Creates a binary tree with the specified element as its root.
	//-----------------------------------------------------------------
	public LinkedBinaryTree (T element)
	{
	  root = new BTNode<T>(element);
	}
	
	//-----------------------------------------------------------------
	//  Creates a binary tree with the two specified subtrees.
	//-----------------------------------------------------------------
	public LinkedBinaryTree (T element, LinkedBinaryTree<T> left,
	  LinkedBinaryTree<T> right)
	{
	  root = new BTNode<T>(element);
	  root.setLeft(left.root);
	  root.setRight(right.root);
	}
	
	//-----------------------------------------------------------------
	//  Returns the element stored in the root of the tree. Throws an
	//  EmptyCollectionException if the tree is empty.
	//-----------------------------------------------------------------
	public T getRootElement()
	{
	  if (root == null)
	     throw new EmptyCollectionException ("Get root operation "
	        + "failed. The tree is empty.");
	
	  return root.getElement();
	}
	
	//-----------------------------------------------------------------
	//  Returns the left subtree of the root of this tree.
	//-----------------------------------------------------------------
	public LinkedBinaryTree<T> getLeft()
	{
	  if (root == null)
	     throw new EmptyCollectionException ("Get left operation "
	        + "failed. The tree is empty.");
	
	  LinkedBinaryTree<T> result = new LinkedBinaryTree<T>();
	  result.root = root.getLeft();
	
	  return result;
	}
	
	//-----------------------------------------------------------------
	//  Returns the element in this binary tree that matches the
	//  specified target. Throws a ElementNotFoundException if the
	//  target is not found.
	//-----------------------------------------------------------------
	public T find (T target)
	{
	  BTNode<T> node = null;
	
	  if (root != null)
	     node = root.find(target);
	
	  if (node == null)
	     throw new ElementNotFoundException("Find operation failed. "
	        + "No such element in tree.");
	
	  return node.getElement();
	}
	
	//-----------------------------------------------------------------
	//  Returns the number of elements in this binary tree.
	//-----------------------------------------------------------------
	public int size()
	{
	  int result = 0;
	
	  if (root != null)
	     result = root.count();
	
	  return result;
	}
	
	//----------------------------------------------------------------------
	// Adding a height method to identify the height of a tree.
	//----------------------------------------------------------------------
	public int height()
	{
		int result = 0;
		
		if (root == null)
			return result;
		
		return root.heightOfBinaryTree(root);
	}
	
	public Iterator<T> iterator() {
	    return new ArrayIterator<T>();
	}
	
	@Override
	public BinaryTreeADT<T> getRight() {
		  if (root == null)
			     throw new EmptyCollectionException ("Get right operation "
			        + "failed. The tree is empty.");
	
			  LinkedBinaryTree<T> result = new LinkedBinaryTree<T>();
			  result.root = root.getRight();
	
			  return result;
	}
	
	/**
	 * Checks if element is in the tree
	 * 
	 * @return Returns true if element is present
	 */
	public boolean contains(T target) {
		
		return false;
	}
	
	/**
	 * Checks is the tree is empty
	 * 
	 * @return Returns true if there are no nodes in the tree
	 */
	public boolean isEmpty() 
	{
	
		if (root == null)
			return true;
		else
		return false;
	}
}



