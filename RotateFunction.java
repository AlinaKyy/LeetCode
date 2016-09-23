package array;

public class RotateFunction {
	 public int maxRotateFunction(int[] A){
		int sum=0;
		int F=0;
		for(int i=0; i<A.length;i++){
			sum += A[i];
			F += i*A[i];
		}
		
		int max = F;
		for(int j=A.length-1;j>0;j--){
			F = F+sum-A.length*A[j];
			max = Math.max(F, max);
		}
		 System.out.println(max);
		 return max;
	 }
	 
	 
	 public static void main(String args[]){
		 int[] arr = new int[]{4,3,2,6};
		 RotateFunction r = new RotateFunction();
		 r.maxRotateFunction(arr);
	 }
}
