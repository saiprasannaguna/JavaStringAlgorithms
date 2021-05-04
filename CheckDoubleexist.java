import java.util.Arrays;

public class CheckDoubleexist {
	
	public static void main(String args[]){
	int nums1[]={10,2,5,3};
	System.out.println(checkIfExist(nums1));

}

	public static boolean checkIfExist(int[] nums) {
		
		
			for(int i=0;i<nums.length;i++){
				
				for(int j=i+1;j<nums.length;j++){
					
					if(nums[i]*2==nums[j] || nums[j]*2==nums[i] )
						return true;
					
				}
			}
		
		
		return false;
		
		
	}
}
