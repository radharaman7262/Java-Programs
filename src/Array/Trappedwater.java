import java.util.*;
public class Trappedwater {
	public static int trappedwater(int height[]) {
		int n=height.length;
	//calculate leftMax boundary;
		int leftmax[]=new int[n];
		leftmax[0]=height[0];
		for(int i=1;i<n;i++) {
			leftmax[i]=Math.max(leftmax[i-1],height[i]);
		}
	//calculate rightMax boundary;
		int rightmax[]=new int[n];
		rightmax[n-1]=height[n-1];
		for(int i=n-2;i>=0;i--) {
			rightmax[i]=Math.max(rightmax[i+1],height[i]);
		}
	//loop;
		int trappedwater=0;
		for(int i=0;i<n;i++)
	    //waterlevel=min(leftMax boundary,rightMax boundary);
		{ int waterlevel=Math.min(leftmax[i],rightmax[i]);
		 //trappedwater=waterlevel-height;
		 trappedwater=trappedwater+(waterlevel-height[i]);
		}
		return trappedwater;
	}
		
public static void main(String args[]) {
	int height[]= {4,2,0,6,3,2,5};
	System.out.println(trappedwater(height));
}
}
