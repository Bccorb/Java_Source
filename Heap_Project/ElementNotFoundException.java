package lab7;
//********************************************************************
//ElementNotFoundException.java     Java Foundations
//
//Represents the situation in which a target element is not
//present in a collection
//********************************************************************


@SuppressWarnings("serial")
public class ElementNotFoundException extends RuntimeException
{
//------------------------------------------------------------------
//  Sets up this exception with an appropriate message.
//------------------------------------------------------------------
public ElementNotFoundException (String message)
{
super (message);
}
}


