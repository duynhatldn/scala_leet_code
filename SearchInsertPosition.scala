object Solution {
    def searchInsert(nums: Array[Int], target: Int): Int = {
        nums.zipWithIndex.foreach{case(value, index) =>
            if(value >= target) return index 
        }
        nums.size
    }
}