package leetcode_mayChallenge;

import java.util.ArrayList;
import java.util.Arrays;

public class PossibleBiPartation {

public static  boolean possibleBipartition(int N, int[][] dislikes) {
int []groups=new int[N];
Arrays.fill(groups,-1);
	ArrayList<Integer>[] adj=new ArrayList[N]; 
	for (int i = 0; i < N; i++) {
		adj[i]=new ArrayList<>();
	}
	
	for (int []p : dislikes) {
		adj[p[0]-1].add(p[1]-1);
		adj[p[1]-1].add(p[0]-1);
	}

	
	for (int i = 0; i < N; i++) {
		if(groups[i]==-1 && !dfs(adj,groups,i,0))
			return false;
	}
	
	return true;
    }
	
	private static  boolean dfs(ArrayList<Integer>[] adj, int[] groups, int i, int j) {
	if(groups[i]==-1)
		groups[i]=j;
	else return groups[i]==j;
	
	for (int n : adj[i]) {
		if(!dfs(adj,groups,n,1-j))
			return false;
	}
	
	return true;
}

	public static void main(String[] args) {
		int N=4;
		int[][] dislikes= {{1,2},{1,3},{2,4}};
		possibleBipartition(N,dislikes);
	}
}
