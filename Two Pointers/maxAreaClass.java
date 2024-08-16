public class maxAreaClass {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        
        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            
            // Calculate the area and update max
            int area = width * minHeight;
            max = Math.max(max, area);
            
            // Move the pointer pointing to the shorter bar inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return max;
    }
    
    public static void main(String[] args) {
        int[] ht = {1,7,2,5,4,7,3,6};
        maxAreaClass obj = new maxAreaClass();
        System.out.println(obj.maxArea(ht));

    }
}
