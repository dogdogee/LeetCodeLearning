//time complexity: O(n)
//space complexity: O(1)
//Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.
//30-10-2024



public class T27_Remove_Element {
    public int removeElement(int[] nums, int val) {
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}

