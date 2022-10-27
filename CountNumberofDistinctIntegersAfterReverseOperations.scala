object Solution {
    def countDistinctIntegers(nums: Array[Int]): Int = {
        var newArray = nums.zipWithIndex.map{case(value,index) => {
            value.toString.reverse.toInt
        }}
        nums.concat(newArray).distinct.size
    }
}