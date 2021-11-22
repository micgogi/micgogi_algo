import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/22/2021  7:16 PM
 * Rahul Gogyani
 */
public class LRUCache2 {
    class Node{
        int key;
        int value;
        Node prev;
        Node next;
    }
    Node head = new Node();
    Node tail = new Node();
    Map<Integer,Node> map;
    int capacity;
    LRUCache2(int capacity){
        this.capacity = capacity;
        map = new HashMap<>(capacity);
        head.next = tail;
        tail.prev = head;

    }
    public int get(int key){
        Node node = map.get(key);
        if(node == null){
            return -1;
        }
        int result = node.value;
        remove(node);
        add(node);
        return result;
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
        prev.next = next;
        next.prev = prev;
    }
    public void put(int key,int value){
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.value = value;
            remove(node);
            add(node);
        }else{
            if(map.size() == capacity){
                map.remove(tail.prev.key);
                remove(tail.prev);
            }
            Node newNode = new Node();
            newNode.value = value;
            newNode.key = key;
            map.put(key,newNode);
            add(newNode);
        }
    }
    public static void main(String[] args) {
        LRUCache2 lruCache = new LRUCache2(2);
        System.out.println(lruCache.get(3));
        lruCache.put(1,1);
        System.out.println(lruCache.get(1));
        lruCache.put(2,2);
        System.out.println(lruCache.get(2));
        lruCache.put(3,3);
        System.out.println(lruCache.get(3));
        System.out.println(lruCache.get(3) );
    }
}

