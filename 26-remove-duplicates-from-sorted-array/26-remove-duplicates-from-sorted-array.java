class Solution {
    public int removeDuplicates(int[] nums) {
       List<Integer> ans = new ArrayList<>();
        int t = 0;
        for (int i = 0; i < nums.length; i++) {
            if (ans.contains(nums[i])) {
                continue;
            } else {
                ans.add(nums[i]);
                nums[t++] = nums[i];

            }
        }

        return t;
    }
}