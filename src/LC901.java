import java.util.HashMap;
import java.util.Stack;

/**
 * @author Micgogi
 * on 5/19/2020  2:35 PM
 * Rahul Gogyani
 */
public class LC901 {

    /**
     * Your StockSpanner object will be instantiated and called as such:
     * StockSpanner obj = new StockSpanner();
     * int param_1 = obj.next(price);
     */
   class Pair{
       int value;
       int index;
       public Pair(int value,int index){
           this.value = value;
           this.index = index;
       }
   }
    Stack<Pair> stack;
    public LC901(){
       stack = new Stack<>();
    }
    public static void main(String[] args) {
//        Write a class StockSpanner which collects daily price quotes for some stock,
//        and returns the span of that stock's price for the current day.
//        The span of the stock's price today is defined as the maximum number of
//        consecutive days (starting from today and going backwards) for which the price of the stock was less than or equal to today's price.
//        For example, if the price of a stock over the next 7 days were [100, 80, 60, 70, 60, 75, 85],
//        then the stock spans would be [1, 1, 1, 2, 1, 4, 6].
    }
    static int i=0;
    public int next(int price){
      i++;
      int j =0;
      while(!stack.isEmpty()&&stack.peek().value<=price){
          stack.pop();
      }
      if(stack.isEmpty())j=i;
      else{
          j=i-stack.peek().index;
      }
      stack.push(new Pair(price,i));
      return j;
    }
}
