package PACKAGE_NAME.GFG.Graph;

import java.util.ArrayList;
import java.util.List;
class Graph{
    public int numofvertices;
    public List<List<Integer>> adj;

    public Graph(int numofvertices){
        this.numofvertices = numofvertices;
        adj = new ArrayList<>(numofvertices);
    }

    public void addNode(int source , int destination){
        adj.get(source).add(destination);
        adj.get(destination).add(source);
    }

    @Override
    public String toString() {
        return "Graph{" +
                "numofvertices=" + numofvertices +
                ", adj=" + adj +
                '}';
    }
}
public class Main{
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addNode(4,3);
        graph.addNode(1,2);
        System.out.println(graph.toString());

    }

}