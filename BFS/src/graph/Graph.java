package graph;

import java.util.LinkedList;
import java.util.List;

public class Graph {

	List<Node> nodesList;
	
	public Graph(){
		nodesList = new LinkedList<Node>();
		
	}
	
	public void addNode(Node newNode){
		
		nodesList.add(newNode);
	}
}
