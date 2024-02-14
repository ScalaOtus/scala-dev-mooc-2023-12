package monad

import monad.LazyMonad.Lazy

object for_comprehension {

  def main(args: Array[String]): Unit = {
    val result: Wrap[Int] = NonEmptyWrap(10)

    val r1 = for {
      res <- result
    } yield res
    println(r1)

    val anotherResult: Wrap[Int] = NonEmptyWrap(100)

    val r2 =for {
      res <- result
      another <- anotherResult
    } yield res + another
    println(r2)

    val r3 = for {
      res <- result
      another <- anotherResult
      if res > 10
    } yield res + another
    println(r3)


    val resultLazy: Lazy[Int] = for {
      first <- Lazy({println("lazy eval 1"); 1})
      second <- Lazy(2)
      third <- Lazy(3)
    } yield first + second + third

    println(resultLazy.get)
  }

}