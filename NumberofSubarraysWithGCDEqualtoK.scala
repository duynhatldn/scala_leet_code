object Solution {
    def subarrayGCD(nums: Array[Int], k: Int): Int = {
        var check = 0;
        nums.zipWithIndex.foreach(value =>{
            var temp = 0
                for(j<-value._2 until nums.size)
                {
                    temp = BigInt(temp).gcd(nums(j)).toInt
                    if(temp == k) check = check+1
                }

        })
        check
    }
}