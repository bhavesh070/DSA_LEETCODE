package PACKAGE_NAME.GFG.Graph;

public class CentreOFGraph {
    public static void main(String[] args) {
        int[][] n = {{1,2},{2,3},{4,2}};
        System.out.println(findCenter(n));
    }
    public static int findCenter(int[][] edges) {
        if (edges[0][0]==edges[1][0]){
            return edges[0][0];
        }else if(edges[0][0] == edges[1][1]){
            return edges[0][0];
        }else {
            return edges[0][1];
        }
    }
}
