package lab8;
/**
 * Represents a Graph using an adjacency matrix and is also a network.
 * 
 * @author Brandon Corbett
 * @version 1.0
 */

public class Graph implements NetworkADT
{
	protected int numVertices;
	protected int[] [] adjMatrix;
	protected int edgeCount;
	
	/**
	 * Constructor for Graph
	 * 
	 * @param count the number of rows and columns that will be in the Matrix
	 */
	public Graph(int count) 
	{
		numVertices = count;
		this.adjMatrix = new int[count] [count];
		edgeCount = 0;
	}
	
	/**
	 * AddVertex adds a vertex into the matrices
	 * 
	 * @param vertex the number point of where the vertex will be entered
	 */
	@Override
	public void addVertex(int vertex) 
	{
		
		
	}

	/**
	 * Removes a vertex from the matrices
	 * 
	 * @param vertex the vertex to be removed
	 */
	@Override
	public void removeVertex(int vertex) 
	{
		
	}
	
	/**
	 * adds an edge between two vertices and assigns a weight and direction
	 * 
	 * @param vertex1 the first vertex the edge leads points away
	 * @param vertex2 the second vertex the edge points to 
	 * @param weight the amount associated with the edge
	 * @param d if the edge is directed or not
	 */
	@Override
	public void addEdge(int vertex1, int vertex2, int weight, boolean d) 
	{
		adjMatrix[vertex1 - 1][vertex2 - 1] = weight;
		edgeCount++;		
	}

	/**
	 * Removes edge between two given martices
	 * 
	 * @param vertex1 the first vertex
	 * @param vertex2 the second vertex
	 * @param boolean d set to false to remove any edge association
	 */
	public void removeEdge(int vertex1, int vertex2, boolean d) 
	{
		adjMatrix[vertex1 - 1][vertex2 - 1] = 0;
		edgeCount--;
		
	}

	/**
	 * Checks to see if the graph is empty
	 * 
	 * @return true if there are any vertices in the graph
	 */
	@Override
	public boolean isEmpty() 
	{
		if(numVertices == 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean isConnected() 
	{
		
		return false;
	}

	/**
	 * Returns the number of vertices in the graph
	 * 
	 * @return numVertices the number of vertices
	 */
	@Override
	public int size() 
	{
		return numVertices;
	}
	
	public String toString()
	{
		String temp = " ";
		for(int i = 0; i < numVertices; i++)
			temp = temp + " " + (i + 1);
		temp = temp + "\n";
		for (int i = 0; i < numVertices; i++)
		{
			temp = temp + (i + 1);
			for(int j = 0; j < numVertices; j++)
				temp = temp + " " + adjMatrix[i][j];
			temp = temp + "\n";
		}
		return temp;
	}
}
