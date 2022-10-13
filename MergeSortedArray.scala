object Solution {
    def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
        for(i<-m until m+n)
        {
            nums1(i)=nums2(i-m)
        }
        var update = nums1.sorted
        nums1.zipWithIndex.foreach{case(value,index) => nums1(index)=update(index)}
    }
}