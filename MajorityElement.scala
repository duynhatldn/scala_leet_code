object Solution {
    def majorityElement(nums: Array[Int]): Int = {
        val arrSorted = nums.sorted
        return arrSorted(arrSorted.length/2)
    }
}