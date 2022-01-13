package test;

import java.util.ArrayList;
import java.util.List;

public class FindEqualSubArray {

	public static void main(String[] args) {
		int[] nums= {3,4,2,1,3,2};
		int target=7;
		List<Integer> subarr=FindSubArray(nums,target);
		System.out.println("subarr"+subarr);


	}

	private static List<Integer> FindSubArray(int[] nums, int target) {
		int sum=0;
		List<Integer> subarr = new ArrayList<>();
		for(int i=0;i<nums.length;i++) {
			int j=i;
			List<Integer> temparr = new ArrayList<>();
			while(sum<=target) {
				sum += nums[j];
				temparr.add(nums[j]);
				if(sum==target) break;
				j++;
			}
			System.out.println("temparr"+temparr);
			if(subarr.size()==0 | subarr.size()>temparr.size()) {
				subarr=temparr;
			}
		}
		return subarr;
	}

}
