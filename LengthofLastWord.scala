object Solution {
    def lengthOfLastWord(s: String): Int = {
        if(s.trim.length == 1) return 1
        s.trim.reverse.zipWithIndex.foreach{case(value, index) => 
            if(value == ' ') return index
            if(index == s.trim.length-1) return index+1
        }
        0
    }
}