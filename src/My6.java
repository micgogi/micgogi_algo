import java.util.Arrays;

/**
 * 
 */

/**
 * @author micgogi
	My6.java
 *
 * 12:50:40 AMSep 30, 2019
 */
public class My6 {
	
	public static void main(String args[]) {
		int a[] = {1,5,4,8,2,9,0};
		int n =a.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
		
		System.out.println(Arrays.toString(a));
		
	}

}
