package com.algo;

public class LargerthanK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[]={1,3,6,7,10,15,17,19};//Sorted array of integers
		System.out.println(searchLarger(A, 16));
	}
	
	public static int searchLarger(int[] A,int k){
		
		if(A.length==0||A[A.length-1]<k)
			return -1;
		
		int l=0,r=A.length,mid=0;
		while(l<r){
			
			mid=l+((r-l)/2);
			
			if(A[mid]<=k){
				/*k may lie on right of mid*/
				l=mid+1;				
			}
			else /*k may lie on right of mid*/
				r=mid;
								
		}
		return l;
	
	}


}
