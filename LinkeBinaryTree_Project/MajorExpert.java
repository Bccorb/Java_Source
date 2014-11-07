package lab6;
//********************************************************************
//BackPainExpert.java       Java Foundations
//
//Represents a simple expert system for back pain diagnosis.
//********************************************************************


import java.util.Scanner;

public class MajorExpert
{
private LinkedBinaryTree<String> tree;

//-----------------------------------------------------------------
//  Sets up the major selections question tree.
//-----------------------------------------------------------------
public MajorExpert()
{
  String e1 = "Do you like math and/or Science?";
  String e2 = "Do you like to drawing or painting?";
  String e3 = "Do you like computers as well?";
  String e4 = "Do you like History?";
  String e5 = "Do you like graphic art?";
  String e6 = "Well, then do you like medcine?";
  String e7 = "Do you find programming interesting?";
  String e8 = "Hmmmm, this is tough. You should do General Education for now.";
  String e9 = "We have your major become a Historian.";
  String e10 = "Major in Art with a focus in visual media.";
  String e11 = "Major in computer graphics design.";
  String e12 = "Thing major in Physics, Biology or Chemistry.";
  String e13 = "Looks like your destined to be a doctor.";
  String e14 = "Major in Information Technology.";
  String e15 = "Major in Computer Science or Engineering.";

  LinkedBinaryTree<String> n2, n3, n4, n5, n6, n7, n8, n9,
     n10, n11, n12, n13, n14, n15;

  n8 = new LinkedBinaryTree<String>(e8);
  n9 = new LinkedBinaryTree<String>(e9);
  n4 = new LinkedBinaryTree<String>(e4, n8, n9);

  n10 = new LinkedBinaryTree<String>(e10);
  n11 = new LinkedBinaryTree<String>(e11);
  n5 = new LinkedBinaryTree<String>(e5, n10, n11);

  n12 = new LinkedBinaryTree<String>(e12);
  n13 = new LinkedBinaryTree<String>(e13);
  n14 = new LinkedBinaryTree<String>(e14);
  n15 = new LinkedBinaryTree<String>(e15);
  n6 = new LinkedBinaryTree<String>(e6, n12, n13);

  n7 = new LinkedBinaryTree<String>(e7, n14, n15);

  n2 = new LinkedBinaryTree<String>(e2, n4, n5);
  n3 = new LinkedBinaryTree<String>(e3, n6, n7);

  tree = new LinkedBinaryTree<String>(e1, n2, n3);
}

//-----------------------------------------------------------------
//  Follows the diagnosis tree based on user responses.
//-----------------------------------------------------------------
public void choose()
{
  Scanner scan = new Scanner(System.in);
  BinaryTree<String> current = tree;

  System.out.println ("Let me suggest your major! (Use 'Y' for yes and 'N' for no)");
  while (current.size() > 1)
  {
     System.out.println (current.getRootElement());
     if (scan.nextLine().equalsIgnoreCase("N"))
        current = current.getLeft();
     else
        current = current.getRight();
  }

  System.out.println (current.getRootElement());
  scan.close();
}

public int height()
{
	return tree.height();
}
}