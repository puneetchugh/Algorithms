package algorithm;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import graph.Graph;
import graph.Node;

public class Main {

	public static void main(String[] args){
		
		Graph graph = new Graph();
		Node startNode = initializeGraph(graph);
		
		Set<Node> visited = new HashSet<>();
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(startNode);
		
		while(!queue.isEmpty()){
			
			Node currentNode = queue.remove();
			visited.add(currentNode);
			System.out.println(currentNode.getNode());
			List<Node> adjacentNodes = currentNode.getAdjacentNodes();
			for(Node individualNode : adjacentNodes){
				if(!visited.contains(individualNode))
				queue.add(individualNode);
			}
		}
		
	}
	
	public static Node initializeGraph(Graph graph){
		
		Node nodeA = new Node("A");
		Node nodeB = new Node("B");
		Node nodeC = new Node("C");
		Node nodeD = new Node("D");
		Node nodeE = new Node("E");
		Node nodeF = new Node("F");
		Node nodeG = new Node("G");
		Node nodeH = new Node("H");
		Node nodeZ = new Node("Z");
		Node nodeX = new Node("X");
		
		nodeA.addAdjacentNodes(nodeB);
		nodeA.addAdjacentNodes(nodeC);
		nodeA.addAdjacentNodes(nodeD);
		
		nodeB.addAdjacentNodes(nodeE);
		
		nodeC.addAdjacentNodes(nodeF);
		
		nodeD.addAdjacentNodes(nodeZ);
		nodeD.addAdjacentNodes(nodeX);
		
		nodeE.addAdjacentNodes(nodeG);
		
		nodeF.addAdjacentNodes(nodeH);
		
		
		return nodeA;
	}
}
