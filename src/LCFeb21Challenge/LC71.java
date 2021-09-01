package LCFeb21Challenge;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author Micgogi
 * on 9/19/2020  11:11 AM
 * Rahul Gogyani
 */
public class LC71 {
    public static void main(String args[]) {
        simplifyPath("/a/../../b/../c//.//");
    }

    //        "/home/"
//        "/home"
    public static String simplifyPath(String path) {
        String s[] = path.split("/");
        System.out.println(Arrays.toString(s));
        Stack<String> newPath = new Stack();
        for (int i = 0; i < s.length; i++) {
            if (!s[i].equals("")) {
                if (s[i].equals("..") && !newPath.isEmpty()) {
                    newPath.pop();
                } else if (s[i].equals("..")) {
                    continue;
                } else if (s[i].equals(".")) {
                } else {
                    newPath.push(s[i]);
                }

            }
        }
        System.out.println(newPath);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < newPath.size(); i++) {
            if (!newPath.get(i).equals(".")) {
                String st = newPath.get(i);
                sb.append("/" + st);

            }
        }
        if (sb.toString().length() == 0) return "/";
        return sb.toString();
    }
}

