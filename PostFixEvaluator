//*********************************************************************************
//Program:			  PostFixEvaluator.java
//Programmer:		  Brandon Corbett
//Date:				    Sept 24, 2014
//Description:		Represents an integer evaluator of postfix expressions.
//**********************************************************************************
package lab3;

import java.util.Stack;
import java.util.Scanner;

public class PostFixEvaluator 
{
	private final static char ADD = '+';
	private final static char SUBTRACT = '-';
	private final static char MULTIPLY = '*';
	private final static char DIVIDE = '/';
	
	private Stack<Integer> stack;
	
	public PostFixEvaluator()
	{
		stack = new Stack<Integer>();
	}
	
	public int evaluate(String expr)
	{
		int op1, op2, result = 0;
		String token;
		Scanner parser = new Scanner(expr);
		
		while (parser.hasNext())
		{
			token = parser.next();
			if (isOperator(token))
			{
				op2 = (stack.pop()).intValue();
				op1 = (stack.pop()).intValue();
				result = evaluateSingleOperator(token.charAt(0), op1, op2);
				stack.push(new Integer(result));
			}
			else
				stack.push(new Integer(Integer.parseInt(token)));
		}
		parser.close();
		return result;
	}
	
	private boolean isOperator(String token)
	{
		return (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/") );
	}
	
	private int evaluateSingleOperator(char operation, int op1, int op2)
	{
		int result = 0;
		
		switch(operation)
		{
		case ADD:
			result = op1 + op2;
			break;
		case SUBTRACT:
			result = op1 - op2;
			break;
		case MULTIPLY:
			result = op1 * op2;
			break;
		case DIVIDE:
			result = op1 / op2;
			break;
		}
		
		return result;
	}
}
