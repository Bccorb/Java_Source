package lab7;

import java.util.*;

public class ArrayBinaryTree<T> implements BinaryTreeADT<T>, Iterable<T>
{
	private static final int DEFAULT_CAPACITY = 50;
	
	protected int count;
	protected T[] tree;
	protected int modCount;
	
	/**
	 * Creates an empty binary tree.
	 */
	@SuppressWarnings("unchecked")
	public ArrayBinaryTree() 
	{
		count = 0;
		tree = (T[]) new Object[DEFAULT_CAPACITY];
	}
	
	/**
	 * Creates a binary tree with the specified element as its root.
	 * 
	 * @param element the element which will become the root of the new tree. 
	 */
	@SuppressWarnings("unchecked")
	public ArrayBinaryTree(T element)
	{
		count = 1;
		tree = (T[]) new Object[DEFAULT_CAPACITY];
		tree[0] = element;
	}
	
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getRootElement() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BinaryTreeADT<T> getLeft() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BinaryTreeADT<T> getRight() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contains(T target) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T find(T target) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
}
