/**
 * @author Micgogi
 * on 4/4/2021  12:32 PM
 * Rahul Gogyani
 */
public class LC622 {
    public static void main(String args[]) {
        LC622 myCircularQueue = new LC622(3);
        System.out.println(myCircularQueue.enQueue(1)); // return True
        System.out.println(myCircularQueue.enQueue(2)); // return True
        System.out.println(myCircularQueue.enQueue(3)); // return True
        System.out.println(myCircularQueue.enQueue(4)); // return False
        System.out.println(myCircularQueue.Rear());     // return 3
        System.out.println(myCircularQueue.isFull());   // return True
        System.out.println(myCircularQueue.deQueue());  // return True
        System.out.println(myCircularQueue.enQueue(4)); // return True
        System.out.println(myCircularQueue.Rear());

    }

    int[] a;
    int front = 0;
    int rear = -1;
    int queueSize =0;

    public LC622(int k) {
        a = new int[k];
    }
    /**
     * Your MyCircularQueue object will be instantiated and called as such:
     * MyCircularQueue obj = new MyCircularQueue(k);
     * boolean param_1 = obj.enQueue(value);
     * boolean param_2 = obj.deQueue();
     * int param_3 = obj.Front();
     * int param_4 = obj.Rear();
     * boolean param_5 = obj.isEmpty();
     * boolean param_6 = obj.isFull();
     */
    public boolean enQueue(int value) {
        if (!isFull()) {
            rear = (rear + 1) % a.length;
            a[rear] = value;
            queueSize++;
            return true;
        } else {
            return false;
        }
    }

    public boolean deQueue() {
        if (!isEmpty()) {
            front = (front + 1) % a.length;
            queueSize--;
            return true;
        } else return false;
    }

    public int Front() {
        if (isEmpty()) return -1;
        return a[front];
    }

    public int Rear() {
        if (isEmpty()) return -1;
        return a[rear];
    }

    public boolean isEmpty() {
        return queueSize == 0;
    }

    public boolean isFull() {
        return queueSize == a.length;
    }
}

