package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class DepthFirstSearch {

	int v;
	ArrayList<Integer> adj[];

	public DepthFirstSearch(int v) {
		this.v = v;
		adj = new ArrayList[v];
		for (int i = 0; i < v; i++) {
			adj[i] = new ArrayList<>();
		}
	}

	public static void main(String[] args) {
		int v = 4;
		DepthFirstSearch dfs = new DepthFirstSearch(v);
		dfs.addEdge(0, 1);
		dfs.addEdge(0, 2);
		dfs.addEdge(1, 2);
		dfs.addEdge(2, 0);
		dfs.addEdge(2, 3);
		dfs.addEdge(3, 3);
		dfs.depthFirstSearch(2);
	}

	private void depthFirstSearch(int s) {
		boolean visited[] = new boolean[v];
		Arrays.fill(visited, false);
		depthFirstSearchUtil(s, visited);

	}

	private void depthFirstSearchUtil(int s, boolean[] visited) {
		visited[s] = true;
		System.out.println(s);
		Iterator<Integer> iterator = adj[s].listIterator();
		while (iterator.hasNext()) {
			int n = iterator.next();
			if (!visited[n]) {
				depthFirstSearchUtil(n, visited);
			}
		}
	}

	private void addEdge(int v, int w) {
		adj[v].add(w);
	}
}
