import java.util.Arrays;

public class RemoveDupliatesSortedArray {
	
	public static void main(String args[]){
	int nums1[]={1,1,2};
	System.out.println(removeDuplicateElement(nums1));

}

	public static int removeDuplicateElement(int[] nums) { 
		int length=nums.length; 
    if(length==0) return 0; 
    int i=0; 
    for(int j=1; j<length; j++)
    {
      if(nums[j-1]!=nums[j])
      {
    	  nums[i+1]=nums[j];
    	  i++;
    	  
      }
    }
    for(int j=i+1;j<nums.length;j++){ nums[j]='\0';};
    System.out.println(Arrays.toString(nums));
    
    return i+1; }
}
