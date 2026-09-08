class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] rs = new int[n];

        rs[0]=1;
        for (int i = 1; i < n; i++) {
            rs[i] = rs[i - 1] * nums[i - 1]; // 1,1,2,8
        }

        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            rs[i] *= suffix; // 48,24,12,8
            suffix *= nums[i]; //6, 24, 48
        }

        return rs;
    }
}  
