class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var first = 0
    var last = nums.size - 1

    while (first <= last) {
        val midle = first + (last - first) / 2
        when {
            nums[midle] == target -> return midle
            nums[midle] < target -> first = midle + 1
            else -> last = midle - 1
        }
    }
    return first
    }
}