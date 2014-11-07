package lab6;
//********************************************************************
//BackPainAnalyzer.java       Java Foundations
//
//Demonstrates the use of a binary tree.
//********************************************************************

public class CollegeMajorAnalyzer
{
//-----------------------------------------------------------------
//  Asks questions of the user to diagnose a medical problem.
//-----------------------------------------------------------------
public static void main (String[] args)
{
	
  MajorExpert expert = new MajorExpert();
  System.out.println("This program has " + expert.height() + " levels of questions. Enjoy!");
  expert.choose();
}
}
