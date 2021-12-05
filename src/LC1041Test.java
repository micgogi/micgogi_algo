import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 12/5/2021  5:08 PM
 * Rahul Gogyani
 */
public class LC1041Test {
    public static void main(String[] args) {
        System.out.println(new LC1041Test().instructionBoundaries("GLLL"));
    }
    public boolean instructionBoundaries(String instruction){
        if (instruction.length()==0)return false;
        int x = 0;
        int y =0;
        String direction="N";
        for (char c: instruction.toCharArray()){
            if(c=='G') {
                if(direction.equals("N"))y++;
                else if( direction.equals("S"))y--;
                else if(direction.equals("E"))x++;
                else x--;
            }
            else if( c=='L'){
                if(direction.equals("N"))direction="W";
                else if(direction.equals("W"))direction="S";
                else if(direction.equals("S"))direction="E";
                else if(direction.equals("E"))direction="N";
            }
            else if(c=='R'){
                if(direction.equals("N"))direction="E";
                else if(direction.equals("W"))direction="N";
                else if(direction.equals("S"))direction="W";
                else if(direction.equals("E"))direction="S";
            }


        }
        if(x==0 && y==0)return true;
        if(direction.equals("N"))return false;
        return true;
    }
}

