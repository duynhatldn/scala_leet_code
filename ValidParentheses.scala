object Solution {
    def isValid(s: String): Boolean = {
        val check = Array("()", "[]", "{}")
        s.foldLeft(List[Char]()){(a,v) => a match {
            case x :: xs if (check.contains("" + x + v)) => xs
            case _ => v +: a
        }}.isEmpty
    }
}