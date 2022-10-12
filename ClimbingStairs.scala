object Solution {
    def fib(a: Int, b: Int): Stream[Int] = {
        a #:: fib(b, a + b)
    }
    def climbStairs(n: Int): Int = {
        fib(1, 2).take(n).last
    }
}