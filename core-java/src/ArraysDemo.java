import java.util.Arrays;
public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] ar= {10,20,30,40,50};
////		System.out.println(ar);
//		for (int i = 0; i < ar.length; i++) {
//			System.out.println(ar[i]);
//			}
		
		/////////////
//		for(int i:ar) {
//			System.out.println(i);
//		}
		
		
		//////////////////////////////////////
		int[][] jag= {{1,2},{3,4,5},{6,7,8,9}};
//		for (int i = 0; i < jag.length; i++) {
//			for (int j = 0; j < jag[i].length; j++) {
//				System.out.print(jag[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
//		for(int[] row:jag) {
//			for(int i:row) {
//				System.out.print(i+"\t");
//			}
//			System.out.println();
//		}
		int[] arr= {4,3,2,1};
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}
}