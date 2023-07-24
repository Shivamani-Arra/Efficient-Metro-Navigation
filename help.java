import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class help {
    public static List<Integer> dijsktraAlgo(int n, int m, int s, int dest, int edges[][],int dist[]) 
	{
        
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i=0; i<n; i++)
        {
            adj.add(new ArrayList<Pair>());
        }
        for (int i=0; i<m; i++)
        {
            adj.get(edges[i][0]).add(new Pair(edges[i][2], edges[i][1]));
            adj.get(edges[i][1]).add(new Pair(edges[i][2], edges[i][0]));
        }
        List<Integer> ans = new ArrayList<Integer>();
        int [] parent = new int [n];
        PriorityQueue <Pair> pq = new PriorityQueue<Pair>((x,y)-> x.dist-y.dist);
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[s] = 0;
        for (int i=0; i<n; i++)
        {
            parent[i]=i;
        }
        pq.add(new Pair(0,s));
        while (!pq.isEmpty())
        {
            Pair p = pq.remove();
            int node = p.node;
            int dis = p.dist;
            for (Pair it : adj.get(node))
            {
                    int d = it.dist;
                    int no = it.node;
                    if (dis+d<dist[no])
                    {
                        dist[no] = dis+d;
                        parent[no] = node;
                        pq.add(new Pair(dis+d,no));
                    }
            }
                
        }  
       /* if (dist[dest]==Integer.MAX_VALUE) 
            return new ArrayList<Integer>(Arrays.asList(-1));
        int i = dest;
        ans.add(dest);
        while(i != s)
        {
        	i = parent[ans.get(0)];
        	ans.add(0,i);
        }
        return ans;*/
        if (dist[dest] == Integer.MAX_VALUE)
            return new ArrayList<Integer>(Arrays.asList(-1));
        int i = dest;
        ans.add(dest);
        while (i != s) {
            i = parent[ans.get(0)];
            ans.add(0, i);
        }
        return ans;

    }
    
}
