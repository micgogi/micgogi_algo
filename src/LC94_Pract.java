import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Micgogi
 * on 4/9/2020  12:14 PM
 * Rahul Gogyani
 */
public class LC94_Pract {
    static class Orange {
        int x;
        int y;

        Orange(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static boolean isValid(int i, int j, int R, int C) {
        return (i >= 0 && j >= 0 && i < R && j < C);
    }

    boolean isDelim(Orange temp) {
        return (temp.x == -1 && temp.y == -1);
    }

    boolean check(int a[][]){
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                if(a[i][j]==1){
                    return true;
                }
            }
        }
        return false;
    }
    int rotOrange(int a[][]){
        Queue<Orange>  q = new LinkedList<>();
        Orange temp;
        int result =0;
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                if(a[i][j]==2){
                    q.add(new Orange(i,j));
                }
            }   
        }
        q.add(new Orange(-1,-1));
        while (!q.isEmpty()){
            boolean flag =false;
            while (!isDelim(q.peek())){
                temp = q.peek();
                if (isValid(temp.x+1,temp.y,a.length,a[0].length)&&a[temp.x+1][temp.y]==1){
                    if(!flag){
                        result++;
                        flag = true;
                    }
                    a[temp.x+1][temp.y]=2;
                    temp.x++;
                    q.add(new Orange(temp.x,temp.y));
                    temp.x--;
                }

                if(isValid(temp.x-1,temp.y,a.length,a[0].length)&&a[temp.x-1][temp.y]==1){
                    if(!flag){
                        result++;
                        flag = true;
                    }
                    a[temp.x-1][temp.y]=2;
                    temp.x--;
                    q.add(new Orange(temp.x,temp.y));
                    temp.x++;

                }

                if(isValid(temp.x,temp.y+1,a.length,a[0].length)&&a[temp.x][temp.y+1]==1){
                    if(!flag){
                        result++;
                        flag = true;
                    }
                   a[temp.x][temp.y+1]=2;
                    temp.y++;
                    q.add(new Orange(temp.x,temp.y));
                    temp.y--;
                }
//                if(isValid(temp.x,temp.y-1),a.length,a[0].length&&a[temp.x][temp.y-1]==1){
//
//                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {

    }
}
