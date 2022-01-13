package test;

import java.util.Scanner;

public class Binery {
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] nums=new int[5];
		for(int i=0;i<5;i++) {
			System.out.println("input num"+ i+1+ "th");
			nums[i]=scan.nextInt();
		}
		System.out.println("you inserted "+nums.toString() );

		System.out.println("insert target num");
		int target=scan.nextInt();
		
		System.out.println(FindIndex(nums,target));

		
	}

	private static int FindIndex(int[] nums,int target) {
		int left=0;
		int right=nums.length-1;
		int pivot;
		
		while(left<=right) {
			pivot=FindPivot(left, right);
			if(nums[pivot]==target) {
				return pivot;
			}
			else if(nums[pivot]<target){
			left=pivot+1;
			}
			else {
				right=pivot-1;
			}
			
		}
		return -1;
		
	}


	private static int FindPivot(int left, int right) {
		return (int)(left+right)/2;
	}
	

}

