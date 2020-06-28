import java.util.*;

/**
 * @author Micgogi
 * on 6/28/2020  4:46 PM
 * Rahul Gogyani
 */
public class LC332 {
    static HashMap<String,List<String>> graph;
    static List<String> list;

    public static void main(String[] args) {
      String tickets[][] ={
              {"MUC","LHR"},
              {"JFK","MUC"},
              {"SFO","SJC"},
              {"LHR","SFO"}
      };
    graph  = new HashMap<>();
        list = new ArrayList<>();


        for (int i = 0; i <tickets.length ; i++) {
           graph.putIfAbsent(tickets[i][0],new ArrayList<>());
           graph.get(tickets[i][0]).add(tickets[i][1]);
        }
        for (Map.Entry<String,List<String>> entry:graph.entrySet()){
            Collections.sort(entry.getValue());
        }
        List<String> result = new ArrayList<>();
        dfs("JFK",graph,result);

        System.out.println(result);
    }
    public static void dfs(String curr, Map<String,List<String>> graph, List<String> result) {
    List<String> neighbours = graph.get(curr);
    if(neighbours!=null){
        while ((neighbours.size()>0)){
            String neighbour = neighbours.get(0);
            neighbours.remove(0);
            dfs(neighbour,graph,result);
        }

    }
    result.add(0,curr);
    }
}
