object Fizzbuzz extends App {

  def label(x: Int): Option[(Int, String)] = (x % 3, x % 5) match {
    case (0, 0) => Some((x, "fizzbuzz"))
    case (0, _) => Some((x, "fizz"))
    case (_, 0) => Some((x, "buzz"))
    case _ => None
  }

  def fizzbuzz(begin: Int, end: Int) = (begin to end).flatMap(label)

  fizzbuzz(0, 99).foreach(t => println(t))
}
