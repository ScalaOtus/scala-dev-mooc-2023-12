import module1.threads.{Thread1, getRatesLocation1, getRatesLocation2, getRatesLocation3, getRatesLocation4, getRatesLocation5, getRatesLocation6, getRatesLocation7, getRatesLocation8, printRunningTime}
import module1.{future, hof, threads, type_system}
import collections.task_collections._

import scala.collection.mutable
import scala.concurrent.ExecutionContext
import scala.util.{Failure, Success}


object Main {

  def main(args: Array[String]): Unit = {
    println(capitalizeIgnoringASCII(List("Lorem", "ipsum" ,"dolor", "sit", "amet")))
    println(capitalizeIgnoringASCII(List("Оказывается", ",", "ЗвУк", "КЛАВИШЬ", "печатной", "Машинки", "не", "СТАЛ", "ограничивающим", "фактором")))
    println(numbersToNumericString("Scala is 1 of the most expressive programming languages."))
    println(numbersToNumericString("0 1 2 3 4"))

    val dealerOne = List(Auto("mark1", "model1"), Auto("mark2", "model2"), Auto("mark3", "model3"))
    val dealerTwo = List(Auto("mark1", "model1"), Auto("mark4", "model4"), Auto("mark5", "model5"))
    println(intersectionAuto(dealerOne, dealerTwo))
    println(filterAllLeftDealerAutoWithoutRight(dealerOne, dealerTwo))

  }

}
