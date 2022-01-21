package net.cplibrary.graph;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public class CentralDecomposition {
    private final int[] distance;
    private final int[] last;
    private final int[] mark;
    private final boolean[] processed;
    private final Graph graph;
    private final Callback callback;
    private final int[] queue;
    private int current;
    private int size;

    private CentralDecomposition(Graph graph, Callback callback) {
        this.graph = graph;
        this.callback = callback;
        int n = graph.vertexCount;
        distance = new int[n];
        last = new int[n];
        mark = new int[n];
        processed = new boolean[n];
        queue = new int[n];
    }

    public static void decompose(Graph graph, Callback callback) {
        new CentralDecomposition(graph, callback).run(0, -1);
    }

    private void run(int vertex, int parent) {
        vertex = calcDistances(vertex);
        vertex = calcDistances(vertex);
        int back = distance[vertex] >> 1;
        for (int i = 0; i < back; i++) {
            vertex = last[vertex];
        }
        callback.call(vertex, processed, parent, queue, size);
        processed[vertex] = true;
        for (int i = graph.firstOutbound(vertex); i != -1; i = graph.nextOutbound(i)) {
            int next = graph.destination(i);
            if (!processed[next]) {
                run(next, vertex);
            }
        }
    }

    private int calcDistances(int vertex) {
        size = 1;
        queue[0] = vertex;
        current++;
        mark[vertex] = current;
        distance[vertex] = 0;
        for (int i = 0; i < size; i++) {
            int current = queue[i];
            int cDist = distance[current];
            for (int j = graph.firstOutbound(current); j != -1; j = graph.nextOutbound(j)) {
                int next = graph.destination(j);
                if (!processed[next] && mark[next] != this.current) {
                    mark[next] = this.current;
                    distance[next] = cDist + 1;
                    last[next] = current;
                    queue[size++] = next;
                }
            }
        }
        return queue[size - 1];
    }

    public interface Callback {
        void call(int center, boolean[] processed, int parent, int[] queue, int size);
    }
}
