import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class threeSumClass {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort the array to simplify finding duplicates
        
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates for the first element of the triplet
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            int left = i + 1, right = nums.length - 1;
            int target = -nums[i];
            
            while (left < right) {
                int sum = nums[left] + nums[right];
                
                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Skip duplicates for the second and third elements of the triplet
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    
                    // Move pointers after processing the triplet
                    left++;
                    right--;
                } else if (sum < target) {
                    left++; // Need a larger sum
                } else {
                    right--; // Need a smaller sum
                }
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        threeSumClass obj = new threeSumClass();
        int[] arr = {-1,0,1,2,-1,-1};
        System.out.println(obj.threeSum(arr));
    }
}

// [-1,0,1,2,-1,-4]
// [-4,-1,-1,0,1,2]