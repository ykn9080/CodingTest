package test;

public class FindPivotMiddle {

	public static void main(String[] args) {
		int[] nums= {1,8,2,9,2,3,6};
		
		
		System.out.print(FindPivot(nums));
		
	}

	private static int FindPivot(int[] nums) {
		int sum=Sum(nums);
		int size=nums.length;

		int lsum=nums[0];
		int pivot=1;
		int rsum=sum-lsum-nums[pivot];
		
		while(pivot<size-1) {
			System.out.println(lsum+" "+rsum+" "+pivot);
			if(lsum==rsum) return pivot;
			
			lsum =lsum+nums[pivot];
			rsum=rsum-nums[pivot+1];

			pivot++;
		}
		return -1;
		
		
	}

	private static int Sum(int[] nums) {
		int sum=0;
		for(int i=0;i<nums.length;i++) {
			sum+=nums[i];
		}
		return sum;
	}

}
