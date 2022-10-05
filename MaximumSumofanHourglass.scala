object Solution {
    def maxSum(grid: Array[Array[Int]]): Int = 
    {
    (for{i <- 0 until (grid.size - 2) 
        j <- 0 until (grid(0).size - 2)}
        yield grid(i + 0)(j) + grid(i + 0)(j + 1) + grid(i + 0)(j + 2) + grid(i + 1)(j + 1) + grid(i + 2)(j) + grid(i + 2)(j + 1) + grid(i + 2)(j + 2)).max
    }
}