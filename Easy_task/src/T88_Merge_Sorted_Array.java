//time complexity: O(n)
//space complexity: O(1)
//Approach: Initialize pointers for nums1 and nums2 and a pointer for merged array. Merge nums1 and nums2 in reverse order. Copy remaining elements from nums2, if any.
//31-10-2024
import java.util.Arrays;

public class T88_Merge_Sorted_Array {
      public static void main(String[] args) {
         int[] nums1 = {1,2,3,0,0,0};
         int m = 3;
         int[] nums2 = {2,5,6};
         int n = 3;
         System.out.println(Arrays.toString(nums1));
      }
      public void merge(int[] nums1, int m, int[] nums2, int n) {
         // Initialize pointers
         int p1 = m - 1; // Pointer for nums1
         int p2 = n - 1; // Pointer for nums2
         int p = m + n - 1; // Pointer for merged array
 
         // Merge nums1 and nums2 in reverse order
         while (p1 >= 0 && p2 >= 0) {
             if (nums1[p1] > nums2[p2]) {
                 nums1[p] = nums1[p1];
                 p1--;
             } else {
                 nums1[p] = nums2[p2];
                 p2--;
             }
             p--;
         }
 
         // Copy remaining elements from nums2, if any
         while (p2 >= 0) {
             nums1[p] = nums2[p2];
             p2--;
             p--;
         }
     }
   }

