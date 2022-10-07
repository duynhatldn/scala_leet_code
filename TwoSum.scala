object Solution {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        for(i <- 0 until nums.size;j <- i + 1 until nums.size)
        {
            if(nums(i)+nums(j)==target) return Array(i,j);
        }
        return Array(0,0)
    }
}