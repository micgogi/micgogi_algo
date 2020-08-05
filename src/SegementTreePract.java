import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/4/2020  2:41 PM
 * Rahul Gogyani
 */
public class SegementTreePract {
    static int segmentTree[];

    public SegementTreePract(int arr[], int n) {
        int x = (int) Math.ceil(Math.log(n) / Math.log(2));
        int max_size = 2 * (int) Math.pow(2, x) - 1;
        segmentTree = new int[max_size];
        constructTree(arr, 0, n - 1, 0);

    }

    public int getMid(int left, int right) {
        return left + (right - left) / 2;
    }

    public int getSum(int n, int qstart, int qend) {
        if (qstart < 0 || qend > n - 1) {
            System.out.println("Invalid Input");
            return -1;
        }
        return getSumUtil(0, n - 1, qstart, qend, 0);
    }

    public int getSumUtil(int start, int end, int qstart, int qend, int index) {
        if (qstart <= start && qend >= end) {
            return segmentTree[index];
        }
        if (end < qstart || start > qend) {
            return 0;
        }
        int mid = getMid(start, end);
        return getSumUtil(start, mid, qstart, qend, 2 * index + 1) + getSumUtil(mid + 1, end, qstart, qend, 2 * index + 2);
    }

    public int constructTree(int arr[], int start, int end, int index) {
        if (start == end) {
            segmentTree[index] = arr[start];
            return arr[start];
        }
        int mid = getMid(start, end);
        segmentTree[index] = constructTree(arr, start, mid, 2 * index + 1) + constructTree(arr, mid + 1, end, 2 * index + 2);
        return segmentTree[index];

    }

    public static void main(String args[]) {
        int arr[] = {65, 78, 75, 73, 84, 65};
        SegementTreePract sg = new SegementTreePract(arr, arr.length);
        assert 143 == sg.getSum(arr.length, 0, 1);
        assert 123 == sg.getSum(arr.length, 0, 4);


    }


}

