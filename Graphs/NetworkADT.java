package lab8;
/**
 * Network interface is the ADT for a network graph implementation
 * 
 * @author Brandon Corbett
 * @version	1.0
 */

public interface NetworkADT
{
	public void addVertex(int vertex);
	
	public void removeVertex(int vertex);
	
	public void addEdge(int vertex1, int vertex2, int weight, boolean d);
	
	public void removeEdge(int vertex1, int vertex2, boolean d);
	
	public boolean isEmpty();
	
	public boolean isConnected();
	
	public int size();
	
	public String toString();
}
