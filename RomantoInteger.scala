object Solution {
    def romanToInt(s: String): Int = {
        var A:Map[Char,Int] = Map('I' -> 1, 'V' -> 5, 'X' -> 10, 'L' -> 50, 'C' -> 100, 'D' -> 500, 'M' -> 1000)
        var sList = s.reverse.map(item => A(item)).toList
        var result = 0
        for(i <- 0 until sList.size - 1)
            {
                if(sList(i) > sList(i+1))
                {
                    result += sList(i) - sList(i+1) - sList(i+1)
                } else result += sList(i)
            }
        result+=sList(sList.size-1)
        result 
    }
}