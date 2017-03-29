package graph;

import java.util.LinkedList;
import java.util.List;

public class Node {

	String node;
	List<Node> adjacentNodes;
	
	public Node(String node){
		
		this.node = node;
		adjacentNodes = new LinkedList<Node>();
	}
	
	public String getNode(){
		return node;
	}
	
	public void addAdjacentNodes(Node node){
		
		adjacentNodes.add(node);
	}
	
	public List<Node> getAdjacentNodes(){
		
		return adjacentNodes;
	}
}
