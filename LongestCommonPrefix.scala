object Solution {
    def longestCommonPrefix(strs: Array[String]): String = {
        var resulf = ""
        strs(0).zipWithIndex.foreach{
            case(value, index) => 
            var check = strs.map(iteam =>            
                if(iteam.size == index) return resulf else if (iteam.charAt(index) != value) return resulf else 1).toList.sum
            if(check == strs.size) resulf = resulf + value
        }
        resulf
    }
}