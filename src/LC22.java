import java.util.ArrayList;
import java.util.List;

public class LC22 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generateParenthesisHelper(n,0,0,new StringBuilder(),res);
        return res;
    }
    void generateParenthesisHelper(int n,int open,int close,StringBuilder sb,List<String> res) {
        if(2*n==open+close) {
           res.add(sb.toString());
             return;
        } 
        if(open<n){
            sb.append("(");
            generateParenthesisHelper(n,open+1,close,sb,res);
            sb.deleteCharAt(sb.length()-1);
        }
            
        if(open>close) 
        {
            sb.append(")");
            generateParenthesisHelper(n,open,close+1,sb,res);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}