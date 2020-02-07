/*https://leetcode.com/problems/rotting-oranges/
 *@author Rahul Gogyani
 *
 * 12:21 PM 2/7/2020
 */

import java.util.LinkedList;
import java.util.Queue;

public class LC994 {
    static class Orange {
        int x;
        int y;

        Orange(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }

    static boolean isvalid(int i, int j, int R, int C) {
        return (i >= 0 && j >= 0 && i < R && j < C);
    }

    static boolean isDelim(Orange temp) {
        return (temp.x == -1 && temp.y == -1);
    }

    static boolean check(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == 1) {
                    return true;
                }
            }
        }
        return false;
    }


    static int rotOrange(int a[][]) {
        Queue<Orange> q = new LinkedList<>();
        Orange temp;
        int result =0;
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[0].length ; j++) {
                if(a[i][j]==2){
                    q.add(new Orange(i,j));
                }
            }
        }
        q.add(new Orange(-1,-1));

        while (!q.isEmpty()){
            boolean fl = false;
            while (!isDelim(q.peek())){
                temp = q.peek();
                if(isvalid(temp.x+1, temp.y,a.length,a[0].length)&&a[temp.x+1][temp.y]==1){
                    if(!fl){
                        result++;
                        fl=true;
                    }
                    a[temp.x+1][temp.y]=2;
                    temp.x++;q.add(new Orange(temp.x,temp.y));
                    temp.x--;
                }
                if(isvalid(temp.x-1,temp.y,a.length,a[0].length)&&a[temp.x-1][temp.y]==1){
                    if(!fl){
                        result++;
                        fl=true;
                    }
                    a[temp.x-1][temp.y]=2;
                    temp.x--;
                    q.add(new Orange(temp.x,temp.y));
                    temp.x++;
                }
                if(isvalid(temp.x,temp.y+1,a.length,a[0].length)&&a[temp.x][temp.y+1]==1){
                    if(!fl){
                        result++;
                        fl=true;
                    }
                    a[temp.x][temp.y+1]=2;
                    temp.y++;
                    q.add(new Orange(temp.x,temp.y));
                    temp.y--;
                }
                if(isvalid(temp.x,temp.y-1,a.length,a[0].length)&&a[temp.x][temp.y-1]==1){
                    if(!fl){
                        result++;
                        fl = true;

                    }
                    a[temp.x][temp.y-1]=2;
                    temp.y--;
                    q.add(new Orange(temp.x,temp.y));

                }
                q.remove();

            }
            q.remove();
            if(!q.isEmpty()){
                q.add(new Orange(-1,-1));
            }
        }
        return (check(a))?-1:result;
    }

    public static void main(String[] args) {
        int a[][] = {{0,2}};
        System.out.println(rotOrange(a));


    }
}
