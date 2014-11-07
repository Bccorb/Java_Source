//********************************************************************
//ArrayIterator.java       Java Foundations
//
//Represents an iterator over the elements of a collection.
//********************************************************************
package lab6;


import java.util.*;

public class ArrayIterator<T> implements Iterator<T>
{
private int DEFAULT_CAPACITY = 10;
private int count;    // the number of elements in the iterator
private int current;  // the current position in the iteration
private T[] items;    // the iterator's storage for elements

//-----------------------------------------------------------------
//  Sets up this iterator.
//-----------------------------------------------------------------
@SuppressWarnings("unchecked")
public ArrayIterator()
{
  items = (T[]) (new Object[DEFAULT_CAPACITY]);
  count = 0;
  current = 0;
}

//-----------------------------------------------------------------
//  Adds the specified item to this iterator.
//-----------------------------------------------------------------
public void add (T item)
{
  if (count == items.length)
     expandCapacity();

  items[count] = item;
  count++;
}

//-----------------------------------------------------------------
//  Returns true if this iterator has at least one more element to
//  deliver in the iteration.
//-----------------------------------------------------------------
public boolean hasNext()
{
  return (current < count);
}

//-----------------------------------------------------------------
//  Returns the next element in the iteration. If there are no more
//  elements in this iteration, a NoSuchElementException is thrown.
//-----------------------------------------------------------------
public T next()
{
  if (! hasNext())
     throw new NoSuchElementException();

  current++;

  return items[current - 1];
}

//-----------------------------------------------------------------
//  The remove operation is not supported in this collection.
//-----------------------------------------------------------------
public void remove() throws UnsupportedOperationException
{
 throw new UnsupportedOperationException();
}

//-----------------------------------------------------------------
//  Exapands the capacity of the storage array
//-----------------------------------------------------------------
private void expandCapacity()
{
  @SuppressWarnings("unchecked")
T[] larger = (T []) (new Object[items.length*2]);

  int location = 0;
  for (T element : items)
     larger[location++] = element;

  items = larger;
}
}
