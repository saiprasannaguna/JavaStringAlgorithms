import java.util.Arrays;

public class MergeTwoArraysSorted 
{
	
	public static void main(String args[]){
	int nums1[]={1};
	int nums2[]={};
	int m=1,n=0;
	System.out.println(Arrays.toString(merge(nums1,m,nums2,n)));

}
	   public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
		   
		   int k=0;
		   for(int i=m;i<m+n;i++){
			   nums1[i]=nums2[k];
			   k++;
		   }
		   int temp;
		   
		   
		   for (int i = 0; i < nums1.length; i++) 
	        {
	            for (int j = i + 1; j < nums1.length; j++) { 
	                if (nums1[i] > nums1[j]) 
	                {
	                    temp = nums1[i];
	                    nums1[i] = nums1[j];
	                    nums1[j] = temp;
	                }
	            }
	        }
		 //  Arrays.sort(merge);
			System.out.println(Arrays.toString(nums1));

		   return nums1;

	    }
}
