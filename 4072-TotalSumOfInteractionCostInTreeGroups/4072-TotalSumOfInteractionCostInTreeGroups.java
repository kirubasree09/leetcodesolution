// Last updated: 2/6/2026, 2:22:28 PM
import java.util.*;

class Solution {
    long ans = 0;

    int[] dfs(int u, int p, List<List<Integer>> G, int[] tot, int[] group) {
        int[] cur = new int[21];
        cur[group[u]] = 1;

        for (int v : G.get(u)) {
            if (v == p) continue;
            int[] child = dfs(v, u, G, tot, group);
            for (int i = 1; i <= 20; i++) {
                if (tot[i] > 0) {
                    ans += 1L * child[i] * (tot[i] - child[i]);
                }
                cur[i] += child[i];
            }
        }
        return cur;
    }

    public long interactionCosts(int n, int[][] edges, int[] group) {
        List<List<Integer>> G = new ArrayList<>();
        for (int i = 0; i < n; i++) G.add(new ArrayList<>());

        for (int[] e : edges) {
            G.get(e[0]).add(e[1]);
            G.get(e[1]).add(e[0]);
        }

        int[] tot = new int[21];
        for (int g : group) tot[g]++;

        dfs(0, -1, G, tot, group);
        return ans;
    }
}