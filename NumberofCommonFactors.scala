object Solution {
  def commonFactors(a: Int, b: Int): Int = {
    var result: Int = 0;
    val min: Int = (a).min(b);
    for (
      c <- 1 to min / 2
      if (a % c == 0 && b % c == 0)
    ) {
      result = result + 1;
    }
    if ((a).max(b) % (a).min(b) == 0) result = result + 1;
    result
  }
}
