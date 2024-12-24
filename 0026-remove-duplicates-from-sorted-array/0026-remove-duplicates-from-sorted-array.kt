class Solution {
    fun removeDuplicates(nums: IntArray): Int {
         var k = 0
    if (nums.size == 0) return 0
    for(item in nums.indices){
        if (item == 0) {
            nums.set(k, nums.get(item))
            k++
            continue
        }
        if(nums.get(item) != nums.get(item - 1)) {
            nums.set(k, nums.get(item))
            k++
        }
    }
    return k
    }
}