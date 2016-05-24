package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
    * Exercise 1
    */
  def pascal(c: Int, r: Int): Int = {
    if (r == c || r == 1 || c == 0) {
      return 1
    }
    pascal(c - 1, r - 1) + pascal(c, r - 1);
  }


  /**
    * Exercise 2
    */
  def balance(chars: List[Char]): Boolean = {
    def balanceRecursive(chars: List[Char], count: Int): Boolean = {
      if (chars.nonEmpty) {
        val element = chars.head;
        if (element.equals('(')) {
          return balanceRecursive(chars.tail, count + 1);
        }
        else {
          if (element.equals(')')) {
            if (count > 0) {
              return balanceRecursive(chars.tail, count - 1);
            }
            else return false;
          }
          else return balanceRecursive(chars.tail, count);
        }
      }
      return true;
    }
    return balanceRecursive(chars, 0);
  }

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = {
    def countChangeUsingOneDenomiationRecurively(money: Int, coins: List[Int]): Int = {
      if (!coins.isEmpty) {
        val coin = coins.head;
        if (money % coin == 0) {
          val result: Int = countChange(money, coins.tail) + 1;
          println(result);
          return result;
        }
        return 0;
      }
      return 0;

    }
    def countChangeUsingDenomiationCombinationRecursively(money: Int, coins: List[Int]): Int = {
      0
    }
    return countChangeUsingOneDenomiationRecurively(money, coins) +
    countChangeUsingDenomiationCombinationRecursively(money, coins);
  }
}
