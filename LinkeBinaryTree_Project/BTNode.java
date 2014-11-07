package lab6;
//*******************************************************************
//BTNode.java       Java Foundations
//
//Represents a node in a binary tree with a left and right child.
//Therefore this class also represents the root of a subtree.
//*******************************************************************



public class BTNode<T>
{
protected T element;
protected BTNode<T> left, right;

//-----------------------------------------------------------------
//  Creates a new tree node with the specified data.
//-----------------------------------------------------------------
public BTNode (T element)
{
  this.element = element;
  left = right = null;
}

//-----------------------------------------------------------------
//  Returns the element stored in this node.
//-----------------------------------------------------------------
public T getElement()
{
  return element;
}

//-----------------------------------------------------------------
//  Sets the element stored in this node.
//-----------------------------------------------------------------
public void setElement (T element)
{
  this.element = element;
}

//-----------------------------------------------------------------
//  Returns the left subtree of this node.
//-----------------------------------------------------------------
public BTNode<T> getLeft()
{
  return left;
}

//-----------------------------------------------------------------
//  Sets the left child of this node.
//-----------------------------------------------------------------
public void setLeft (BTNode<T> left)
{
  this.left = left;
}

//-----------------------------------------------------------------
//  Returns the right subtree of this node.
//-----------------------------------------------------------------
public BTNode<T> getRight()
{
  return right;
}

//-----------------------------------------------------------------
//  Sets the right child of this node.
//-----------------------------------------------------------------
public void setRight (BTNode<T> right)
{
  this.right = right;
}

//-----------------------------------------------------------------
//  Returns the element in this subtree that matches the
//  specified target. Returns null if the target is not found.
//-----------------------------------------------------------------
public BTNode<T> find (T target)
{
  BTNode<T> result = null;

  if (element.equals(target))
     result = this;
  else
  {
     if (left != null)
        result = left.find(target);
     if (result == null && right != null)
        result = right.find(target);
  }

  return result;
}

//-----------------------------------------------------------------
//  Returns the number of nodes in this subtree.
//-----------------------------------------------------------------
public int count()
{
  int result = 1;

  if (left != null)
     result += left.count();

  if (right != null)
     result += right.count();

  return result;
}

//-----------------------------------------------------------------
//  Performs an inorder traversal on this subtree, updating the
//  specified iterator.
//-----------------------------------------------------------------
public void inorder (ArrayIterator<T> iter)
{
  if (left != null)
     left.inorder (iter);

  iter.add (element);

  if (right != null)
     right.inorder (iter);
}

//----------------------------------------------------------------
// Addition of the height method. 
//----------------------------------------------------------------
public int heightOfBinaryTree(BTNode<T> btNode)
{
	
    if (btNode == null)
    {
        return 0;
    }
    else
    {
        return 1 +
        Math.max(heightOfBinaryTree(btNode.getLeft()),
            heightOfBinaryTree(btNode.getRight()));
    }
}
}
