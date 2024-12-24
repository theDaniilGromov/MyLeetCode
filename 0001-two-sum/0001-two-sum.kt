class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
         for(i in nums.indices) {
        for (j in i + 1 until  nums.size) {
            var quest = nums.get(i) + nums.get(j)
            if(quest == target) {
                return intArrayOf(i, j)
            }
        }
    }
    return nums;
    }
}