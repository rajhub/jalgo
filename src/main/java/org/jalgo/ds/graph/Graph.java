package org.jalgo.ds.graph;

import java.util.*;

public class Graph {
    private Map<String, List<String>> edges = new HashMap<String, List<String>>();

    public void addEdge(String src, String dest) {
        List<String> srcNeighbors = this.edges.get(src);
        if (srcNeighbors == null) {
            this.edges.put(src,
                    srcNeighbors = new ArrayList<String>()
            );
        }
        srcNeighbors.add(dest);
    }

    public Iterable<String> getNeighbors(String vertex) {
        List<String> neighbors = this.edges.get(vertex);
        if (neighbors == null) {
            return Collections.emptyList();
        } else {
            return Collections.unmodifiableList(neighbors);
        }
    }
}
