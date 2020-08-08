package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BredthFirstSearch {
	int v;
	ArrayList<Integer> adj[];

	public BredthFirstSearch(int v) {
		this.v = v;
		adj = new ArrayList[v];
		for (int i = 0; i < v; i++) {
			adj[i] = new ArrayList<Integer>();
		}
	}

	public static void main(String[] args) {
		int v = 4;
		BredthFirstSearch bfs = new BredthFirstSearch(v);
		bfs.addEdge(0, 1);
		bfs.addEdge(0, 2);
		bfs.addEdge(1, 2);
		bfs.addEdge(2, 0);
		bfs.addEdge(2, 3);
		bfs.addEdge(3, 3);
		bfs.breadthFirstSearch(2);
	}

	private void breadthFirstSearch(int s) {
		Queue<Integer> queue = new LinkedList<>();
		Boolean visited[] = new Boolean[v];
		Arrays.fill(visited, false);
		visited[s] = true;
		queue.add(s);
		while (!queue.isEmpty()) {
			s = queue.poll();
			System.out.println(s);
			Iterator<Integer> iterator = adj[s].listIterator();
			while (iterator.hasNext()) {
				int n = iterator.next();
				if (!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}

		}

	}

	private void addEdge(int v, int w) {
		adj[v].add(w);
	}
}
