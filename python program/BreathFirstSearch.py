def bfs(graph, start):
    visited = []        # list to keep track of visited nodes
    queue = [start]     # start with the first node

    while queue:
        node = queue.pop(0)   # take first element from queue
        if node not in visited:
            print(node, end=" ")
            visited.append(node)
            queue.extend(graph[node])  # add all neighbours to queue


# Driver code
graph = {
    'A': ['B', 'C'],
    'B': ['D', 'E'],
    'C': ['F'],
    'D': [],
    'E': ['F'],
    'F': []
}

print("BFS Traversal:")
bfs(graph, 'A')
