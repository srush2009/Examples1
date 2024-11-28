import java.util.ArrayList;

abstract class GraphElement{
	abstract String displayInfo();
}
class Node1 extends GraphElement{
	String name;
	Node1(String name){
		this.name=name;
	}
	@Override
	String displayInfo() {
		return "Node: "+name;
	}
}
class Edge extends GraphElement{
	Node1 source;
	Node1 target;
	Edge(Node1 source,Node1 target){
		this.source=source;
		this.target=target;
	}
	@Override
	String displayInfo() {
		return "Edge: "+source.name+"->"+target;
	}
}
class Graph {
		ArrayList<Node1> nodes=new ArrayList<>();
		ArrayList<Edge> edges=new ArrayList<>();
		
		void addNode(Node1 node) {
			nodes.add(node);
		}
		void addEdge(Edge edge) {
			edges.add(edge);
		}
		
		ArrayList<Edge> findPath(Node1 startNode, Node1 endNode,ArrayList<Node1> visited,ArrayList<Edge> path){
			if(visited==null) {
				visited=new ArrayList<>();
			}
			if(path==null) {
				path=new ArrayList<>();
			}
			visited.add(startNode);
			for(Edge edge:edges) {
				if(edge.source==startNode && !visited.contains(edge.target)) {
					path.add(edge);
					if(edge.target==endNode) {
						return path;
					}else {
						ArrayList<Edge> newPath=findPath(edge.target,endNode,visited,path);
						if(newPath!=null) {
							return newPath;
						}
					}
					path.remove(path.size()-1);
				}
			}
			return null;
		}

public static void main(String[] args) {
	Graph graph=new Graph();
	Node1 node1=new Node1("A");
	Node1 node2=new Node1("B");
	Node1 node3=new Node1("C");
	Edge edge1=new Edge(node1,node2);
	Edge edge2=new Edge(node2,node3);
	Edge edge3=new Edge(node3,node1);
	
	graph.addNode(node1);
	graph.addNode(node2);
	graph.addNode(node3);
	graph.addEdge(edge1);
	graph.addEdge(edge2);
	graph.addEdge(edge3);
	
	printPath("From Node 1 to 2: ",node1,node2,graph);
	printPath("From Node 2 to 3: ",node2,node3,graph);
	printPath("From Node 3 to 1: ",node3,node1,graph);
}

private static void printPath(String Label,Node1 startNode,Node1 endNode,Graph graph) {
	ArrayList<Edge> path=graph.findPath(startNode, endNode, null, null);
	if(path!=null) {
		System.out.println(Label);
		for(Edge edge:path) {
			System.out.println(edge.displayInfo());
		}
		System.out.println();
	}else {
		System.out.println(Label+"Path not Found");
	}
			
}
}
