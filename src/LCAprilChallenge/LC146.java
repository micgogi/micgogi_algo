package LCAprilChallenge;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Micgogi
 * on 4/24/2020  2:07 PM
 * Rahul Gogyani
 */
public class LC146 {
    final Node head = new Node();
    final Node tail = new Node();
    Map<Integer, Node> map;
    int capacity;
    static class Node{
            int key;
            int val;
            Node prev;
            Node next;
    }
    public LC146(){

    }
    public LC146(int capacity) {
    map = new HashMap<>(capacity);
    this.capacity = capacity;
    head.next = tail;
    tail.prev = head;

    }

    public int get(int key) {
        int result = -1;
        Node node = map.get(key);
        if(node!=null){
            result = node.val;
            remove(node);
            add(node);
        }

        return result;

    }

    public void put(int key, int value) {
        Node node = map.get(key);
        if(node!=null){
            remove(node);
            node.val = value;
            add(node);

        }else{
            if(map.size()==capacity){
                map.remove(tail.prev.key);
                remove(tail.prev);
            }

            Node newNode = new Node();
            newNode.key = key;
            newNode.val = value;
            map.put(key,newNode);
            add(newNode);
        }
    }
    public void add(Node node){
        Node head_next = head.next;
        head.next = node;
        node.prev = head;
        node.next = head_next;
        head_next.prev = node;

    }
    public void remove(Node node){
        Node next = node.next;
        Node prev = node.prev;
        next.prev = prev;
        prev.next = next;
    }

    public static void main(String[] args) {
        LC146 l = new LC146(2);
        l.put(65,1);
        l.put(78,2);
        System.out.println(l.get(65));
    }
}
