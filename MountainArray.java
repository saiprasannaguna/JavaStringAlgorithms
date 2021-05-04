
public class MountainArray {
	
	public static void main(String args[]){
	int nums1[]={0,1,2,3,4,5,6,7,8};
	System.out.println(checkIfExist(nums1));

}

	public static boolean checkIfExist(int[] nums) {
		
		int i=0;
		int j=nums.length-1;
		int l=nums.length;
		
		while(i+1<l && nums[i]<nums[i+1])
			i++;
		
		while(j>0&& nums[j-1]>nums[j])
			j--;
		
		if(i>0 && j<l&& i==j)
			return true;
		else
			return false;

		
		/*
		
		int i = 0;
		int j = nums.length - 1;
		int n = nums.length - 1;
		while (i + 1 < n && nums[i] < nums[i + 1]) {
			i++;
		}

		while (j > 0 && nums[j] < nums[j - 1]) {
			j--;
		}

		return i > 0 && i == j && j < n;
	*/}
	
	
	}




