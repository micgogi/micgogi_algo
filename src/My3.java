import java.util.Arrays;

/**
 * 
 */

/**
 * @author micgogi
	My3.java
 *
 * 6:39:37 PMSep 23, 2019
 */
public class My3 {
	public static void main(String args[]) {
		int a[] = {13,19,9,5,12,8,7,4,21,2,6,11};
		quickSort(a,0,a.length-1);
		
		System.out.println(Arrays.toString(a));
		
		
		
	}
	public static void quickSort(int a[] ,int p ,int r) {
		if(p<r) {
			int q = partition(a,p,r);
			quickSort(a,p,q-1);
			quickSort(a,q+1,r);
			  
		}
	}
	
	public static int partition(int a[] , int p ,int r) {
		int x = a[r];
		int i = p-1;
		for(int j=p;j<=r-1;j++) {
			if(a[j]<=x) {
				i=i+1;
				int temp = a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		int temp = a[i+1];
		a[i+1]=a[r];
		a[r]=temp;
		return i+1;
		
	}

}