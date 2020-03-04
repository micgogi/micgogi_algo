import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author Micgogi
 * on 3/4/2020  9:50 PM
 * Micgogi
 */
public class ComplexNumberMul {
    static class Complex

    {
        private long real;
        private long img;
        Complex( long real, long img){
        this.real = real;
        this.img = img;

    }
    Complex(){

    }
    }
    public static Complex multiplication(Complex n1, Complex n2){
        Complex result = new Complex();
        result.real = ( n1.real * n2.real ) - ( n1.img * n2.img);
        result.img= ( n1.real * n2.img ) + ( n1.img * n2.real);
        return result;
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int t = Integer.parseInt(br.readLine());
            while (t--!=0){
                int n = Integer.parseInt(br.readLine());
                ArrayList<Long> realNumbers  = new ArrayList<>();
                ArrayList<Long> imgNumbers = new ArrayList<>();
                for (int i = 0; i <n ; i++) {
                    String s = br.readLine();
                    String s1[] = s.split(" ");
                    realNumbers.add(Long.parseLong(s1[0]));
                    imgNumbers.add(Long.parseLong(s1[1]));

                }

                    Complex c1 = new Complex(realNumbers.get(0),imgNumbers.get(0));
                    Complex c2 = new Complex(realNumbers.get(1),imgNumbers.get(1));
                    Complex re = multiplication(c1,c2);
                for (int i = 2; i <realNumbers.size() ; i++) {
                    Complex c3 = new Complex(realNumbers.get(i),imgNumbers.get(i));
                    re = multiplication(re,c3);
                }
                System.out.println(re.real+" "+re.img);

            }

        }catch (Exception e){

        }
    }
}
