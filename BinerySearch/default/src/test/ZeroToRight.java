package test;

public class ZeroToRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {5,5,0,7,6,3,9,0,10};
		int size=nums.length;
		int zind=0;
		int ind=0;
		int zcnt=0;
		
		for(int i=0;i<size;i++) {
			
			if(nums[i]!=0) {
				nums[zind]=nums[i];
				zind++;
				
			}
			else {
				zcnt++;
			}
			ind++;
		}

		for (int i=size-1;i>=size-zcnt;i--) {
			nums[i]=0;
		}
		for(int i=0;i<size;i++) {
		System.out.print(nums[i]+" ");
		}
		

	}


	

}
