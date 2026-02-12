package com.rockthejvm

object Basics extends App {
    //defining a value
    val meaningOfLife: Int = 42 //Val is a const (const int meaningOfLife = 42);

    //Types don't have to be defined explicitly
    val aBoolean = false

  //Int, Boolean, Char, Double, Float, String

  val aString = "I love Scala"
  val aComposedString = "I" + " " + "love" + " " + "Scala"
  val anInterpolatedString = s"The meaning of life is $meaningOfLife"

  //expressions = structures that can be reduced to a value
  val anExpression = 2 + 3

  //if-expression
  val ifExpression = if (meaningOfLife > 43) 56 else 999
  val chainedIfExpression =
    if (meaningOfLife > 43) 56
    else if (meaningOfLife < 0) -2
    else if (meaningOfLife>999) 78
    else 0
  //code blocks
  val aCodeblock = {
    //definitions
    val aLocalValue = 67

    //Value of the entire block is the last value in the code block
    aLocalValue + 3
  }


  //defining a function
  def myFunction(x: Int, y:String): String =
  { y + " " + x
  }

  //recursive functions
  def factorial (n:Int): Int =
    if (n <= 1) 1
    else n * factorial(n-1)

  //In scala we don't use loops or iterations we use recursion

  //the Unit type = no meaningful value === "void" in other languages
  // type of SIDE EFFECTS
  println("I love Scala")

  def myUnitReturningFunction(): Unit = {
    println("I don't love returning Unit")
  }


  val theUnit = ()
}
