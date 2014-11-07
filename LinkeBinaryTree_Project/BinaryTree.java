package lab6;

//*******************************************************************
//BinaryTree.java       Java Foundations
//
//Defines the interface to a binary tree collection.
//*******************************************************************



//import java.util.Iterator;

public interface BinaryTree<T> extends Iterable<T>
{
//  Returns the element stored in the root of the tree.
public T getRootElement();

//  Returns the left subtree of the root.
public BinaryTree<T> getLeft();

//  Returns the right subtree of the root.
public BinaryTree<T> getRight();

//  Returns true if the binary tree contains an element that
//  matches the specified element and false otherwise.
public boolean contains (T target);

//  Returns a reference to the element in the tree matching
//  the specified target.
public T find (T target);

//  Returns true if the binary tree contains no elements, and
//  false otherwise.
public boolean isEmpty();

//  Returns the number of elements in this binary tree.
public int size();

//  Returns the string representation of the binary tree.
public String toString();


}
