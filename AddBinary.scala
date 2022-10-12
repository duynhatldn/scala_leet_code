object Solution {
    def addBinary(a: String, b: String): String = {
        (BigInt.apply(a, 2) + BigInt.apply(b, 2)).toString(2)
    }
}