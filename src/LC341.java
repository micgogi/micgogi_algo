/**
 * @author Micgogi
 * on 4/14/2021  9:03 AM
 * Rahul Gogyani
 */

import java.util.Iterator;
import java.util.List;
import java.util.Stack;


// This is the interface that allows for creating nested lists.
// You should not implement it, or speculate about its implementation
 interface NestedInteger {

    // @return true if this NestedInteger holds a single integer, rather than a nested list.
    public boolean isInteger();

    // @return the single integer that this NestedInteger holds, if it holds a single integer
    // Return null if this NestedInteger holds a nested list
    public Integer getInteger();

    // @return the nested list that this NestedInteger holds, if it holds a nested list
    // Return empty list if this NestedInteger holds a single integer
    public List<NestedInteger> getList();
}

public class LC341 implements Iterator<Integer> {
     private Stack<NestedInteger> stack;
    public LC341(List<NestedInteger> nestedList) {
        stack = new Stack<>();
        helper(nestedList);
    }

    private void helper(List<NestedInteger> nestedList) {
        for (int i =nestedList.size()-1; i>=0 ; i--) {
            stack.push(nestedList.get(i));
        }
    }

    @Override
    public Integer next() {
        return hasNext()?stack.pop().getInteger():null;
    }

    @Override
    public boolean hasNext() {
        while (!stack.isEmpty()){
            if(stack.peek().isInteger())return true;
            helper(stack.pop().getList());
        }
        return false;
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
