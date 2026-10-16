/**
LeetCode 1971. 그래프에 경로가 존재하는지 확인하기
문제 해석
n개의 정점(Vertex)을 가진 **양방향 그래프(Bi-directional Graph)**가 주어집니다.
각 정점에는 0부터 n - 1까지의 번호가 붙어 있습니다. (0과 n - 1 포함)

그래프의 간선(Edge)은 **2차원 정수 배열 edges**로 표현됩니다.

각 edges[i] = [ui, vi]는 정점 ui와 정점 vi 사이에 양방향 간선이 존재한다는 의미입니다.
이 그래프에는 다음과 같은 조건이 있습니다.
- 두 정점 사이에는 최대 하나의 간선만 존재합니다.
- 자기 자신을 연결하는 간선은 존재하지 않습니다.

여러분은 출발 정점(source)에서 도착 정점(destination)까지 이동할 수 있는 유효한 경로가 존재하는지 확인해야 합니다.
edges 배열과 정수 n, source, destination이 주어질 때,
- 경로가 존재하면 true를 반환합니다.
- 경로가 존재하지 않으면 false를 반환합니다. */


import java.util.*;

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        // 1. 정점마다 이웃 목록 만들기
        ArrayList<Integer>[] list = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            list[i] = new ArrayList<Integer>();
        }

        // 2. 간선을 하나씩 꺼내서 양쪽에 추가
        for (int i = 0; i < edges.length; i++) {
            int a = edges[i][0];
            int b = edges[i][1];
            list[a].add(b);
            list[b].add(a);
        }

        // 3. 탐색 준비물: 방문 배열, 큐
        // 방문배열은 원래 boolean 배열로함. (T/F)
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>(); 
        // 4. 시작점 넣고 방문 표시
            queue.offer(source);
            visited[source] = true;

            // 5. 큐가 빌 때까지 탐색
            while (!queue.isEmpty()) {
                int cur = queue.poll();

                if (cur == destination) {
                    return true;
                }

                for (int i = 0; i < list[cur].size(); i++) {
                    int next = list[cur].get(i);
                    if (!visited[next]) {
                        visited[next] = true;
                        queue.offer(next);
                    }
                }
            }

            // 6. 끝까지 못 만났으면 경로 없음
            return false;
    }
}
