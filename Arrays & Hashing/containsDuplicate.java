import java.util.HashMap;

class Solution {
    public boolean containsDuplicate(int[] nums) {
    HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        // Iterate through the array
        for (int num : nums) {
            // If the element already exists in the HashMap, return true
            if (frequencyMap.containsKey(num)) {
                return true;
            } else {
                // Otherwise, add the element to the HashMap with a frequency of 1
                frequencyMap.put(num, 1);
            }
        }
        
        // If no element appeared more than once, return false
        return false;
     }
}