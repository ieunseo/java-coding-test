class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;
        
        int write = 0;
        for (int read = 1; read < nums.length; read++) {
            if (nums[read] != nums[write]) {
                write++;
                nums[write] = nums[read];
            }
        }
        return write + 1;
    }
}