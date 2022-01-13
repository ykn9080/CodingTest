package test;


public class DutchFlag {

	public static void main(String[] args) {
		int[] nums= {1,0,2,2,0,1,2,1,0};
	
		print(MakeFlag(nums));

	}

	private static void print(int[] makeFlag) {
		for(int i=0;i<makeFlag.length;i++) {
			System.out.print(makeFlag[i]+" ");
		}
		
	}

	private static int[] MakeFlag(int[] nums) {
		int left=0;
		int right=nums.length-1;
		for(int cur=0;cur<nums.length;cur++) {
			if(nums[cur]==0) {
				nums[cur]=nums[left];
						nums[left]=0;
						left++;
			}
			if(nums[cur]==2) {
				nums[cur]=nums[right];
				nums[right]=2;
				right--;
			}
		}
		
		return nums;
	}
	

}
