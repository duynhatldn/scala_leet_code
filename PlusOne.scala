object Solution {
    def addOne(digits: Array[Int], index: Int): Array[Int] = {
        if(index == -1) {
            digits(index+1) = 0
            return (1) +: digits
        }
        else {
            if(1 + digits(index) == 10) {
                digits(index) = 0
                addOne(digits, index-1)
            } else {
                digits(index) = digits(index) + 1
                return digits
            } 
        }
    }
    def plusOne(digits: Array[Int]): Array[Int] = {
        addOne(digits, digits.size - 1)
    }
}