object Solution {
    def findMaxK(nums: Array[Int]): Int = {
        var result = -1;
        nums.foreach(value => {
            if(nums.contains(-value))
            result = scala.math.max(result, scala.math.abs(value))
        })
        result
    }
}