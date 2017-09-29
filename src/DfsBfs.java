import java.util.ArrayDeque;
import java.util.Arrays;

public class DfsBfs {

	// Adjacency matrix for the graph
	public static int[][] AdjMatrix;

	public static int[] bfs(int begin) {
		int[] prev = new int[AdjMatrix.length];
		ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
		Arrays.fill(prev, -2);

		queue.addLast(begin);
		prev[begin] = -1;

		while (queue.size() != 0) {
			int currentNode = queue.removeFirst();

			for (int i = 0; i < prev.length; i++) {
				if (AdjMatrix[currentNode][i] > 0 && prev[i] == -2) {
					prev[i] = currentNode;
					queue.addLast(i);
				}
			}
		}
		return prev;
	}

	public static int[] dfsIterative(int begin) {
		int[] prev = new int[AdjMatrix.length];
		ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
		Arrays.fill(prev, -2);

		stack.addFirst(begin);
		prev[begin] = -1;

		while (stack.size() != 0) {
			int currentNode = stack.removeFirst();

			for (int i = 0; i < prev.length; i++) {
				if (AdjMatrix[currentNode][i] > 0 && prev[i] == -2) {
					prev[i] = currentNode;
					stack.addFirst(i);
				}
			}
		}
		return prev;
	}
	
	
	public static void dfsRecursive(boolean[] visited, int n) {
		visited[n] = true;
		for (int i = 0; i < AdjMatrix.length; i++) 
			if (AdjMatrix[n][i] != 0 && !visited[i])
	 			dfsRecursive(visited, i);
	}


}