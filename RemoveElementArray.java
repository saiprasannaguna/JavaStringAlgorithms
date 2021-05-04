import java.util.Arrays;

public class RemoveElementArray {
	
	public static void main(String args[]){
	int nums1[]={3,2,2,3};
	int val=2	;
	System.out.println(removeElement(nums1,val));

}

	public static int removeElement(int[] nums, int val) { 
		int length=nums.length; 
    if(length==0) return 0; 
    int i=0; 
    for(int j=0; j<length; j++)
    {
      if(nums[j]!=val)
      {
    	nums[i]=nums[j];
        i++; 
      }
    }
    if(i<length) nums[i]='\0';
    System.out.println(Arrays.toString(nums));
    
    return i; }
}
