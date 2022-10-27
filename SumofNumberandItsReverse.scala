object Solution {
    def sumOfNumberAndReverse(num: Int): Boolean = {
        0.to(num).exists(i => i + i.toString.reverse.toInt == num)
    }
}