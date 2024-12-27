class Solution {
    fun maxScoreSightseeingPair(values: IntArray): Int {
           var maxScore = 0
    var maxValueI = values[0] 

    for (j in 1 until values.size) {
        maxScore = maxOf(maxScore, maxValueI + values[j] - j)

        maxValueI = maxOf(maxValueI, values[j] + j)
    }

    return maxScore
    }
}